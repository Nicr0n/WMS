package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Request;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "RequestMapper")
public interface RequestMapper {
    int deleteByPrimaryKey(String requestId);

    int insert(Request record);

    int insertSelective(Request record);

    Request selectByPrimaryKey(String requestId);

    List<Request> selectAllRequest();

    List<Request> selectRequestByUserId(Integer userId);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKeyWithBLOBs(Request record);

    int updateByPrimaryKey(Request record);
}