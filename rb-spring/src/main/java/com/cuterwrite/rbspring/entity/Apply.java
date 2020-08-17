package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Apply implements Serializable {
    /**
     * 申请编号
     */
    private Integer applyId;

    /**
     * 申请人学号
     */
    private String stuId;

    /**
     * 申请人姓名
     */
    private String stuName;

    /**
     * 教师工号
     */
    private String teId;

    /**
     * 教师姓名
     */
    private String teName;

    /**
     * 申请方向
     */
    private Short applyTopic;

    /**
     * 申请状态：未提交，已提交，已查看
     */
    private String applyCondition;

    /**
     * 申请时间
     */
    private Date applyDate;

    private static final long serialVersionUID = 1L;

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
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

    public Short getApplyTopic() {
        return applyTopic;
    }

    public void setApplyTopic(Short applyTopic) {
        this.applyTopic = applyTopic;
    }

    public String getApplyCondition() {
        return applyCondition;
    }

    public void setApplyCondition(String applyCondition) {
        this.applyCondition = applyCondition;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
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
        Apply other = (Apply) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getStuId() == null ? other.getStuId() == null : this.getStuId().equals(other.getStuId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getTeName() == null ? other.getTeName() == null : this.getTeName().equals(other.getTeName()))
            && (this.getApplyTopic() == null ? other.getApplyTopic() == null : this.getApplyTopic().equals(other.getApplyTopic()))
            && (this.getApplyCondition() == null ? other.getApplyCondition() == null : this.getApplyCondition().equals(other.getApplyCondition()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getStuId() == null) ? 0 : getStuId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getTeName() == null) ? 0 : getTeName().hashCode());
        result = prime * result + ((getApplyTopic() == null) ? 0 : getApplyTopic().hashCode());
        result = prime * result + ((getApplyCondition() == null) ? 0 : getApplyCondition().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", stuId=").append(stuId);
        sb.append(", stuName=").append(stuName);
        sb.append(", teId=").append(teId);
        sb.append(", teName=").append(teName);
        sb.append(", applyTopic=").append(applyTopic);
        sb.append(", applyCondition=").append(applyCondition);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}