package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class UserUnverified implements Serializable {
    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户类型（此表中均为学生）
     */
    private String userType;

    /**
     * 注册时间
     */
    private Date signupTime;

    private String verifyParameter;

    /**
     * 学生性别
     */
    private String stuGender;

    private String stuGrade;

    /**
     * 学生专业
     */
    private String stuMajor;

    private static final long serialVersionUID = 1L;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getSignupTime() {
        return signupTime;
    }

    public void setSignupTime(Date signupTime) {
        this.signupTime = signupTime;
    }

    public String getVerifyParameter() {
        return verifyParameter;
    }

    public void setVerifyParameter(String verifyParameter) {
        this.verifyParameter = verifyParameter;
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
        UserUnverified other = (UserUnverified) that;
        return (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getSignupTime() == null ? other.getSignupTime() == null : this.getSignupTime().equals(other.getSignupTime()))
            && (this.getVerifyParameter() == null ? other.getVerifyParameter() == null : this.getVerifyParameter().equals(other.getVerifyParameter()))
            && (this.getStuGender() == null ? other.getStuGender() == null : this.getStuGender().equals(other.getStuGender()))
            && (this.getStuGrade() == null ? other.getStuGrade() == null : this.getStuGrade().equals(other.getStuGrade()))
            && (this.getStuMajor() == null ? other.getStuMajor() == null : this.getStuMajor().equals(other.getStuMajor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getSignupTime() == null) ? 0 : getSignupTime().hashCode());
        result = prime * result + ((getVerifyParameter() == null) ? 0 : getVerifyParameter().hashCode());
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
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", userType=").append(userType);
        sb.append(", signupTime=").append(signupTime);
        sb.append(", verifyParameter=").append(verifyParameter);
        sb.append(", stuGender=").append(stuGender);
        sb.append(", stuGrade=").append(stuGrade);
        sb.append(", stuMajor=").append(stuMajor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}