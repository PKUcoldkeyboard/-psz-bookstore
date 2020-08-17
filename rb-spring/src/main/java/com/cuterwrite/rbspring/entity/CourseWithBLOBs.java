package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class CourseWithBLOBs extends Course implements Serializable {
    /**
     * 先修课
     */
    private String coursePre;

    /**
     * 简介
     */
    private String courseIntro;

    private static final long serialVersionUID = 1L;

    public String getCoursePre() {
        return coursePre;
    }

    public void setCoursePre(String coursePre) {
        this.coursePre = coursePre;
    }

    public String getCourseIntro() {
        return courseIntro;
    }

    public void setCourseIntro(String courseIntro) {
        this.courseIntro = courseIntro;
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
        CourseWithBLOBs other = (CourseWithBLOBs) that;
        return (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getCourseCredit() == null ? other.getCourseCredit() == null : this.getCourseCredit().equals(other.getCourseCredit()))
            && (this.getCourseTeacher() == null ? other.getCourseTeacher() == null : this.getCourseTeacher().equals(other.getCourseTeacher()))
            && (this.getCourseType() == null ? other.getCourseType() == null : this.getCourseType().equals(other.getCourseType()))
            && (this.getCourseLanguage() == null ? other.getCourseLanguage() == null : this.getCourseLanguage().equals(other.getCourseLanguage()))
            && (this.getCoursePre() == null ? other.getCoursePre() == null : this.getCoursePre().equals(other.getCoursePre()))
            && (this.getCourseIntro() == null ? other.getCourseIntro() == null : this.getCourseIntro().equals(other.getCourseIntro()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getCourseCredit() == null) ? 0 : getCourseCredit().hashCode());
        result = prime * result + ((getCourseTeacher() == null) ? 0 : getCourseTeacher().hashCode());
        result = prime * result + ((getCourseType() == null) ? 0 : getCourseType().hashCode());
        result = prime * result + ((getCourseLanguage() == null) ? 0 : getCourseLanguage().hashCode());
        result = prime * result + ((getCoursePre() == null) ? 0 : getCoursePre().hashCode());
        result = prime * result + ((getCourseIntro() == null) ? 0 : getCourseIntro().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coursePre=").append(coursePre);
        sb.append(", courseIntro=").append(courseIntro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}