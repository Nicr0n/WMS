package com.nicron.study.wmsapi.entity;

public class GoodStorage {
    private Integer warehouseId;

    private String good;

    private Integer number;

    public GoodStorage(Integer warehouseId, String good, Integer number) {
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
    }

    public GoodStorage() {
        super();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good == null ? null : good.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}