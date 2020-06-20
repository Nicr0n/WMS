package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.UserRoleKey;
import org.springframework.stereotype.Component;

@Component("UserRoleMapper")
public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);
}