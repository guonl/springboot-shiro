package com.guonl.vo;

import java.io.Serializable;

public class FrontResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	//结果信息  0:成功
	private Integer code = 200;
	
	//错误信息
	private String message = "请求成功";
	
	//具体数据
	private T dataMap = null;
	
	public FrontResult(){}
	
	public FrontResult(Integer errorCode, String errorMsg){
		this.code = errorCode;
		this.message = errorMsg;
	}
	
	public FrontResult(Error error){
		code = -1;
		message = "请求异常";
		
	}
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer errorCode) {
		this.code = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String errorMsg) {
		this.message = errorMsg;
	}

	public Object getDataMap() {
		return dataMap;
	}

	public void setDataMap(T data) {
		this.dataMap = data;
	}

	public static <T> FrontResult<T> success(T dataMap){
		FrontResult<T> frontResult = new FrontResult<T>();
		frontResult.setDataMap(dataMap);
		return frontResult;
	}

	public static <T> FrontResult<T> error(int code, String message) {
		return new FrontResult<>(code, message);
	}
}
