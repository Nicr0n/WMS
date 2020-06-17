package com.nicron.study.wmsapi.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

public class AutoToken extends UsernamePasswordToken {
    private String token;

    public AutoToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
