package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.UserInformation;
import org.springframework.stereotype.Component;

@Component(value = "UserInformationMapper")
public interface UserInformationMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    UserInformation selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);
}