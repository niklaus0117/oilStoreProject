package com.store.clientsoft.exception;

import com.store.clientsoft.exception.constans.Constants;

public class CustomerException extends Exception{

	private static final long serialVersionUID = 1L;
	private String code;
	private Constants states;
	private String messgage;
	
	public CustomerException() {
	}
	
	public CustomerException(String message) {
		super(message);
	}
	
	public CustomerException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CustomerException(String code, String message) {
		super();
		this.code = code;
		this.messgage = message;
	}
	
	public CustomerException(String code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
		this.messgage = message;
	}
	
	public CustomerException(String code, Constants states, String messgage) {
		super();
		this.code = code;
		this.states = states;
		this.messgage = messgage;
	}
	
	public CustomerException(String code, Constants states, String messgage, Throwable cause) {
		super(messgage, cause);
		this.code = code;
		this.states = states;
		this.messgage = messgage;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Constants getStates() {
		return states;
	}
	public void setStates(Constants states) {
		this.states = states;
	}
	public String getMessgage() {
		return messgage;
	}
	public void setMessgage(String messgage) {
		this.messgage = messgage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
