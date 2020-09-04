package com.cuterwrite.rbspring.entity;

import java.util.Date;

import lombok.Data;

@Data
public class PostExtra{
    private Integer postId;
    private Boolean usnoCondition;
    private String postTitle;
    private Date postDate;
    private String postContent;
}
