package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class TeQuota extends TeQuotaKey implements Serializable {
    /**
     * 特定课题的招生名额（-1表示不限）
     */
    private Short quotaNum;

    /**
     * 意向人数，请注意在申请表提交后进行更新（申请对象为具体课题时不要忘了同步更新总名额的意向人数）
     */
    private Short intentionNum;

    private static final long serialVersionUID = 1L;

    public Short getQuotaNum() {
        return quotaNum;
    }

    public void setQuotaNum(Short quotaNum) {
        this.quotaNum = quotaNum;
    }

    public Short getIntentionNum() {
        return intentionNum;
    }

    public void setIntentionNum(Short intentionNum) {
        this.intentionNum = intentionNum;
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
        TeQuota other = (TeQuota) that;
        return (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getQuotaNo() == null ? other.getQuotaNo() == null : this.getQuotaNo().equals(other.getQuotaNo()))
            && (this.getQuotaNum() == null ? other.getQuotaNum() == null : this.getQuotaNum().equals(other.getQuotaNum()))
            && (this.getIntentionNum() == null ? other.getIntentionNum() == null : this.getIntentionNum().equals(other.getIntentionNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getQuotaNo() == null) ? 0 : getQuotaNo().hashCode());
        result = prime * result + ((getQuotaNum() == null) ? 0 : getQuotaNum().hashCode());
        result = prime * result + ((getIntentionNum() == null) ? 0 : getIntentionNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quotaNum=").append(quotaNum);
        sb.append(", intentionNum=").append(intentionNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}