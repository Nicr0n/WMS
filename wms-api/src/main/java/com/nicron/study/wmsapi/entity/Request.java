package com.nicron.study.wmsapi.entity;

import java.util.Date;

public class Request {
    private String requestId;

    private Integer warehouseAdmin;

    private Integer userId;

    private Integer warehouseId;

    private String good;

    private Integer number;

    private String requestType;

    private String status;

    private Date requestTime;

    private Date reservationTime;

    private Date completeTime;

    private String description;

    public Request(String requestId, Integer warehouseAdmin, Integer userId, Integer warehouseId, String good, Integer number, String requestType, String status, Date requestTime, Date reservationTime, Date completeTime) {
        this.requestId = requestId;
        this.warehouseAdmin = warehouseAdmin;
        this.userId = userId;
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
        this.requestType = requestType;
        this.status = status;
        this.requestTime = requestTime;
        this.reservationTime = reservationTime;
        this.completeTime = completeTime;
    }

    public Request(String requestId, Integer warehouseAdmin, Integer userId, Integer warehouseId, String good, Integer number, String requestType, String status, Date requestTime, Date reservationTime, Date completeTime, String description) {
        this.requestId = requestId;
        this.warehouseAdmin = warehouseAdmin;
        this.userId = userId;
        this.warehouseId = warehouseId;
        this.good = good;
        this.number = number;
        this.requestType = requestType;
        this.status = status;
        this.requestTime = requestTime;
        this.reservationTime = reservationTime;
        this.completeTime = completeTime;
        this.description = description;
    }

    public Request() {
        super();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public Integer getWarehouseAdmin() {
        return warehouseAdmin;
    }

    public void setWarehouseAdmin(Integer warehouseAdmin) {
        this.warehouseAdmin = warehouseAdmin;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType == null ? null : requestType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}