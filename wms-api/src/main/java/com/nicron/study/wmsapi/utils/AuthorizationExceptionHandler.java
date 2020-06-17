package com.nicron.study.wmsapi.utils;

import com.nicron.study.wmsapi.utils.result.Result;
import com.nicron.study.wmsapi.utils.result.ResultUtil;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AuthorizationExceptionHandler {

    @ExceptionHandler(value = AuthorizationException.class)
    @ResponseBody
    public Result handleAuthorizationException(AuthorizationException e){
        String message = e.getMessage();
        String msg=message.substring(message.indexOf("[")+1,message.indexOf("]"));
        if (message.contains("role")){
            return ResultUtil.error(400,"对不起,您没有"+msg+"角色");
        }else if (message.contains("permission")){
            return ResultUtil.error(400,"对不起,您没有"+msg+"权限");
        }else return ResultUtil.error(400,"对不起,您的权限有误");
    }
}
