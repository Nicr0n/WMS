package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class Token {
    private Integer userId;

    private Date expireTime;

    private String toke;

    private Date updateTime;

    public Token(Integer userId, Date expireTime, String toke, Date updateTime) {
        this.userId = userId;
        this.expireTime = expireTime;
        this.toke = toke;
        this.updateTime = updateTime;
    }

    public Token() {
        super();
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

    public String getToke() {
        return toke;
    }

    public void setToke(String toke) {
        this.toke = toke == null ? null : toke.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}