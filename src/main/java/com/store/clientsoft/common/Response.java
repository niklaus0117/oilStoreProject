package com.store.clientsoft.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Response<T> {
	private String code;
	private String state;
	private String message;
	private String timestamp;
	private T responseDate;
	
	public static final String TIME_PATTIME = "yyyy-MM-dd'T'HH:mm:ss.SZ";
	
	public Response(){};
	
	public Response(String code, String state, String message, String timestamp, T responseDate){
		this.code = code;
		this.state = state;
		this.message = message;
		this.timestamp = timestamp;
		this.responseDate = responseDate;
	}
	
	public Response(String code, String state, String message, T responseDate){
		this.code = code;
		this.state = state;
		this.message = message;
		this.timestamp = new SimpleDateFormat(TIME_PATTIME).format(new Date());
		this.responseDate = responseDate;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public T getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(T responseDate) {
		this.responseDate = responseDate;
	}
	
	
}
