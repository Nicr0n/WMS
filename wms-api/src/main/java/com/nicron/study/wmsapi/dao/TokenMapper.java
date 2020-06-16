package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Token;

public interface TokenMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}