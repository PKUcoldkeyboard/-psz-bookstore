package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class TeacherDetail implements Serializable {
    /**
     * 教师工号
     */
    private String teId;

    /**
     * 性别
     */
    private String teGender;

    /**
     * 职务
     */
    private String tePost;

    /**
     * 网站
     */
    private String teWebsite;

    private static final long serialVersionUID = 1L;

    public String getTeId() {
        return teId;
    }

    public void setTeId(String teId) {
        this.teId = teId;
    }

    public String getTeGender() {
        return teGender;
    }

    public void setTeGender(String teGender) {
        this.teGender = teGender;
    }

    public String getTePost() {
        return tePost;
    }

    public void setTePost(String tePost) {
        this.tePost = tePost;
    }

    public String getTeWebsite() {
        return teWebsite;
    }

    public void setTeWebsite(String teWebsite) {
        this.teWebsite = teWebsite;
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
        TeacherDetail other = (TeacherDetail) that;
        return (this.getTeId() == null ? other.getTeId() == null : this.getTeId().equals(other.getTeId()))
            && (this.getTeGender() == null ? other.getTeGender() == null : this.getTeGender().equals(other.getTeGender()))
            && (this.getTePost() == null ? other.getTePost() == null : this.getTePost().equals(other.getTePost()))
            && (this.getTeWebsite() == null ? other.getTeWebsite() == null : this.getTeWebsite().equals(other.getTeWebsite()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeId() == null) ? 0 : getTeId().hashCode());
        result = prime * result + ((getTeGender() == null) ? 0 : getTeGender().hashCode());
        result = prime * result + ((getTePost() == null) ? 0 : getTePost().hashCode());
        result = prime * result + ((getTeWebsite() == null) ? 0 : getTeWebsite().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teId=").append(teId);
        sb.append(", teGender=").append(teGender);
        sb.append(", tePost=").append(tePost);
        sb.append(", teWebsite=").append(teWebsite);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}