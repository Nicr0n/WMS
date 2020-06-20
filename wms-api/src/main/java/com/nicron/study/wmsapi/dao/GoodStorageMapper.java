package com.nicron.study.wmsapi.dao;

import com.nicron.study.wmsapi.entity.GoodStorage;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "GoodStorageMapper")
public interface GoodStorageMapper {
    int deleteByPrimaryKey(Integer warehouseId);

    int insert(GoodStorage record);

    int insertSelective(GoodStorage record);

    GoodStorage selectByPrimaryKey(Integer warehouseId);

    List<GoodStorage> selectAllStorage();

    List<GoodStorage> selectStorageByGoodsName(String good);

    int updateByPrimaryKeySelective(GoodStorage record);

    int updateByPrimaryKey(GoodStorage record);
}