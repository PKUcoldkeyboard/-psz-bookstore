package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class DatabaseBackup implements Serializable {
    /**
     * 数据库备份编号
     */
    private Integer dabaId;

    /**
     * 数据库备份标题
     */
    private String dabaTitle;

    /**
     * 数据库备份创建时间
     */
    private Date dabaDate;

    /**
     * 数据库备份内容/注释
     */
    private String dabaContent;

    private static final long serialVersionUID = 1L;

    public Integer getDabaId() {
        return dabaId;
    }

    public void setDabaId(Integer dabaId) {
        this.dabaId = dabaId;
    }

    public String getDabaTitle() {
        return dabaTitle;
    }

    public void setDabaTitle(String dabaTitle) {
        this.dabaTitle = dabaTitle;
    }

    public Date getDabaDate() {
        return dabaDate;
    }

    public void setDabaDate(Date dabaDate) {
        this.dabaDate = dabaDate;
    }

    public String getDabaContent() {
        return dabaContent;
    }

    public void setDabaContent(String dabaContent) {
        this.dabaContent = dabaContent;
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
        DatabaseBackup other = (DatabaseBackup) that;
        return (this.getDabaId() == null ? other.getDabaId() == null : this.getDabaId().equals(other.getDabaId()))
            && (this.getDabaTitle() == null ? other.getDabaTitle() == null : this.getDabaTitle().equals(other.getDabaTitle()))
            && (this.getDabaDate() == null ? other.getDabaDate() == null : this.getDabaDate().equals(other.getDabaDate()))
            && (this.getDabaContent() == null ? other.getDabaContent() == null : this.getDabaContent().equals(other.getDabaContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDabaId() == null) ? 0 : getDabaId().hashCode());
        result = prime * result + ((getDabaTitle() == null) ? 0 : getDabaTitle().hashCode());
        result = prime * result + ((getDabaDate() == null) ? 0 : getDabaDate().hashCode());
        result = prime * result + ((getDabaContent() == null) ? 0 : getDabaContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dabaId=").append(dabaId);
        sb.append(", dabaTitle=").append(dabaTitle);
        sb.append(", dabaDate=").append(dabaDate);
        sb.append(", dabaContent=").append(dabaContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}