package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class StuApply extends StuApplyKey implements Serializable {
    private Date stapDate;

    /**
     * 查看情况，1为已查看，0为未查看
     */
    private Boolean stapCondition;

    /**
     * 申请导师工号
     */
    private String teId;

    /**
     * 申请导师姓名
     */
    private String teName;

    private static final long serialVersionUID = 1L;

    public Date getStapDate() {
        return stapDate;
    }

    public void setStapDate(Date stapDate) {
        this.stapDate = stapDate;
    }

    public Boolean getStapCondition() {
        return stapCondition;
    }

    public void setStapCondition(Boolean stapCondition) {
        this.stapCondition = stapCondition;
    }

    public String getTeId() {
        return teId;
    }

    public void setTeId(String teId) {
        this.teId = teId;
    }

    public String getTeName() {
        return teName;
    }

    public void setTeName(String teName) {
        this.teName = teName;
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
        StuApply other = (StuApply) that;
        return (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getStapDate() == null ? other.getStapDate() == null : this.getStapDate().equals(other.getStapDate()))
            && (this.getStapCondition() == null ? other.getStapCondition() == null : this.getStapCondition().equals(other.getStapCondition()))
            && (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getTeName() == null ? other.getTeName() == null : this.getTeName().equals(other.getTeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getStapDate() == null) ? 0 : getStapDate().hashCode());
        result = prime * result + ((getStapCondition() == null) ? 0 : getStapCondition().hashCode());
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getTeName() == null) ? 0 : getTeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stapDate=").append(stapDate);
        sb.append(", stapCondition=").append(stapCondition);
        sb.append(", teId=").append(teId);
        sb.append(", teName=").append(teName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}