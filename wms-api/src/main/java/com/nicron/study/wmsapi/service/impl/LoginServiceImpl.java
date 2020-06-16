package com.nicron.study.wmsapi.service.impl;

import com.nicron.study.wmsapi.dao.TokenMapper;
import com.nicron.study.wmsapi.dao.UserMapper;
import com.nicron.study.wmsapi.entity.Token;
import com.nicron.study.wmsapi.entity.User;
import com.nicron.study.wmsapi.service.LoginService;
import com.nicron.study.wmsapi.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenMapper tokenMapper;

    @Override
    public User findUserByUsername(String username) {
        User user = userMapper.selectByUsername(username);
        return user;
    }

    //1小时后过期
    private final static int EXPIRE = 3600;

    @Override
    public Result createToken(Integer userId) {
        Token token = tokenMapper.selectByPrimaryKey(userId);
        if(token==null){
            //生成一个token
            //当前时间
            Date now = new Date();
            //过期时间
            Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
        }
        return null;
    }

    @Override
    public void logout(String toke) {

    }

    @Override
    public Token findByToken(String accessToken) {
        return null;
    }

    @Override
    public User findById(Integer user) {
        return null;
    }
}
