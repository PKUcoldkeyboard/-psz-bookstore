package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class ApplyDetail implements Serializable {
    /**
     * 申请编号
     */
    private Integer applyId;

    /**
     * 性别
     */
    private String applyGender;

    /**
     * 年级
     */
    private String applyGrade;

    /**
     * 专业
     */
    private String applySubject;

    /**
     * 绩点
     */
    private String applyGradePoint;

    /**
     * 辅修/双学位
     */
    private String applyMinor;

    private static final long serialVersionUID = 1L;

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getApplyGender() {
        return applyGender;
    }

    public void setApplyGender(String applyGender) {
        this.applyGender = applyGender;
    }

    public String getApplyGrade() {
        return applyGrade;
    }

    public void setApplyGrade(String applyGrade) {
        this.applyGrade = applyGrade;
    }

    public String getApplySubject() {
        return applySubject;
    }

    public void setApplySubject(String applySubject) {
        this.applySubject = applySubject;
    }

    public String getApplyGradePoint() {
        return applyGradePoint;
    }

    public void setApplyGradePoint(String applyGradePoint) {
        this.applyGradePoint = applyGradePoint;
    }

    public String getApplyMinor() {
        return applyMinor;
    }

    public void setApplyMinor(String applyMinor) {
        this.applyMinor = applyMinor;
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
        ApplyDetail other = (ApplyDetail) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getApplyGender() == null ? other.getApplyGender() == null : this.getApplyGender().equals(other.getApplyGender()))
            && (this.getApplyGrade() == null ? other.getApplyGrade() == null : this.getApplyGrade().equals(other.getApplyGrade()))
            && (this.getApplySubject() == null ? other.getApplySubject() == null : this.getApplySubject().equals(other.getApplySubject()))
            && (this.getApplyGradePoint() == null ? other.getApplyGradePoint() == null : this.getApplyGradePoint().equals(other.getApplyGradePoint()))
            && (this.getApplyMinor() == null ? other.getApplyMinor() == null : this.getApplyMinor().equals(other.getApplyMinor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getApplyGender() == null) ? 0 : getApplyGender().hashCode());
        result = prime * result + ((getApplyGrade() == null) ? 0 : getApplyGrade().hashCode());
        result = prime * result + ((getApplySubject() == null) ? 0 : getApplySubject().hashCode());
        result = prime * result + ((getApplyGradePoint() == null) ? 0 : getApplyGradePoint().hashCode());
        result = prime * result + ((getApplyMinor() == null) ? 0 : getApplyMinor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", applyGender=").append(applyGender);
        sb.append(", applyGrade=").append(applyGrade);
        sb.append(", applySubject=").append(applySubject);
        sb.append(", applyGradePoint=").append(applyGradePoint);
        sb.append(", applyMinor=").append(applyMinor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}