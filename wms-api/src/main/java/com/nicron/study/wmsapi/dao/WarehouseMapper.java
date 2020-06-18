package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Warehouse;

public interface WarehouseMapper {
    int deleteByPrimaryKey(Integer warehouseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Integer warehouseId);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}