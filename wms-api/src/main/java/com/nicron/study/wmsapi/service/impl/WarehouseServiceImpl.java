package com.nicron.study.wmsapi.service.impl;

import com.nicron.study.wmsapi.dao.WarehouseMapper;
import com.nicron.study.wmsapi.entity.Warehouse;
import com.nicron.study.wmsapi.service.WarehouseService;
import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseMapper warehouseMapper;

    /**
     * 查询所有仓库
     * @return 所有仓库
     */
    @Override
    public Result selectAllWarehouse() {
        List<Warehouse> warehouses = warehouseMapper.selectAllWarehouse();
        return getResult(warehouses);
    }

    /**
     * 查询当前可用仓库
     * @return 当前可用仓库
     */
    @Override
    public Result selectAvailableWarehouse() {
        List<Warehouse> warehouses = warehouseMapper.selectAvailableWarehouse();
        return getResult(warehouses);
    }

    /**
     * 判断是否含有warehouse
     * @param warehouses warehouse集合
     * @return 查询成功与否消息
     */
    private Result getResult(List<Warehouse> warehouses){
        if (warehouses!=null){
            Result result = ResultUtil.success();
            result.setCode(200);
            result.setMsg("查询成功");
            result.setData(warehouses);
            return result;
        }else
            return ResultUtil.error(400,"未找到仓库");
    }
}
