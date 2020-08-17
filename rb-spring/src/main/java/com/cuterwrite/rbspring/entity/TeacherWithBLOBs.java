package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class TeacherWithBLOBs extends Teacher implements Serializable {
    /**
     * 研究方向
     */
    private String teField;

    /**
     * 现有课题
     */
    private String teTopic;

    /**
     * 学生要求
     */
    private String teRequirements;

    /**
     * 学生负责人
     */
    private String teStudent;

    private static final long serialVersionUID = 1L;

    public String getTeField() {
        return teField;
    }

    public void setTeField(String teField) {
        this.teField = teField;
    }

    public String getTeTopic() {
        return teTopic;
    }

    public void setTeTopic(String teTopic) {
        this.teTopic = teTopic;
    }

    public String getTeRequirements() {
        return teRequirements;
    }

    public void setTeRequirements(String teRequirements) {
        this.teRequirements = teRequirements;
    }

    public String getTeStudent() {
        return teStudent;
    }

    public void setTeStudent(String teStudent) {
        this.teStudent = teStudent;
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
        TeacherWithBLOBs other = (TeacherWithBLOBs) that;
        return (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getTeName() == null ? other.getTeName() == null : this.getTeName().equals(other.getTeName()))
            && (this.getTeInitial() == null ? other.getTeInitial() == null : this.getTeInitial().equals(other.getTeInitial()))
            && (this.getTeTitle() == null ? other.getTeTitle() == null : this.getTeTitle().equals(other.getTeTitle()))
            && (this.getTeSection() == null ? other.getTeSection() == null : this.getTeSection().equals(other.getTeSection()))
            && (this.getTeContact() == null ? other.getTeContact() == null : this.getTeContact().equals(other.getTeContact()))
            && (this.getTeQuotaTot() == null ? other.getTeQuotaTot() == null : this.getTeQuotaTot().equals(other.getTeQuotaTot()))
            && (this.getTeIntentionTot() == null ? other.getTeIntentionTot() == null : this.getTeIntentionTot().equals(other.getTeIntentionTot()))
            && (this.getTeField() == null ? other.getTeField() == null : this.getTeField().equals(other.getTeField()))
            && (this.getTeTopic() == null ? other.getTeTopic() == null : this.getTeTopic().equals(other.getTeTopic()))
            && (this.getTeRequirements() == null ? other.getTeRequirements() == null : this.getTeRequirements().equals(other.getTeRequirements()))
            && (this.getTeStudent() == null ? other.getTeStudent() == null : this.getTeStudent().equals(other.getTeStudent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getTeName() == null) ? 0 : getTeName().hashCode());
        result = prime * result + ((getTeInitial() == null) ? 0 : getTeInitial().hashCode());
        result = prime * result + ((getTeTitle() == null) ? 0 : getTeTitle().hashCode());
        result = prime * result + ((getTeSection() == null) ? 0 : getTeSection().hashCode());
        result = prime * result + ((getTeContact() == null) ? 0 : getTeContact().hashCode());
        result = prime * result + ((getTeQuotaTot() == null) ? 0 : getTeQuotaTot().hashCode());
        result = prime * result + ((getTeIntentionTot() == null) ? 0 : getTeIntentionTot().hashCode());
        result = prime * result + ((getTeField() == null) ? 0 : getTeField().hashCode());
        result = prime * result + ((getTeTopic() == null) ? 0 : getTeTopic().hashCode());
        result = prime * result + ((getTeRequirements() == null) ? 0 : getTeRequirements().hashCode());
        result = prime * result + ((getTeStudent() == null) ? 0 : getTeStudent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teField=").append(teField);
        sb.append(", teTopic=").append(teTopic);
        sb.append(", teRequirements=").append(teRequirements);
        sb.append(", teStudent=").append(teStudent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}