package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.OperationRecord;

public interface OperationRecordMapper {
    int deleteByPrimaryKey(String operationId);

    int insert(OperationRecord record);

    int insertSelective(OperationRecord record);

    OperationRecord selectByPrimaryKey(String operationId);

    int updateByPrimaryKeySelective(OperationRecord record);

    int updateByPrimaryKeyWithBLOBs(OperationRecord record);

    int updateByPrimaryKey(OperationRecord record);
}