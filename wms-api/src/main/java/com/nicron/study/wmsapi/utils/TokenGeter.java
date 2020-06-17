package com.nicron.study.wmsapi.utils;

import javax.servlet.http.HttpServletRequest;


public class TokenGeter {
    public static String getRequestToken(HttpServletRequest httpRequest) {

        //从header中获取token
        String token = httpRequest.getHeader("token");
        //如果header中不存在token，则从参数中获取token
        if ("".equals(token)) {
            token = httpRequest.getParameter("token");
        }
        return token;
    }
}
