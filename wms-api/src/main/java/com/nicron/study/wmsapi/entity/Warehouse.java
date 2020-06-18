package com.nicron.study.wmsapi.entity;

public class Warehouse {
    private Integer warehouseId;

    private String name;

    private String status;

    private String adress;

    private String load;

    public Warehouse(Integer warehouseId, String name, String status, String adress, String load) {
        this.warehouseId = warehouseId;
        this.name = name;
        this.status = status;
        this.adress = adress;
        this.load = load;
    }

    public Warehouse() {
        super();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load == null ? null : load.trim();
    }
}