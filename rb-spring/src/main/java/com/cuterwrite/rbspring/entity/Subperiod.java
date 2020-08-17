package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Subperiod implements Serializable {
    /**
     * 会议投稿类型的阶段编号
     */
    private Integer subpId;

    /**
     * 会议投稿类型编号
     */
    private Integer subtId;

    /**
     * 会议投稿类型的阶段
     */
    private String subpName;

    /**
     * 会议投稿类型的阶段的截止日期
     */
    private Date subpDate;

    private static final long serialVersionUID = 1L;

    public Integer getSubpId() {
        return subpId;
    }

    public void setSubpId(Integer subpId) {
        this.subpId = subpId;
    }

    public Integer getSubtId() {
        return subtId;
    }

    public void setSubtId(Integer subtId) {
        this.subtId = subtId;
    }

    public String getSubpName() {
        return subpName;
    }

    public void setSubpName(String subpName) {
        this.subpName = subpName;
    }

    public Date getSubpDate() {
        return subpDate;
    }

    public void setSubpDate(Date subpDate) {
        this.subpDate = subpDate;
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
        Subperiod other = (Subperiod) that;
        return (this.getSubpId() == null ? other.getSubpId() == null : this.getSubpId().equals(other.getSubpId()))
            && (this.getSubtId() == null ? other.getSubtId() == null : this.getSubtId().equals(other.getSubtId()))
            && (this.getSubpName() == null ? other.getSubpName() == null : this.getSubpName().equals(other.getSubpName()))
            && (this.getSubpDate() == null ? other.getSubpDate() == null : this.getSubpDate().equals(other.getSubpDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubpId() == null) ? 0 : getSubpId().hashCode());
        result = prime * result + ((getSubtId() == null) ? 0 : getSubtId().hashCode());
        result = prime * result + ((getSubpName() == null) ? 0 : getSubpName().hashCode());
        result = prime * result + ((getSubpDate() == null) ? 0 : getSubpDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subpId=").append(subpId);
        sb.append(", subtId=").append(subtId);
        sb.append(", subpName=").append(subpName);
        sb.append(", subpDate=").append(subpDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}