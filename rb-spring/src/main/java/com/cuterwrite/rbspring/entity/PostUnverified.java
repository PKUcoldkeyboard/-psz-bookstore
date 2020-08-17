package com.cuterwrite.rbspring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class PostUnverified implements Serializable {
    /**
     * 未发布（未通过审核）的帖子
     */
    private Integer postId;

    /**
     * 帖子的标题
     */
    private String postTitle;

    /**
     * 帖子发布者
     */
    private String postAuthor;

    /**
     * 发帖时间
     */
    private Date postDate;

    /**
     * 帖子的类型，用3位数字进行记录，详见“学术研讨分类编码对照表”
     */
    private String postType;

    /**
     * 发帖者的账号，对于用户自行投稿，或者对于老师的投稿，可以记录其具体的账号（姓名则从post_author字段获取）
     */
    private String userAccount;

    /**
     * 对于会议期刊发表经验，记录其对应的具体的会议期刊的编号，至于与哪个表相对应则参考post_type中记录的具体的类别
     */
    private String periId;

    /**
     * 帖子的内容
     */
    private String postContent;

    private static final long serialVersionUID = 1L;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPeriId() {
        return periId;
    }

    public void setPeriId(String periId) {
        this.periId = periId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
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
        PostUnverified other = (PostUnverified) that;
        return (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getPostTitle() == null ? other.getPostTitle() == null : this.getPostTitle().equals(other.getPostTitle()))
            && (this.getPostAuthor() == null ? other.getPostAuthor() == null : this.getPostAuthor().equals(other.getPostAuthor()))
            && (this.getPostDate() == null ? other.getPostDate() == null : this.getPostDate().equals(other.getPostDate()))
            && (this.getPostType() == null ? other.getPostType() == null : this.getPostType().equals(other.getPostType()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getPeriId() == null ? other.getPeriId() == null : this.getPeriId().equals(other.getPeriId()))
            && (this.getPostContent() == null ? other.getPostContent() == null : this.getPostContent().equals(other.getPostContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getPostTitle() == null) ? 0 : getPostTitle().hashCode());
        result = prime * result + ((getPostAuthor() == null) ? 0 : getPostAuthor().hashCode());
        result = prime * result + ((getPostDate() == null) ? 0 : getPostDate().hashCode());
        result = prime * result + ((getPostType() == null) ? 0 : getPostType().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getPeriId() == null) ? 0 : getPeriId().hashCode());
        result = prime * result + ((getPostContent() == null) ? 0 : getPostContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", postAuthor=").append(postAuthor);
        sb.append(", postDate=").append(postDate);
        sb.append(", postType=").append(postType);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", periId=").append(periId);
        sb.append(", postContent=").append(postContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}