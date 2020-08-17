package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Conference implements Serializable {
    /**
     * 会议编号
     */
    private Integer confId;

    /**
     * 会议名称
     */
    private String confName;

    /**
     * 官网链接
     */
    private String confOfficialWebsiteLink;

    /**
     * 本届会议链接
     */
    private String confCurrentLink;

    /**
     * 下届会议链接
     */
    private String confNextLink;

    /**
     * 下届时间
     */
    private String confNextTime;

    /**
     * 下届地点
     */
    private String confNextPlace;

    /**
     * 参会指南
     */
    private String confAttendeesGuide;

    /**
     * 发表总人数
     */
    private Integer pubnumTot;

    /**
     * 近三年发表人数
     */
    private Integer pubnum3years;

    private static final long serialVersionUID = 1L;

    public Integer getConfId() {
        return confId;
    }

    public void setConfId(Integer confId) {
        this.confId = confId;
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getConfOfficialWebsiteLink() {
        return confOfficialWebsiteLink;
    }

    public void setConfOfficialWebsiteLink(String confOfficialWebsiteLink) {
        this.confOfficialWebsiteLink = confOfficialWebsiteLink;
    }

    public String getConfCurrentLink() {
        return confCurrentLink;
    }

    public void setConfCurrentLink(String confCurrentLink) {
        this.confCurrentLink = confCurrentLink;
    }

    public String getConfNextLink() {
        return confNextLink;
    }

    public void setConfNextLink(String confNextLink) {
        this.confNextLink = confNextLink;
    }

    public String getConfNextTime() {
        return confNextTime;
    }

    public void setConfNextTime(String confNextTime) {
        this.confNextTime = confNextTime;
    }

    public String getConfNextPlace() {
        return confNextPlace;
    }

    public void setConfNextPlace(String confNextPlace) {
        this.confNextPlace = confNextPlace;
    }

    public String getConfAttendeesGuide() {
        return confAttendeesGuide;
    }

    public void setConfAttendeesGuide(String confAttendeesGuide) {
        this.confAttendeesGuide = confAttendeesGuide;
    }

    public Integer getPubnumTot() {
        return pubnumTot;
    }

    public void setPubnumTot(Integer pubnumTot) {
        this.pubnumTot = pubnumTot;
    }

    public Integer getPubnum3years() {
        return pubnum3years;
    }

    public void setPubnum3years(Integer pubnum3years) {
        this.pubnum3years = pubnum3years;
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
        Conference other = (Conference) that;
        return (this.getConfId() == null ? other.getConfId() == null : this.getConfId().equals(other.getConfId()))
            && (this.getConfName() == null ? other.getConfName() == null : this.getConfName().equals(other.getConfName()))
            && (this.getConfOfficialWebsiteLink() == null ? other.getConfOfficialWebsiteLink() == null : this.getConfOfficialWebsiteLink().equals(other.getConfOfficialWebsiteLink()))
            && (this.getConfCurrentLink() == null ? other.getConfCurrentLink() == null : this.getConfCurrentLink().equals(other.getConfCurrentLink()))
            && (this.getConfNextLink() == null ? other.getConfNextLink() == null : this.getConfNextLink().equals(other.getConfNextLink()))
            && (this.getConfNextTime() == null ? other.getConfNextTime() == null : this.getConfNextTime().equals(other.getConfNextTime()))
            && (this.getConfNextPlace() == null ? other.getConfNextPlace() == null : this.getConfNextPlace().equals(other.getConfNextPlace()))
            && (this.getConfAttendeesGuide() == null ? other.getConfAttendeesGuide() == null : this.getConfAttendeesGuide().equals(other.getConfAttendeesGuide()))
            && (this.getPubnumTot() == null ? other.getPubnumTot() == null : this.getPubnumTot().equals(other.getPubnumTot()))
            && (this.getPubnum3years() == null ? other.getPubnum3years() == null : this.getPubnum3years().equals(other.getPubnum3years()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConfId() == null) ? 0 : getConfId().hashCode());
        result = prime * result + ((getConfName() == null) ? 0 : getConfName().hashCode());
        result = prime * result + ((getConfOfficialWebsiteLink() == null) ? 0 : getConfOfficialWebsiteLink().hashCode());
        result = prime * result + ((getConfCurrentLink() == null) ? 0 : getConfCurrentLink().hashCode());
        result = prime * result + ((getConfNextLink() == null) ? 0 : getConfNextLink().hashCode());
        result = prime * result + ((getConfNextTime() == null) ? 0 : getConfNextTime().hashCode());
        result = prime * result + ((getConfNextPlace() == null) ? 0 : getConfNextPlace().hashCode());
        result = prime * result + ((getConfAttendeesGuide() == null) ? 0 : getConfAttendeesGuide().hashCode());
        result = prime * result + ((getPubnumTot() == null) ? 0 : getPubnumTot().hashCode());
        result = prime * result + ((getPubnum3years() == null) ? 0 : getPubnum3years().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", confId=").append(confId);
        sb.append(", confName=").append(confName);
        sb.append(", confOfficialWebsiteLink=").append(confOfficialWebsiteLink);
        sb.append(", confCurrentLink=").append(confCurrentLink);
        sb.append(", confNextLink=").append(confNextLink);
        sb.append(", confNextTime=").append(confNextTime);
        sb.append(", confNextPlace=").append(confNextPlace);
        sb.append(", confAttendeesGuide=").append(confAttendeesGuide);
        sb.append(", pubnumTot=").append(pubnumTot);
        sb.append(", pubnum3years=").append(pubnum3years);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}