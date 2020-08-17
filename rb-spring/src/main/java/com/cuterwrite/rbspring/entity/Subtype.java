package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Subtype implements Serializable {
    /**
     * 会议投稿类型编号
     */
    private Integer subtId;

    /**
     * 会议编号
     */
    private Integer confId;

    /**
     * 会议投稿类型
     */
    private String subtName;

    /**
     * 相应类型的会议投稿指南
     */
    private String subtSubmissionGuide;

    /**
     * 时区
     */
    private String subtTimeZone;

    private static final long serialVersionUID = 1L;

    public Integer getSubtId() {
        return subtId;
    }

    public void setSubtId(Integer subtId) {
        this.subtId = subtId;
    }

    public Integer getConfId() {
        return confId;
    }

    public void setConfId(Integer confId) {
        this.confId = confId;
    }

    public String getSubtName() {
        return subtName;
    }

    public void setSubtName(String subtName) {
        this.subtName = subtName;
    }

    public String getSubtSubmissionGuide() {
        return subtSubmissionGuide;
    }

    public void setSubtSubmissionGuide(String subtSubmissionGuide) {
        this.subtSubmissionGuide = subtSubmissionGuide;
    }

    public String getSubtTimeZone() {
        return subtTimeZone;
    }

    public void setSubtTimeZone(String subtTimeZone) {
        this.subtTimeZone = subtTimeZone;
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
        Subtype other = (Subtype) that;
        return (this.getSubtId() == null ? other.getSubtId() == null : this.getSubtId().equals(other.getSubtId()))
            && (this.getConfId() == null ? other.getConfId() == null : this.getConfId().equals(other.getConfId()))
            && (this.getSubtName() == null ? other.getSubtName() == null : this.getSubtName().equals(other.getSubtName()))
            && (this.getSubtSubmissionGuide() == null ? other.getSubtSubmissionGuide() == null : this.getSubtSubmissionGuide().equals(other.getSubtSubmissionGuide()))
            && (this.getSubtTimeZone() == null ? other.getSubtTimeZone() == null : this.getSubtTimeZone().equals(other.getSubtTimeZone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubtId() == null) ? 0 : getSubtId().hashCode());
        result = prime * result + ((getConfId() == null) ? 0 : getConfId().hashCode());
        result = prime * result + ((getSubtName() == null) ? 0 : getSubtName().hashCode());
        result = prime * result + ((getSubtSubmissionGuide() == null) ? 0 : getSubtSubmissionGuide().hashCode());
        result = prime * result + ((getSubtTimeZone() == null) ? 0 : getSubtTimeZone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subtId=").append(subtId);
        sb.append(", confId=").append(confId);
        sb.append(", subtName=").append(subtName);
        sb.append(", subtSubmissionGuide=").append(subtSubmissionGuide);
        sb.append(", subtTimeZone=").append(subtTimeZone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}