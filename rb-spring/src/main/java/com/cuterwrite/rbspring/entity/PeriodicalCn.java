package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 * 
 */
public class PeriodicalCn implements Serializable {
    /**
     * 中文期刊编号
     */
    private Integer pecnId;

    /**
     * 中文期刊名称
     */
    private String pecnName;

    /**
     * 中文期刊官网链接
     */
    private String pecnOfficialWebsiteLink;

    /**
     * 中文期刊综合影响因子
     */
    private BigDecimal pecnComprehensiveInfluencingFactors;

    /**
     * 中文期刊投稿入口
     */
    private String pecnSubmissionEntry;

    /**
     * 中文期刊投稿要求
     */
    private String pecnSubmissionRequirements;

    /**
     * 发表总人数
     */
    private Integer pubnumTot;

    /**
     * 近三年发表人数
     */
    private Integer pubnum3years;

    private static final long serialVersionUID = 1L;

    public Integer getPecnId() {
        return pecnId;
    }

    public void setPecnId(Integer pecnId) {
        this.pecnId = pecnId;
    }

    public String getPecnName() {
        return pecnName;
    }

    public void setPecnName(String pecnName) {
        this.pecnName = pecnName;
    }

    public String getPecnOfficialWebsiteLink() {
        return pecnOfficialWebsiteLink;
    }

    public void setPecnOfficialWebsiteLink(String pecnOfficialWebsiteLink) {
        this.pecnOfficialWebsiteLink = pecnOfficialWebsiteLink;
    }

    public BigDecimal getPecnComprehensiveInfluencingFactors() {
        return pecnComprehensiveInfluencingFactors;
    }

    public void setPecnComprehensiveInfluencingFactors(BigDecimal pecnComprehensiveInfluencingFactors) {
        this.pecnComprehensiveInfluencingFactors = pecnComprehensiveInfluencingFactors;
    }

    public String getPecnSubmissionEntry() {
        return pecnSubmissionEntry;
    }

    public void setPecnSubmissionEntry(String pecnSubmissionEntry) {
        this.pecnSubmissionEntry = pecnSubmissionEntry;
    }

    public String getPecnSubmissionRequirements() {
        return pecnSubmissionRequirements;
    }

    public void setPecnSubmissionRequirements(String pecnSubmissionRequirements) {
        this.pecnSubmissionRequirements = pecnSubmissionRequirements;
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
        PeriodicalCn other = (PeriodicalCn) that;
        return (this.getPecnId() == null ? other.getPecnId() == null : this.getPecnId().equals(other.getPecnId()))
            && (this.getPecnName() == null ? other.getPecnName() == null : this.getPecnName().equals(other.getPecnName()))
            && (this.getPecnOfficialWebsiteLink() == null ? other.getPecnOfficialWebsiteLink() == null : this.getPecnOfficialWebsiteLink().equals(other.getPecnOfficialWebsiteLink()))
            && (this.getPecnComprehensiveInfluencingFactors() == null ? other.getPecnComprehensiveInfluencingFactors() == null : this.getPecnComprehensiveInfluencingFactors().equals(other.getPecnComprehensiveInfluencingFactors()))
            && (this.getPecnSubmissionEntry() == null ? other.getPecnSubmissionEntry() == null : this.getPecnSubmissionEntry().equals(other.getPecnSubmissionEntry()))
            && (this.getPecnSubmissionRequirements() == null ? other.getPecnSubmissionRequirements() == null : this.getPecnSubmissionRequirements().equals(other.getPecnSubmissionRequirements()))
            && (this.getPubnumTot() == null ? other.getPubnumTot() == null : this.getPubnumTot().equals(other.getPubnumTot()))
            && (this.getPubnum3years() == null ? other.getPubnum3years() == null : this.getPubnum3years().equals(other.getPubnum3years()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPecnId() == null) ? 0 : getPecnId().hashCode());
        result = prime * result + ((getPecnName() == null) ? 0 : getPecnName().hashCode());
        result = prime * result + ((getPecnOfficialWebsiteLink() == null) ? 0 : getPecnOfficialWebsiteLink().hashCode());
        result = prime * result + ((getPecnComprehensiveInfluencingFactors() == null) ? 0 : getPecnComprehensiveInfluencingFactors().hashCode());
        result = prime * result + ((getPecnSubmissionEntry() == null) ? 0 : getPecnSubmissionEntry().hashCode());
        result = prime * result + ((getPecnSubmissionRequirements() == null) ? 0 : getPecnSubmissionRequirements().hashCode());
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
        sb.append(", pecnId=").append(pecnId);
        sb.append(", pecnName=").append(pecnName);
        sb.append(", pecnOfficialWebsiteLink=").append(pecnOfficialWebsiteLink);
        sb.append(", pecnComprehensiveInfluencingFactors=").append(pecnComprehensiveInfluencingFactors);
        sb.append(", pecnSubmissionEntry=").append(pecnSubmissionEntry);
        sb.append(", pecnSubmissionRequirements=").append(pecnSubmissionRequirements);
        sb.append(", pubnumTot=").append(pubnumTot);
        sb.append(", pubnum3years=").append(pubnum3years);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}