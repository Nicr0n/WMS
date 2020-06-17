package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.User;
import org.springframework.stereotype.Component;

@Component(value = "UserMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByUsername(String username);

    User selectByUserIdWithRoles(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}