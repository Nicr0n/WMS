package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.UserInvalid;
import org.springframework.stereotype.Component;

@Component("UserInvalidMapper")
public interface UserInvalidMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInvalid record);

    int insertSelective(UserInvalid record);

    UserInvalid selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInvalid record);

    int updateByPrimaryKey(UserInvalid record);
}