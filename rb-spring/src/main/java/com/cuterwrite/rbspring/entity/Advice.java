package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Advice implements Serializable {
    /**
     * 意见编号
     */
    private Integer adviceId;

    /**
     * 意见提交者
     */
    private String userAccount;

    /**
     * 意见标题
     */
    private String adviceTitle;

    /**
     * 意见状态，0为未查看，1为已查看
     */
    private Boolean adviceContition;

    /**
     * 意见提交时间
     */
    private Date adviceDate;

    /**
     * 匿名状态，0为非匿名，1为匿名
     */
    private Boolean adviceAnonymous;

    /**
     * 意见内容
     */
    private String adviceContent;

    private static final long serialVersionUID = 1L;

    public Integer getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(Integer adviceId) {
        this.adviceId = adviceId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getAdviceTitle() {
        return adviceTitle;
    }

    public void setAdviceTitle(String adviceTitle) {
        this.adviceTitle = adviceTitle;
    }

    public Boolean getAdviceContition() {
        return adviceContition;
    }

    public void setAdviceContition(Boolean adviceContition) {
        this.adviceContition = adviceContition;
    }

    public Date getAdviceDate() {
        return adviceDate;
    }

    public void setAdviceDate(Date adviceDate) {
        this.adviceDate = adviceDate;
    }

    public Boolean getAdviceAnonymous() {
        return adviceAnonymous;
    }

    public void setAdviceAnonymous(Boolean adviceAnonymous) {
        this.adviceAnonymous = adviceAnonymous;
    }

    public String getAdviceContent() {
        return adviceContent;
    }

    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent;
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
        Advice other = (Advice) that;
        return (this.getAdviceId() == null ? other.getAdviceId() == null : this.getAdviceId().equals(other.getAdviceId()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getAdviceTitle() == null ? other.getAdviceTitle() == null : this.getAdviceTitle().equals(other.getAdviceTitle()))
            && (this.getAdviceContition() == null ? other.getAdviceContition() == null : this.getAdviceContition().equals(other.getAdviceContition()))
            && (this.getAdviceDate() == null ? other.getAdviceDate() == null : this.getAdviceDate().equals(other.getAdviceDate()))
            && (this.getAdviceAnonymous() == null ? other.getAdviceAnonymous() == null : this.getAdviceAnonymous().equals(other.getAdviceAnonymous()))
            && (this.getAdviceContent() == null ? other.getAdviceContent() == null : this.getAdviceContent().equals(other.getAdviceContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdviceId() == null) ? 0 : getAdviceId().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getAdviceTitle() == null) ? 0 : getAdviceTitle().hashCode());
        result = prime * result + ((getAdviceContition() == null) ? 0 : getAdviceContition().hashCode());
        result = prime * result + ((getAdviceDate() == null) ? 0 : getAdviceDate().hashCode());
        result = prime * result + ((getAdviceAnonymous() == null) ? 0 : getAdviceAnonymous().hashCode());
        result = prime * result + ((getAdviceContent() == null) ? 0 : getAdviceContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adviceId=").append(adviceId);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", adviceTitle=").append(adviceTitle);
        sb.append(", adviceContition=").append(adviceContition);
        sb.append(", adviceDate=").append(adviceDate);
        sb.append(", adviceAnonymous=").append(adviceAnonymous);
        sb.append(", adviceContent=").append(adviceContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}