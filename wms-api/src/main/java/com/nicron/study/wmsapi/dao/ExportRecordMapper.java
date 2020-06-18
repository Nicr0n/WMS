package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.ExportRecord;

public interface ExportRecordMapper {
    int deleteByPrimaryKey(String exportId);

    int insert(ExportRecord record);

    int insertSelective(ExportRecord record);

    ExportRecord selectByPrimaryKey(String exportId);

    int updateByPrimaryKeySelective(ExportRecord record);

    int updateByPrimaryKeyWithBLOBs(ExportRecord record);

    int updateByPrimaryKey(ExportRecord record);
}