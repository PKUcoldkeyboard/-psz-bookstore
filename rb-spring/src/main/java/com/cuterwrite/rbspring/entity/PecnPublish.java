package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class PecnPublish implements Serializable {
    /**
     * 中文期刊发表情况id
     */
    private Integer pecnpubId;

    /**
     * 中文期刊编号
     */
    private Integer pecnId;

    /**
     * 发表者姓名
     */
    private String pecnpubName;

    /**
     * 发表者年级
     */
    private String pecnpubGrade;

    /**
     * 发表年份
     */
    private Date pecnpubYear;

    /**
     * 发表篇数
     */
    private Short pecnpubNum;

    private static final long serialVersionUID = 1L;

    public Integer getPecnpubId() {
        return pecnpubId;
    }

    public void setPecnpubId(Integer pecnpubId) {
        this.pecnpubId = pecnpubId;
    }

    public Integer getPecnId() {
        return pecnId;
    }

    public void setPecnId(Integer pecnId) {
        this.pecnId = pecnId;
    }

    public String getPecnpubName() {
        return pecnpubName;
    }

    public void setPecnpubName(String pecnpubName) {
        this.pecnpubName = pecnpubName;
    }

    public String getPecnpubGrade() {
        return pecnpubGrade;
    }

    public void setPecnpubGrade(String pecnpubGrade) {
        this.pecnpubGrade = pecnpubGrade;
    }

    public Date getPecnpubYear() {
        return pecnpubYear;
    }

    public void setPecnpubYear(Date pecnpubYear) {
        this.pecnpubYear = pecnpubYear;
    }

    public Short getPecnpubNum() {
        return pecnpubNum;
    }

    public void setPecnpubNum(Short pecnpubNum) {
        this.pecnpubNum = pecnpubNum;
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
        PecnPublish other = (PecnPublish) that;
        return (this.getPecnpubId() == null ? other.getPecnpubId() == null : this.getPecnpubId().equals(other.getPecnpubId()))
            && (this.getPecnId() == null ? other.getPecnId() == null : this.getPecnId().equals(other.getPecnId()))
            && (this.getPecnpubName() == null ? other.getPecnpubName() == null : this.getPecnpubName().equals(other.getPecnpubName()))
            && (this.getPecnpubGrade() == null ? other.getPecnpubGrade() == null : this.getPecnpubGrade().equals(other.getPecnpubGrade()))
            && (this.getPecnpubYear() == null ? other.getPecnpubYear() == null : this.getPecnpubYear().equals(other.getPecnpubYear()))
            && (this.getPecnpubNum() == null ? other.getPecnpubNum() == null : this.getPecnpubNum().equals(other.getPecnpubNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPecnpubId() == null) ? 0 : getPecnpubId().hashCode());
        result = prime * result + ((getPecnId() == null) ? 0 : getPecnId().hashCode());
        result = prime * result + ((getPecnpubName() == null) ? 0 : getPecnpubName().hashCode());
        result = prime * result + ((getPecnpubGrade() == null) ? 0 : getPecnpubGrade().hashCode());
        result = prime * result + ((getPecnpubYear() == null) ? 0 : getPecnpubYear().hashCode());
        result = prime * result + ((getPecnpubNum() == null) ? 0 : getPecnpubNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pecnpubId=").append(pecnpubId);
        sb.append(", pecnId=").append(pecnId);
        sb.append(", pecnpubName=").append(pecnpubName);
        sb.append(", pecnpubGrade=").append(pecnpubGrade);
        sb.append(", pecnpubYear=").append(pecnpubYear);
        sb.append(", pecnpubNum=").append(pecnpubNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}