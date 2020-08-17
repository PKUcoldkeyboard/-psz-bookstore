package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class TeQuotaKey implements Serializable {
    /**
     * 教师工号
     */
    private String teId;

    /**
     * 招生名额所对应的课题序号，0表示总名额/未定（用于展示在申请表的“申请方向”字段中，可以参考填写示例）
     */
    private Short quotaNo;

    private static final long serialVersionUID = 1L;

    public String getTeId() {
        return teId;
    }

    public void setTeId(String teId) {
        this.teId = teId;
    }

    public Short getQuotaNo() {
        return quotaNo;
    }

    public void setQuotaNo(Short quotaNo) {
        this.quotaNo = quotaNo;
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
        TeQuotaKey other = (TeQuotaKey) that;
        return (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getQuotaNo() == null ? other.getQuotaNo() == null : this.getQuotaNo().equals(other.getQuotaNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getQuotaNo() == null) ? 0 : getQuotaNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teId=").append(teId);
        sb.append(", quotaNo=").append(quotaNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}