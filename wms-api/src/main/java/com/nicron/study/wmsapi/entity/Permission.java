package com.nicron.study.wmsapi.entity;

public class Permission {
    private Integer permissionId;

    private String permission;

    private String permissionName;

    public Permission(Integer permissionId, String permission, String permissionName) {
        this.permissionId = permissionId;
        this.permission = permission;
        this.permissionName = permissionName;
    }

    public Permission() {
        super();
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }
}