package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.GoodStorage;

public interface GoodStorageMapper {
    int deleteByPrimaryKey(Integer warehouseId);

    int insert(GoodStorage record);

    int insertSelective(GoodStorage record);

    GoodStorage selectByPrimaryKey(Integer warehouseId);

    int updateByPrimaryKeySelective(GoodStorage record);

    int updateByPrimaryKey(GoodStorage record);
}