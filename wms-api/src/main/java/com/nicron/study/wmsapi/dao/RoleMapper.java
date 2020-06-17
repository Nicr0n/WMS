package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Role;
import org.springframework.stereotype.Component;

@Component(value = "RoleMapper")
public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleId);

    Role selectByRoleIdWithPermission(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}