package com.nicron.study.wmsapi.service;

import com.nicron.study.wmsapi.dao.UserMapper;
import com.nicron.study.wmsapi.entity.Token;
import com.nicron.study.wmsapi.entity.User;
import com.nicron.study.wmsapi.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;

public interface LoginService {

    User findUserByUsername(String username);

    Result createToken(Integer userId);

    void logout(String toke);

    Token findByToken(String accessToken);

    User findById(Integer user);
}
