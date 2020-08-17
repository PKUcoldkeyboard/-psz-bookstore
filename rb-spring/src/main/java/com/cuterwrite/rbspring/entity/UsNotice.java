package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class UsNotice extends UsNoticeKey implements Serializable {
    /**
     * 查看情况，1为已查看，0为未查看
     */
    private Boolean usnoCondition;

    private static final long serialVersionUID = 1L;

    public Boolean getUsnoCondition() {
        return usnoCondition;
    }

    public void setUsnoCondition(Boolean usnoCondition) {
        this.usnoCondition = usnoCondition;
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
        UsNotice other = (UsNotice) that;
        return (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getUsnoCondition() == null ? other.getUsnoCondition() == null : this.getUsnoCondition().equals(other.getUsnoCondition()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getUsnoCondition() == null) ? 0 : getUsnoCondition().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usnoCondition=").append(usnoCondition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}