package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Token;
import org.springframework.stereotype.Component;

@Component(value = "TokenMapper")
public interface TokenMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Integer userId);

    Token selectByToken(String token);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}