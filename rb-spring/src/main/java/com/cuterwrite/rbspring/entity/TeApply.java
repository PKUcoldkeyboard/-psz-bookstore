package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class TeApply extends TeApplyKey implements Serializable {
    private Date teapDate;

    /**
     * 查看情况，1为已查看，0为未查看
     */
    private Boolean teapCondition;

    /**
     * 申请人学号
     */
    private String stuId;

    /**
     * 申请人姓名
     */
    private String stuName;

    private static final long serialVersionUID = 1L;

    public Date getTeapDate() {
        return teapDate;
    }

    public void setTeapDate(Date teapDate) {
        this.teapDate = teapDate;
    }

    public Boolean getTeapCondition() {
        return teapCondition;
    }

    public void setTeapCondition(Boolean teapCondition) {
        this.teapCondition = teapCondition;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
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
        TeApply other = (TeApply) that;
        return (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getTeapDate() == null ? other.getTeapDate() == null : this.getTeapDate().equals(other.getTeapDate()))
            && (this.getTeapCondition() == null ? other.getTeapCondition() == null : this.getTeapCondition().equals(other.getTeapCondition()))
            && (this.getStuId() == null ? other.getStuId() == null : this.getStuId().equals(other.getStuId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getTeapDate() == null) ? 0 : getTeapDate().hashCode());
        result = prime * result + ((getTeapCondition() == null) ? 0 : getTeapCondition().hashCode());
        result = prime * result + ((getStuId() == null) ? 0 : getStuId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teapDate=").append(teapDate);
        sb.append(", teapCondition=").append(teapCondition);
        sb.append(", stuId=").append(stuId);
        sb.append(", stuName=").append(stuName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}