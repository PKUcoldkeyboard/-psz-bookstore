package com.cuterwrite.rbspring.entity;

import java.io.Serializable;

import lombok.Data;

/*
 * 请求结果响应类
 */
@Data
public class Result<T>implements Serializable {

	private static final long serialVersionUID = 1L;
	private int resultCode;
	private String message;
	private T data;
	
	public Result() {}
	public Result(int resultCode,String message) {
		this.resultCode=resultCode;
		this.message=message;
	}
	
}
