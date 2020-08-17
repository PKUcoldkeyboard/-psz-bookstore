package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class TeacherDetailWithBLOBs extends TeacherDetail implements Serializable {
    /**
     * 组会频率
     */
    private String teFrequency;

    /**
     * 教育背景
     */
    private String teEducation;

    /**
     * 工作经历
     */
    private String teCareer;

    /**
     * 社会兼职
     */
    private String teSocialAppointments;

    /**
     * 获奖情况
     */
    private String teAwards;

    /**
     * 代表著作
     */
    private String teWorks;

    /**
     * 学术论文
     */
    private String tePapers;

    /**
     * 科研项目
     */
    private String teProject;

    /**
     * 其他
     */
    private String teOthers;

    private static final long serialVersionUID = 1L;

    public String getTeFrequency() {
        return teFrequency;
    }

    public void setTeFrequency(String teFrequency) {
        this.teFrequency = teFrequency;
    }

    public String getTeEducation() {
        return teEducation;
    }

    public void setTeEducation(String teEducation) {
        this.teEducation = teEducation;
    }

    public String getTeCareer() {
        return teCareer;
    }

    public void setTeCareer(String teCareer) {
        this.teCareer = teCareer;
    }

    public String getTeSocialAppointments() {
        return teSocialAppointments;
    }

    public void setTeSocialAppointments(String teSocialAppointments) {
        this.teSocialAppointments = teSocialAppointments;
    }

    public String getTeAwards() {
        return teAwards;
    }

    public void setTeAwards(String teAwards) {
        this.teAwards = teAwards;
    }

    public String getTeWorks() {
        return teWorks;
    }

    public void setTeWorks(String teWorks) {
        this.teWorks = teWorks;
    }

    public String getTePapers() {
        return tePapers;
    }

    public void setTePapers(String tePapers) {
        this.tePapers = tePapers;
    }

    public String getTeProject() {
        return teProject;
    }

    public void setTeProject(String teProject) {
        this.teProject = teProject;
    }

    public String getTeOthers() {
        return teOthers;
    }

    public void setTeOthers(String teOthers) {
        this.teOthers = teOthers;
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
        TeacherDetailWithBLOBs other = (TeacherDetailWithBLOBs) that;
        return (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getTeGender() == null ? other.getTeGender() == null : this.getTeGender().equals(other.getTeGender()))
            && (this.getTePost() == null ? other.getTePost() == null : this.getTePost().equals(other.getTePost()))
            && (this.getTeWebsite() == null ? other.getTeWebsite() == null : this.getTeWebsite().equals(other.getTeWebsite()))
            && (this.getTeFrequency() == null ? other.getTeFrequency() == null : this.getTeFrequency().equals(other.getTeFrequency()))
            && (this.getTeEducation() == null ? other.getTeEducation() == null : this.getTeEducation().equals(other.getTeEducation()))
            && (this.getTeCareer() == null ? other.getTeCareer() == null : this.getTeCareer().equals(other.getTeCareer()))
            && (this.getTeSocialAppointments() == null ? other.getTeSocialAppointments() == null : this.getTeSocialAppointments().equals(other.getTeSocialAppointments()))
            && (this.getTeAwards() == null ? other.getTeAwards() == null : this.getTeAwards().equals(other.getTeAwards()))
            && (this.getTeWorks() == null ? other.getTeWorks() == null : this.getTeWorks().equals(other.getTeWorks()))
            && (this.getTePapers() == null ? other.getTePapers() == null : this.getTePapers().equals(other.getTePapers()))
            && (this.getTeProject() == null ? other.getTeProject() == null : this.getTeProject().equals(other.getTeProject()))
            && (this.getTeOthers() == null ? other.getTeOthers() == null : this.getTeOthers().equals(other.getTeOthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getTeGender() == null) ? 0 : getTeGender().hashCode());
        result = prime * result + ((getTePost() == null) ? 0 : getTePost().hashCode());
        result = prime * result + ((getTeWebsite() == null) ? 0 : getTeWebsite().hashCode());
        result = prime * result + ((getTeFrequency() == null) ? 0 : getTeFrequency().hashCode());
        result = prime * result + ((getTeEducation() == null) ? 0 : getTeEducation().hashCode());
        result = prime * result + ((getTeCareer() == null) ? 0 : getTeCareer().hashCode());
        result = prime * result + ((getTeSocialAppointments() == null) ? 0 : getTeSocialAppointments().hashCode());
        result = prime * result + ((getTeAwards() == null) ? 0 : getTeAwards().hashCode());
        result = prime * result + ((getTeWorks() == null) ? 0 : getTeWorks().hashCode());
        result = prime * result + ((getTePapers() == null) ? 0 : getTePapers().hashCode());
        result = prime * result + ((getTeProject() == null) ? 0 : getTeProject().hashCode());
        result = prime * result + ((getTeOthers() == null) ? 0 : getTeOthers().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teFrequency=").append(teFrequency);
        sb.append(", teEducation=").append(teEducation);
        sb.append(", teCareer=").append(teCareer);
        sb.append(", teSocialAppointments=").append(teSocialAppointments);
        sb.append(", teAwards=").append(teAwards);
        sb.append(", teWorks=").append(teWorks);
        sb.append(", tePapers=").append(tePapers);
        sb.append(", teProject=").append(teProject);
        sb.append(", teOthers=").append(teOthers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}