package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class ExportRecord {
    private String exportId;

    private Integer customerId;

    private Date exportTime;

    private Integer warehouseId;

    private String good;

    private Integer number;

    private String description;

    public ExportRecord(String exportId, Integer customerId, Date exportTime, Integer warehouseId, String good, Integer number) {
        this.exportId = exportId;
        this.customerId = customerId;
        this.exportTime = exportTime;
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
    }

    public ExportRecord(String exportId, Integer customerId, Date exportTime, Integer warehouseId, String good, Integer number, String description) {
        this.exportId = exportId;
        this.customerId = customerId;
        this.exportTime = exportTime;
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
        this.description = description;
    }

    public ExportRecord() {
        super();
    }

    public String getExportId() {
        return exportId;
    }

    public void setExportId(String exportId) {
        this.exportId = exportId == null ? null : exportId.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getExportTime() {
        return exportTime;
    }

    public void setExportTime(Date exportTime) {
        this.exportTime = exportTime;
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