package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Student implements Serializable {
    /**
     * 学号
     */
    private String stuId;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 性别
     */
    private String stuGender;

    /**
     * 年级
     */
    private String stuGrade;

    /**
     * 专业
     */
    private String stuMajor;

    private static final long serialVersionUID = 1L;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
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
        Student other = (Student) that;
        return (this.getStuId() == null ? other.getStuId() == null : this.getStuId().equals(other.getStuId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getStuGender() == null ? other.getStuGender() == null : this.getStuGender().equals(other.getStuGender()))
            && (this.getStuGrade() == null ? other.getStuGrade() == null : this.getStuGrade().equals(other.getStuGrade()))
            && (this.getStuMajor() == null ? other.getStuMajor() == null : this.getStuMajor().equals(other.getStuMajor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuId() == null) ? 0 : getStuId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getStuGender() == null) ? 0 : getStuGender().hashCode());
        result = prime * result + ((getStuGrade() == null) ? 0 : getStuGrade().hashCode());
        result = prime * result + ((getStuMajor() == null) ? 0 : getStuMajor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuId=").append(stuId);
        sb.append(", stuName=").append(stuName);
        sb.append(", stuGender=").append(stuGender);
        sb.append(", stuGrade=").append(stuGrade);
        sb.append(", stuMajor=").append(stuMajor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}