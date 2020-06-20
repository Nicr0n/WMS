package com.nicron.study.wmsapi.controller;

import com.nicron.study.wmsapi.dao.RequestMapper;
import com.nicron.study.wmsapi.entity.Request;
import com.nicron.study.wmsapi.entity.User;
import com.nicron.study.wmsapi.entity.Warehouse;
import com.nicron.study.wmsapi.service.RequestService;
import com.nicron.study.wmsapi.service.WarehouseService;
import com.nicron.study.wmsapi.utils.result.Result;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(value = "/supplier")
@RequiresRoles("supplier")
public class SupplierController {
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    RequestService requestService;

    @ResponseBody
    @PostMapping("/import_request")
    Result importRequest(@RequestBody Request request){
        //生成基本请求信息
        String requestId = UUID.randomUUID().toString();
        Date requestTime = new Date();
        String status = "unhandled";
        String requestType="export";
        //封装
        request.setRequestId(requestId);
        request.setRequestTime(requestTime);
        request.setStatus(status);
        request.setRequestType(requestType);
        return requestService.insertRequest(request);
    }

    @ResponseBody
    @GetMapping("/selectAllWarehouse")
    Result selectAllWarehouse(){
        return warehouseService.selectAllWarehouse();
    }

    @ResponseBody
    @GetMapping("/selectAvailableWarehouse")
    Result selectAvailableWarehouse(){
        return warehouseService.selectAvailableWarehouse();
    }

    @ResponseBody
    @GetMapping("/selectMyRequest")
    Result selectMyRequest(@RequestBody User user){
        return requestService.selectRequestByUserId(user.getUserId());
    }
}
