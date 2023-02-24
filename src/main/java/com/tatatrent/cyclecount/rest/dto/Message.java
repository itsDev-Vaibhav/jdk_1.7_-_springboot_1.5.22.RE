package com.tatatrent.cyclecount.rest.dto;

public class Message {
	
	private Integer code;
	private String status;
	
	public Message() {
		this.code = 200;
		this.status = "Reply from Spring boot 1.5.8 and java 8.";
	}
	

	public Message(Integer code, String status) {
		this.code = code;
		this.status = status;
	}



	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	

}
