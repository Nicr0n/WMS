package com.nicron.study.wmsapi.controller;

import com.nicron.study.wmsapi.entity.User;
import com.nicron.study.wmsapi.service.LoginService;
import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "login",produces = {"application/json;charset=UTF-8"})
    public Result login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        User serviceUser = loginService.findUserByUsername(username);
        //账号不存在、密码错误
        if (user == null || !serviceUser.getPassword().equals(password)) {
            return ResultUtil.error(400,"账号或密码错误");
        } else {
            Result result = ResultUtil.success(loginService.createToken(serviceUser.getUserId()));
            return result;
        }
    }

    @PostMapping(value = "logout",produces = {"application/json;charset=UTF-8"})
    public Result logout(@RequestHeader("token") String token){
        loginService.logout(token);
        Result result = ResultUtil.success();
        result.setCode(200);
        result.setMsg("success");
        return result;
    }
}
