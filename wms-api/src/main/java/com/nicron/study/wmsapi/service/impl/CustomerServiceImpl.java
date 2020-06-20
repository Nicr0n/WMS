package com.nicron.study.wmsapi.service.impl;

import com.nicron.study.wmsapi.dao.GoodStorageMapper;
import com.nicron.study.wmsapi.entity.Customer;
import com.nicron.study.wmsapi.entity.GoodStorage;
import com.nicron.study.wmsapi.service.CustomerService;
import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    GoodStorageMapper goodStorageMapper;

    /**
     * 根据商品名称查询
     * @param good 商品名称
     * @return 商品库存列表
     */
    @Override
    public Result selectStorageByGoodsName(String good) {
        return getResult(goodStorageMapper.selectStorageByGoodsName(good));
    }

    @Override
    public Result selectAllStorage() {
        return getResult(goodStorageMapper.selectAllStorage());
    }

    private Result getResult(List<GoodStorage> goodStorage){
        if (goodStorage!=null){
            Result result = ResultUtil.success();
            result.setCode(200);
            result.setMsg("库存查询成功");
            result.setData(goodStorage);
            return result;
        }else {
            return ResultUtil.error(400,"查无库存");
        }
    }
}
