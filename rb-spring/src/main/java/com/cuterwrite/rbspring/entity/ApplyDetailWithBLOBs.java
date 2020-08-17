package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class ApplyDetailWithBLOBs extends ApplyDetail implements Serializable {
    /**
     * 技能
     */
    private String applySkill;

    /**
     * 已修相关专业课
     */
    private String applyMajorCourse;

    /**
     * 已修相关数学课
     */
    private String applyMathCourse;

    /**
     * 已修相关编程课
     */
    private String applyCodeCourse;

    /**
     * 申请理由
     */
    private String applyReason;

    /**
     * 自我表述
     */
    private String applySelfIntro;

    /**
     * 兴趣点
     */
    private String applyInterest;

    private static final long serialVersionUID = 1L;

    public String getApplySkill() {
        return applySkill;
    }

    public void setApplySkill(String applySkill) {
        this.applySkill = applySkill;
    }

    public String getApplyMajorCourse() {
        return applyMajorCourse;
    }

    public void setApplyMajorCourse(String applyMajorCourse) {
        this.applyMajorCourse = applyMajorCourse;
    }

    public String getApplyMathCourse() {
        return applyMathCourse;
    }

    public void setApplyMathCourse(String applyMathCourse) {
        this.applyMathCourse = applyMathCourse;
    }

    public String getApplyCodeCourse() {
        return applyCodeCourse;
    }

    public void setApplyCodeCourse(String applyCodeCourse) {
        this.applyCodeCourse = applyCodeCourse;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getApplySelfIntro() {
        return applySelfIntro;
    }

    public void setApplySelfIntro(String applySelfIntro) {
        this.applySelfIntro = applySelfIntro;
    }

    public String getApplyInterest() {
        return applyInterest;
    }

    public void setApplyInterest(String applyInterest) {
        this.applyInterest = applyInterest;
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
        ApplyDetailWithBLOBs other = (ApplyDetailWithBLOBs) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getApplyGender() == null ? other.getApplyGender() == null : this.getApplyGender().equals(other.getApplyGender()))
            && (this.getApplyGrade() == null ? other.getApplyGrade() == null : this.getApplyGrade().equals(other.getApplyGrade()))
            && (this.getApplySubject() == null ? other.getApplySubject() == null : this.getApplySubject().equals(other.getApplySubject()))
            && (this.getApplyGradePoint() == null ? other.getApplyGradePoint() == null : this.getApplyGradePoint().equals(other.getApplyGradePoint()))
            && (this.getApplyMinor() == null ? other.getApplyMinor() == null : this.getApplyMinor().equals(other.getApplyMinor()))
            && (this.getApplySkill() == null ? other.getApplySkill() == null : this.getApplySkill().equals(other.getApplySkill()))
            && (this.getApplyMajorCourse() == null ? other.getApplyMajorCourse() == null : this.getApplyMajorCourse().equals(other.getApplyMajorCourse()))
            && (this.getApplyMathCourse() == null ? other.getApplyMathCourse() == null : this.getApplyMathCourse().equals(other.getApplyMathCourse()))
            && (this.getApplyCodeCourse() == null ? other.getApplyCodeCourse() == null : this.getApplyCodeCourse().equals(other.getApplyCodeCourse()))
            && (this.getApplyReason() == null ? other.getApplyReason() == null : this.getApplyReason().equals(other.getApplyReason()))
            && (this.getApplySelfIntro() == null ? other.getApplySelfIntro() == null : this.getApplySelfIntro().equals(other.getApplySelfIntro()))
            && (this.getApplyInterest() == null ? other.getApplyInterest() == null : this.getApplyInterest().equals(other.getApplyInterest()));
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
        result = prime * result + ((getApplySkill() == null) ? 0 : getApplySkill().hashCode());
        result = prime * result + ((getApplyMajorCourse() == null) ? 0 : getApplyMajorCourse().hashCode());
        result = prime * result + ((getApplyMathCourse() == null) ? 0 : getApplyMathCourse().hashCode());
        result = prime * result + ((getApplyCodeCourse() == null) ? 0 : getApplyCodeCourse().hashCode());
        result = prime * result + ((getApplyReason() == null) ? 0 : getApplyReason().hashCode());
        result = prime * result + ((getApplySelfIntro() == null) ? 0 : getApplySelfIntro().hashCode());
        result = prime * result + ((getApplyInterest() == null) ? 0 : getApplyInterest().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applySkill=").append(applySkill);
        sb.append(", applyMajorCourse=").append(applyMajorCourse);
        sb.append(", applyMathCourse=").append(applyMathCourse);
        sb.append(", applyCodeCourse=").append(applyCodeCourse);
        sb.append(", applyReason=").append(applyReason);
        sb.append(", applySelfIntro=").append(applySelfIntro);
        sb.append(", applyInterest=").append(applyInterest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}