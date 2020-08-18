package com.cuterwrite.rbspring.common;
/*
 * 响应Enum
 */
public enum ServiceResultEnum {
	
	ERROR("error"),
	
	SUCCESS("success"),
	
	DATA_NOT_EXISTS("未查询到记录"),
	
	SAMA_USER_ACCOUNT_EXISTS("用户名已存在"),
	
	USER_ACCOUNT_NULL("用户名不能为空"),
	
	USER_NAME_NULL("姓名不能为空"),
	
	PASSWORD_NULL("密码不能为空"),
	
	LOGIN_ERROR("用户名或密码错误"),
	
	OPERATE_ERROR("操作失败"),
	
	DB_ERROR("database error");
	
	private String result;
	
	ServiceResultEnum(String result){
		this.result=result;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result=result;
	}
}
