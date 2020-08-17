package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Teacher implements Serializable {
    /**
     * 教师工号
     */
    private String teId;

    /**
     * 教师姓名
     */
    private String teName;

    private String teInitial;

    /**
     * 职称
     */
    private String teTitle;

    /**
     * 所在部门
     */
    private String teSection;

    /**
     * 联系方式
     */
    private String teContact;

    /**
     * 总招生名额
     */
    private Short teQuotaTot;

    /**
     * 总意向人数
     */
    private Short teIntentionTot;

    private static final long serialVersionUID = 1L;

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

    public String getTeInitial() {
        return teInitial;
    }

    public void setTeInitial(String teInitial) {
        this.teInitial = teInitial;
    }

    public String getTeTitle() {
        return teTitle;
    }

    public void setTeTitle(String teTitle) {
        this.teTitle = teTitle;
    }

    public String getTeSection() {
        return teSection;
    }

    public void setTeSection(String teSection) {
        this.teSection = teSection;
    }

    public String getTeContact() {
        return teContact;
    }

    public void setTeContact(String teContact) {
        this.teContact = teContact;
    }

    public Short getTeQuotaTot() {
        return teQuotaTot;
    }

    public void setTeQuotaTot(Short teQuotaTot) {
        this.teQuotaTot = teQuotaTot;
    }

    public Short getTeIntentionTot() {
        return teIntentionTot;
    }

    public void setTeIntentionTot(Short teIntentionTot) {
        this.teIntentionTot = teIntentionTot;
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
        Teacher other = (Teacher) that;
        return (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getTeName() == null ? other.getTeName() == null : this.getTeName().equals(other.getTeName()))
            && (this.getTeInitial() == null ? other.getTeInitial() == null : this.getTeInitial().equals(other.getTeInitial()))
            && (this.getTeTitle() == null ? other.getTeTitle() == null : this.getTeTitle().equals(other.getTeTitle()))
            && (this.getTeSection() == null ? other.getTeSection() == null : this.getTeSection().equals(other.getTeSection()))
            && (this.getTeContact() == null ? other.getTeContact() == null : this.getTeContact().equals(other.getTeContact()))
            && (this.getTeQuotaTot() == null ? other.getTeQuotaTot() == null : this.getTeQuotaTot().equals(other.getTeQuotaTot()))
            && (this.getTeIntentionTot() == null ? other.getTeIntentionTot() == null : this.getTeIntentionTot().equals(other.getTeIntentionTot()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teId=").append(teId);
        sb.append(", teName=").append(teName);
        sb.append(", teInitial=").append(teInitial);
        sb.append(", teTitle=").append(teTitle);
        sb.append(", teSection=").append(teSection);
        sb.append(", teContact=").append(teContact);
        sb.append(", teQuotaTot=").append(teQuotaTot);
        sb.append(", teIntentionTot=").append(teIntentionTot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}