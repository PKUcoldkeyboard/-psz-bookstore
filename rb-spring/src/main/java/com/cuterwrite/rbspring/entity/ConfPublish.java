package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class ConfPublish implements Serializable {
    /**
     * 会议论文发表情况id
     */
    private Integer confpubId;

    /**
     * 会议编号
     */
    private Integer confId;

    /**
     * 发表者姓名
     */
    private String confpubName;

    /**
     * 发表者年级
     */
    private String confpubGrade;

    /**
     * 发表年份
     */
    private Date confpubYear;

    /**
     * 发表篇数
     */
    private Short confpubNum;

    private static final long serialVersionUID = 1L;

    public Integer getConfpubId() {
        return confpubId;
    }

    public void setConfpubId(Integer confpubId) {
        this.confpubId = confpubId;
    }

    public Integer getConfId() {
        return confId;
    }

    public void setConfId(Integer confId) {
        this.confId = confId;
    }

    public String getConfpubName() {
        return confpubName;
    }

    public void setConfpubName(String confpubName) {
        this.confpubName = confpubName;
    }

    public String getConfpubGrade() {
        return confpubGrade;
    }

    public void setConfpubGrade(String confpubGrade) {
        this.confpubGrade = confpubGrade;
    }

    public Date getConfpubYear() {
        return confpubYear;
    }

    public void setConfpubYear(Date confpubYear) {
        this.confpubYear = confpubYear;
    }

    public Short getConfpubNum() {
        return confpubNum;
    }

    public void setConfpubNum(Short confpubNum) {
        this.confpubNum = confpubNum;
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
        ConfPublish other = (ConfPublish) that;
        return (this.getConfpubId() == null ? other.getConfpubId() == null : this.getConfpubId().equals(other.getConfpubId()))
            && (this.getConfId() == null ? other.getConfId() == null : this.getConfId().equals(other.getConfId()))
            && (this.getConfpubName() == null ? other.getConfpubName() == null : this.getConfpubName().equals(other.getConfpubName()))
            && (this.getConfpubGrade() == null ? other.getConfpubGrade() == null : this.getConfpubGrade().equals(other.getConfpubGrade()))
            && (this.getConfpubYear() == null ? other.getConfpubYear() == null : this.getConfpubYear().equals(other.getConfpubYear()))
            && (this.getConfpubNum() == null ? other.getConfpubNum() == null : this.getConfpubNum().equals(other.getConfpubNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConfpubId() == null) ? 0 : getConfpubId().hashCode());
        result = prime * result + ((getConfId() == null) ? 0 : getConfId().hashCode());
        result = prime * result + ((getConfpubName() == null) ? 0 : getConfpubName().hashCode());
        result = prime * result + ((getConfpubGrade() == null) ? 0 : getConfpubGrade().hashCode());
        result = prime * result + ((getConfpubYear() == null) ? 0 : getConfpubYear().hashCode());
        result = prime * result + ((getConfpubNum() == null) ? 0 : getConfpubNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", confpubId=").append(confpubId);
        sb.append(", confId=").append(confId);
        sb.append(", confpubName=").append(confpubName);
        sb.append(", confpubGrade=").append(confpubGrade);
        sb.append(", confpubYear=").append(confpubYear);
        sb.append(", confpubNum=").append(confpubNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}