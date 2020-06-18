package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.ImportRecord;

public interface ImportRecordMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(ImportRecord record);

    int insertSelective(ImportRecord record);

    ImportRecord selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(ImportRecord record);

    int updateByPrimaryKeyWithBLOBs(ImportRecord record);

    int updateByPrimaryKey(ImportRecord record);
}