package com.nicron.study.wmsapi.entity;

public class Supplier {
    private Integer supplierId;

    private String name;

    private String tel;

    private String adress;

    private String email;

    private Integer managerId;

    public Supplier(Integer supplierId, String name, String tel, String adress, String email, Integer managerId) {
        this.supplierId = supplierId;
        this.name = name;
        this.tel = tel;
        this.adress = adress;
        this.email = email;
        this.managerId = managerId;
    }

    public Supplier() {
        super();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}