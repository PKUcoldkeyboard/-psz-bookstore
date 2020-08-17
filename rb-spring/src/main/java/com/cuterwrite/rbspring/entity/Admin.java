package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Admin implements Serializable {
    /**
     * 管理员账号
     */
    private String adminAccount;

    /**
     * 密码
     */
    private String password;

    /**
     * 非必填，用于描述管理员类型
     */
    private String adminType;

    private static final long serialVersionUID = 1L;

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Admin other = (Admin) that;
        return (this.getAdminAccount() == null ? other.getAdminAccount() == null : this.getAdminAccount().equals(other.getAdminAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAdminType() == null ? other.getAdminType() == null : this.getAdminType().equals(other.getAdminType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAdminType() == null) ? 0 : getAdminType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminAccount=").append(adminAccount);
        sb.append(", password=").append(password);
        sb.append(", adminType=").append(adminType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}