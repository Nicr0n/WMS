package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class UserInformation {
    private Integer userId;

    private String name;

    private String sex;

    private String tel;

    private String adress;

    private String email;

    private Date registrationTime;

    public UserInformation(Integer userId, String name, String sex, String tel, String adress, String email, Date registrationTime) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.adress = adress;
        this.email = email;
        this.registrationTime = registrationTime;
    }

    public UserInformation() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }
}