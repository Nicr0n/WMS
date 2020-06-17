package com.nicron.study.wmsapi.entity;

import java.util.Set;

public class User {
    private Integer userId;

    private String username;

    private String password;

    private String salt;

    private Set<Role> roles;

    public User(Integer userId, String username, String password, String salt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.salt = salt;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}