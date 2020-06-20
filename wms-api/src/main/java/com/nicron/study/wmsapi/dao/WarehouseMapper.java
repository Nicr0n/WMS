package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.Warehouse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "WarehouseMapper")
public interface WarehouseMapper {
    int deleteByPrimaryKey(Integer warehouseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Integer warehouseId);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);

    List<Warehouse> selectAllWarehouse();

    List<Warehouse> selectAvailableWarehouse();
}