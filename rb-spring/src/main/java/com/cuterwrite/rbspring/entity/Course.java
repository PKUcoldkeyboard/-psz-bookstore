package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Course implements Serializable {
    /**
     * 课程号
     */
    private String courseId;

    /**
     * 课程名
     */
    private String courseName;

    private Byte courseCredit;

    /**
     * 授课教师
     */
    private String courseTeacher;

    /**
     * 课类
     */
    private String courseType;

    /**
     * 授课语言
     */
    private String courseLanguage;

    private static final long serialVersionUID = 1L;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Byte getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Byte courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
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
        Course other = (Course) that;
        return (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getCourseCredit() == null ? other.getCourseCredit() == null : this.getCourseCredit().equals(other.getCourseCredit()))
            && (this.getCourseTeacher() == null ? other.getCourseTeacher() == null : this.getCourseTeacher().equals(other.getCourseTeacher()))
            && (this.getCourseType() == null ? other.getCourseType() == null : this.getCourseType().equals(other.getCourseType()))
            && (this.getCourseLanguage() == null ? other.getCourseLanguage() == null : this.getCourseLanguage().equals(other.getCourseLanguage()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseCredit=").append(courseCredit);
        sb.append(", courseTeacher=").append(courseTeacher);
        sb.append(", courseType=").append(courseType);
        sb.append(", courseLanguage=").append(courseLanguage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}