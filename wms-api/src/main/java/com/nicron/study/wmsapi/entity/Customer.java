package com.nicron.study.wmsapi.entity;

public class Customer {
    private Integer customerId;

    private String name;

    private String tel;

    private String email;

    private String adress;

    private Integer managerId;

    public Customer(Integer customerId, String name, String tel, String email, String adress, Integer managerId) {
        this.customerId = customerId;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.adress = adress;
        this.managerId = managerId;
    }

    public Customer() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}