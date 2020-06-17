package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class Token {
    private Integer userId;

    private Date expireTime;

    private String token;

    private Date updateTime;

    public Token(Integer userId, Date expireTime, String token, Date updateTime) {
        this.userId = userId;
        this.expireTime = expireTime;
        this.token = token;
        this.updateTime = updateTime;
    }

    public Token() {
        
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}