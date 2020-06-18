package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Request;

public interface RequestMapper {
    int deleteByPrimaryKey(String requestId);

    int insert(Request record);

    int insertSelective(Request record);

    Request selectByPrimaryKey(String requestId);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKeyWithBLOBs(Request record);

    int updateByPrimaryKey(Request record);
}