package com.fx.common.model;

import mybatis.framework.core.model.BaseValueObject;

public class Bank extends BaseValueObject {
    private Integer id;

    private String bankNameEn = "";

    private String bankNameCn = "";

    private int status;

    private String createUser;

    private String createTime;

    private String createIp;

    private String updateUser;

    private String updateTime;

    private String updateIp;

    private int isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankNameEn() {
        return bankNameEn;
    }

    public void setBankNameEn(String bankNameEn) {
        this.bankNameEn = bankNameEn == null ? null : bankNameEn.trim();
    }

    public String getBankNameCn() {
        return bankNameCn;
    }

    public void setBankNameCn(String bankNameCn) {
        this.bankNameCn = bankNameCn == null ? null : bankNameCn.trim();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getUpdateIp() {
        return updateIp;
    }

    public void setUpdateIp(String updateIp) {
        this.updateIp = updateIp == null ? null : updateIp.trim();
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }
}