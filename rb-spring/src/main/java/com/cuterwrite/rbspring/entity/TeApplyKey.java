package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class TeApplyKey implements Serializable {
    /**
     * 用户账号，仅包含老师，与te_id一致。对应教师的收件箱的“与我相关”栏
     */
    private String userAccount;

    /**
     * 申请编号，对应学生刚提交的申请表
     */
    private Integer applyId;

    private static final long serialVersionUID = 1L;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
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
        TeApplyKey other = (TeApplyKey) that;
        return (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userAccount=").append(userAccount);
        sb.append(", applyId=").append(applyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}