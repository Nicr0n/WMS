package com.nicron.study.wmsapi.service.impl;

import com.nicron.study.wmsapi.DTO.RegistrationDTO;
import com.nicron.study.wmsapi.dao.*;
import com.nicron.study.wmsapi.entity.*;
import com.nicron.study.wmsapi.service.LoginService;
import com.nicron.study.wmsapi.utils.EncryptPassword;
import com.nicron.study.wmsapi.utils.TokenGenerator;
import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service(value = "LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenMapper tokenMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserInformationMapper userInformationMapper;
    @Autowired
    private UserInvalidMapper userInvalidMapper;

    @Override
    public User findUserByUsername(String username) {
        User user = userMapper.selectByUsername(username);
        return user;
    }

    //1小时后过期
    private final static int EXPIRE = 3600;

    @Override
    public Map<String, Object> createToken(Integer userId) {
        Map<String, Object> result = new HashMap<>();
        Token token = tokenMapper.selectByPrimaryKey(userId);
        if (token == null) {
            //生成一个token
            String generate_token = TokenGenerator.generateValue();
            //当前时间
            Date now = new Date();
            //过期时间
            Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
            token = new Token();
            token.setUserId(userId);
            token.setUpdateTime(now);
            token.setExpireTime(expireTime);
            token.setToken(generate_token);
            tokenMapper.insert(token);
        } else {
            //生成一个token
            String generate_token = TokenGenerator.generateValue();
            //当前时间
            Date now = new Date();
            //过期时间
            Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
            token = new Token();
            token.setUserId(userId);
            token.setUpdateTime(now);
            token.setExpireTime(expireTime);
            token.setToken(generate_token);
            tokenMapper.updateByPrimaryKey(token);
        }
        result.put("token", token);
        result.put("expire", EXPIRE);
        return result;

    }

    @Override
    public void logout(String token) {
        Token byToken = findByToken(token);
        //生成一个新的Token
        token = TokenGenerator.generateValue();
        //修改token
        Token newToken = new Token();
        newToken.setUserId(byToken.getUserId());
        newToken.setToken(token);
        tokenMapper.updateByPrimaryKeySelective(newToken);
    }

    @Override
    public Result getUserInfo(Token token) {
        Token byToken = findByToken(token.getToken());
        User user = findByIdWithRole(byToken.getUserId());
        Iterator<Role> it = user.getRoles().iterator();
        while (it.hasNext()){
            Role role = it.next();
            role = findByRoleIdWithPermission(role.getRoleId());
        }
        if (user!=null){
            Result result =ResultUtil.success();
            result.setCode(200);
            result.setMsg("成功");
            result.setData(user);
            return result;
        }else {
            return ResultUtil.error(400,"失败");
        }
    }

    @Override
    public Token findByToken(String accessToken) {
        return tokenMapper.selectByToken(accessToken);
    }

    @Override
    public User findById(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public User findByIdWithRole(Integer userid) {
        return userMapper.selectByUserIdWithRoles(userid);
    }

    @Override
    public Role findByRoleIdWithPermission(Integer roleid) {
        return roleMapper.selectByRoleIdWithPermission(roleid);
    }

    @Override
    public Result registration(RegistrationDTO registrationDTO) {
        User user = registrationDTO.getUser();
        UserInformation userInformation = registrationDTO.getUserInformation();
        String identity = registrationDTO.getIdentity();
        //密码加盐
        String password = user.getPassword();
        String[] cipher_salt = EncryptPassword.encryptPassword(password);
        String salt = cipher_salt[0];
        String cipher = cipher_salt[1];
        user.setPassword(cipher);
        user.setSalt(salt);
        userMapper.insert(user);
        Integer userId = user.getUserId();
        if (userId == null) {
            return ResultUtil.error(201, "注册失败");
        } else {
            userInformation.setUserId(userId);
            userInformation.setRegistrationTime(new Date());
            userInformationMapper.insert(userInformation);
            userInvalidMapper.insert(new UserInvalid(userId, identity));
            Result result = ResultUtil.success();
            result.setCode(200);
            result.setMsg("注册成功");
            return result;
        }
    }
}
