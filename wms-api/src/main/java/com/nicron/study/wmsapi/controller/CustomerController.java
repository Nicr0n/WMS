package com.nicron.study.wmsapi.controller;

import com.nicron.study.wmsapi.entity.GoodStorage;
import com.nicron.study.wmsapi.entity.Request;
import com.nicron.study.wmsapi.service.CustomerService;
import com.nicron.study.wmsapi.service.RequestService;
import com.nicron.study.wmsapi.utils.result.Result;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
@RequiresRoles("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    RequestService requestService;

    @ResponseBody
    @PostMapping("/export_request")
    Result exportRequest(@RequestBody Request request){
        //生成基本请求信息
        String requestId = UUID.randomUUID().toString();
        Date requestTime = new Date();
        String status = "unhandled";
        String requestType="import";
        //封装
        request.setRequestId(requestId);
        request.setRequestTime(requestTime);
        request.setStatus(status);
        request.setRequestType(requestType);
        return requestService.insertRequest(request);
    }

    @ResponseBody
    @GetMapping("/selectAllStorage")
    Result selectAllStorage(){
        return customerService.selectAllStorage();
    }

    @ResponseBody
    @GetMapping("/selectStorageByGoodsName")
    Result selectStorageByGoodsName(@RequestBody GoodStorage goodStorage){
        return customerService.selectStorageByGoodsName(goodStorage.getGood());
    }
}
