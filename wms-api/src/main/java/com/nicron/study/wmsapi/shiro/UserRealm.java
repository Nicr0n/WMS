package com.nicron.study.wmsapi.shiro;

import com.nicron.study.wmsapi.entity.Permission;
import com.nicron.study.wmsapi.entity.Role;
import com.nicron.study.wmsapi.entity.Token;
import com.nicron.study.wmsapi.entity.User;
import com.nicron.study.wmsapi.service.LoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private LoginService loginService;

    /**
     * 执行授权逻辑
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //从 PrincipalCollection 中来获取登录用户的信息
        User user = (User) principalCollection.getPrimaryPrincipal();
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (Role role : user.getRoles()){
            //添加角色
            simpleAuthorizationInfo.addRole(role.getRoleName());
            for (Permission permission : role.getPermissions()){
                //添加权限
                simpleAuthorizationInfo.addStringPermission(permission.getPermissionName());
            }
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 执行认证逻辑
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取前端传入的Token
        String accessToken = (String) authenticationToken.getPrincipal();
        //根据前端token查询用户信息
        Token token = loginService.findByToken(accessToken);
        //token失效
        if (token == null || token.getExpireTime().getTime() < System.currentTimeMillis()) {
            throw new IncorrectCredentialsException("token失效，请重新登录");
        }
        //调用数据库的方法, 从数据库中查询 username 对应的用户记录
        User user = loginService.findByIdWithRole(token.getUserId());
        Set<Role> roles = user.getRoles();
        Set<Role> newRoles = new HashSet<>();
        //重新封装roles对象
        Iterator<Role> it = roles.iterator();
        while (it.hasNext()){
            Role role = it.next();
            //补充role对象
            role = loginService.findByRoleIdWithPermission(role.getRoleId());
            newRoles.add(role);
        }
        user.setRoles(newRoles);
        //若用户不存在, 则可以抛出 UnknownAccountException 异常
        if (user == null) {
            throw new UnknownAccountException("用户不存在!");
        }
        //根据用户的情况, 来构建 AuthenticationInfo 对象并返回. 通常使用的实现类为: SimpleAuthenticationInfo
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, accessToken, this.getName());
        return info;
    }
}
