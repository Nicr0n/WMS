package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class ImportRecord {
    private String recordId;

    private Integer supplierId;

    private Date importTime;

    private Integer warehouseId;

    private String good;

    private Integer number;

    private String description;

    public ImportRecord(String recordId, Integer supplierId, Date importTime, Integer warehouseId, String good, Integer number) {
        this.recordId = recordId;
        this.supplierId = supplierId;
        this.importTime = importTime;
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
    }

    public ImportRecord(String recordId, Integer supplierId, Date importTime, Integer warehouseId, String good, Integer number, String description) {
        this.recordId = recordId;
        this.supplierId = supplierId;
        this.importTime = importTime;
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
        this.description = description;
    }

    public ImportRecord() {
        super();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Date getImportTime() {
        return importTime;
    }

    public void setImportTime(Date importTime) {
        this.importTime = importTime;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}