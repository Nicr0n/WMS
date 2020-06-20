package com.nicron.study.wmsapi.service.impl;

import com.nicron.study.wmsapi.dao.RequestMapper;
import com.nicron.study.wmsapi.entity.Request;
import com.nicron.study.wmsapi.service.RequestService;
import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    RequestMapper requestMapper;

    /**
     * 查询所有请求
     * @return 消息+所有请求
     */
    @Override
    public Result selectAllRequest() {
        List<Request> requests = requestMapper.selectAllRequest();
        return getResult(requests);
    }

    /**
     * 新增请求
     * @param request 请求内容
     * @return 消息
     */
    @Override
    public Result insertRequest(Request request) {
        Integer success=requestMapper.insert(request);
        if (success>=1){
            return ResultUtil.success();
        }else {
            return ResultUtil.error(400,"插入失败");
        }
    }

    /**
     * 根据用户ID查找请求
     * @param userId 用户ID
     * @return 该用户的请求
     */
    @Override
    public Result selectRequestByUserId(Integer userId) {
        List<Request> requests = requestMapper.selectRequestByUserId(userId);
        return getResult(requests);
    }

    /**
     * 判断是否含有请求
     * @param requests request集合
     * @return 查询成功与否的消息
     */
    private Result getResult(List<Request> requests) {
        if (requests!=null){
            Result result = ResultUtil.success();
            result.setCode(200);
            result.setMsg("查询成功");
            result.setData(requests);
            return result;
        }else {
            return ResultUtil.error(400,"未找到请求");
        }
    }
}
