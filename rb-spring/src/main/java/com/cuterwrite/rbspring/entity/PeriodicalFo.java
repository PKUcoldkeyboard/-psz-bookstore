package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 * 
 */
public class PeriodicalFo implements Serializable {
    /**
     * 英文期刊编号
     */
    private Integer pefoId;

    /**
     * 英文期刊名称
     */
    private String pefoName;

    /**
     * 英文期刊官网链接
     */
    private String pefoOfficialWebsiteLink;

    /**
     * 英文期刊综合影响因子
     */
    private BigDecimal pefoComprehensiveInfluencingFactors;

    /**
     * 英文期刊投稿入口
     */
    private String pefoSubmissionEntry;

    /**
     * 英文期刊投稿要求
     */
    private String pefoSubmissionRequirements;

    /**
     * 发表总人数
     */
    private Integer pubnumTot;

    /**
     * 近三年发表人数
     */
    private Integer pubnum3years;

    private static final long serialVersionUID = 1L;

    public Integer getPefoId() {
        return pefoId;
    }

    public void setPefoId(Integer pefoId) {
        this.pefoId = pefoId;
    }

    public String getPefoName() {
        return pefoName;
    }

    public void setPefoName(String pefoName) {
        this.pefoName = pefoName;
    }

    public String getPefoOfficialWebsiteLink() {
        return pefoOfficialWebsiteLink;
    }

    public void setPefoOfficialWebsiteLink(String pefoOfficialWebsiteLink) {
        this.pefoOfficialWebsiteLink = pefoOfficialWebsiteLink;
    }

    public BigDecimal getPefoComprehensiveInfluencingFactors() {
        return pefoComprehensiveInfluencingFactors;
    }

    public void setPefoComprehensiveInfluencingFactors(BigDecimal pefoComprehensiveInfluencingFactors) {
        this.pefoComprehensiveInfluencingFactors = pefoComprehensiveInfluencingFactors;
    }

    public String getPefoSubmissionEntry() {
        return pefoSubmissionEntry;
    }

    public void setPefoSubmissionEntry(String pefoSubmissionEntry) {
        this.pefoSubmissionEntry = pefoSubmissionEntry;
    }

    public String getPefoSubmissionRequirements() {
        return pefoSubmissionRequirements;
    }

    public void setPefoSubmissionRequirements(String pefoSubmissionRequirements) {
        this.pefoSubmissionRequirements = pefoSubmissionRequirements;
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
        PeriodicalFo other = (PeriodicalFo) that;
        return (this.getPefoId() == null ? other.getPefoId() == null : this.getPefoId().equals(other.getPefoId()))
            && (this.getPefoName() == null ? other.getPefoName() == null : this.getPefoName().equals(other.getPefoName()))
            && (this.getPefoOfficialWebsiteLink() == null ? other.getPefoOfficialWebsiteLink() == null : this.getPefoOfficialWebsiteLink().equals(other.getPefoOfficialWebsiteLink()))
            && (this.getPefoComprehensiveInfluencingFactors() == null ? other.getPefoComprehensiveInfluencingFactors() == null : this.getPefoComprehensiveInfluencingFactors().equals(other.getPefoComprehensiveInfluencingFactors()))
            && (this.getPefoSubmissionEntry() == null ? other.getPefoSubmissionEntry() == null : this.getPefoSubmissionEntry().equals(other.getPefoSubmissionEntry()))
            && (this.getPefoSubmissionRequirements() == null ? other.getPefoSubmissionRequirements() == null : this.getPefoSubmissionRequirements().equals(other.getPefoSubmissionRequirements()))
            && (this.getPubnumTot() == null ? other.getPubnumTot() == null : this.getPubnumTot().equals(other.getPubnumTot()))
            && (this.getPubnum3years() == null ? other.getPubnum3years() == null : this.getPubnum3years().equals(other.getPubnum3years()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPefoId() == null) ? 0 : getPefoId().hashCode());
        result = prime * result + ((getPefoName() == null) ? 0 : getPefoName().hashCode());
        result = prime * result + ((getPefoOfficialWebsiteLink() == null) ? 0 : getPefoOfficialWebsiteLink().hashCode());
        result = prime * result + ((getPefoComprehensiveInfluencingFactors() == null) ? 0 : getPefoComprehensiveInfluencingFactors().hashCode());
        result = prime * result + ((getPefoSubmissionEntry() == null) ? 0 : getPefoSubmissionEntry().hashCode());
        result = prime * result + ((getPefoSubmissionRequirements() == null) ? 0 : getPefoSubmissionRequirements().hashCode());
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
        sb.append(", pefoId=").append(pefoId);
        sb.append(", pefoName=").append(pefoName);
        sb.append(", pefoOfficialWebsiteLink=").append(pefoOfficialWebsiteLink);
        sb.append(", pefoComprehensiveInfluencingFactors=").append(pefoComprehensiveInfluencingFactors);
        sb.append(", pefoSubmissionEntry=").append(pefoSubmissionEntry);
        sb.append(", pefoSubmissionRequirements=").append(pefoSubmissionRequirements);
        sb.append(", pubnumTot=").append(pubnumTot);
        sb.append(", pubnum3years=").append(pubnum3years);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}