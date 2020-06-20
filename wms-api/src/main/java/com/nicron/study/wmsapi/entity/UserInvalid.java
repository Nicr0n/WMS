package com.nicron.study.wmsapi.entity;

public class UserInvalid {
    private Integer userId;

    private String identity;

    public UserInvalid(Integer userId, String identity) {
        this.userId = userId;
        this.identity = identity;
    }

    public UserInvalid() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }
}