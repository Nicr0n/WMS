package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class OperationRecord {
    private String operationId;

    private Integer userId;

    private String operationName;

    private Date time;

    private String description;

    public OperationRecord(String operationId, Integer userId, String operationName, Date time) {
        this.operationId = operationId;
        this.userId = userId;
        this.operationName = operationName;
        this.time = time;
    }

    public OperationRecord(String operationId, Integer userId, String operationName, Date time, String description) {
        this.operationId = operationId;
        this.userId = userId;
        this.operationName = operationName;
        this.time = time;
        this.description = description;
    }

    public OperationRecord() {
        super();
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId == null ? null : operationId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}