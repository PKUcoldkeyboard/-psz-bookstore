package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class PefoPublish implements Serializable {
    /**
     * 外文期刊发表情况id
     */
    private Integer pefopubId;

    /**
     * 外文期刊编号
     */
    private Integer pefoId;

    /**
     * 发表者姓名
     */
    private String pefopubName;

    /**
     * 发表者年级
     */
    private String pefopubGrade;

    /**
     * 发表年份
     */
    private Date pefopubYear;

    /**
     * 发表篇数
     */
    private Short pefopubNum;

    private static final long serialVersionUID = 1L;

    public Integer getPefopubId() {
        return pefopubId;
    }

    public void setPefopubId(Integer pefopubId) {
        this.pefopubId = pefopubId;
    }

    public Integer getPefoId() {
        return pefoId;
    }

    public void setPefoId(Integer pefoId) {
        this.pefoId = pefoId;
    }

    public String getPefopubName() {
        return pefopubName;
    }

    public void setPefopubName(String pefopubName) {
        this.pefopubName = pefopubName;
    }

    public String getPefopubGrade() {
        return pefopubGrade;
    }

    public void setPefopubGrade(String pefopubGrade) {
        this.pefopubGrade = pefopubGrade;
    }

    public Date getPefopubYear() {
        return pefopubYear;
    }

    public void setPefopubYear(Date pefopubYear) {
        this.pefopubYear = pefopubYear;
    }

    public Short getPefopubNum() {
        return pefopubNum;
    }

    public void setPefopubNum(Short pefopubNum) {
        this.pefopubNum = pefopubNum;
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
        PefoPublish other = (PefoPublish) that;
        return (this.getPefopubId() == null ? other.getPefopubId() == null : this.getPefopubId().equals(other.getPefopubId()))
            && (this.getPefoId() == null ? other.getPefoId() == null : this.getPefoId().equals(other.getPefoId()))
            && (this.getPefopubName() == null ? other.getPefopubName() == null : this.getPefopubName().equals(other.getPefopubName()))
            && (this.getPefopubGrade() == null ? other.getPefopubGrade() == null : this.getPefopubGrade().equals(other.getPefopubGrade()))
            && (this.getPefopubYear() == null ? other.getPefopubYear() == null : this.getPefopubYear().equals(other.getPefopubYear()))
            && (this.getPefopubNum() == null ? other.getPefopubNum() == null : this.getPefopubNum().equals(other.getPefopubNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPefopubId() == null) ? 0 : getPefopubId().hashCode());
        result = prime * result + ((getPefoId() == null) ? 0 : getPefoId().hashCode());
        result = prime * result + ((getPefopubName() == null) ? 0 : getPefopubName().hashCode());
        result = prime * result + ((getPefopubGrade() == null) ? 0 : getPefopubGrade().hashCode());
        result = prime * result + ((getPefopubYear() == null) ? 0 : getPefopubYear().hashCode());
        result = prime * result + ((getPefopubNum() == null) ? 0 : getPefopubNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pefopubId=").append(pefopubId);
        sb.append(", pefoId=").append(pefoId);
        sb.append(", pefopubName=").append(pefopubName);
        sb.append(", pefopubGrade=").append(pefopubGrade);
        sb.append(", pefopubYear=").append(pefopubYear);
        sb.append(", pefopubNum=").append(pefopubNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}