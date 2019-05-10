package com.store.clientsoft.customer.entity;

import java.util.Date;

public class CustomerLogin {
	private Integer customerId;
	private String mobilePhone;
	private String loginName;
	private String password;
	private String identityCardNo;
	private Byte userStats;
	private Date modifiedTime;
	
	public CustomerLogin(){};
	
	public CustomerLogin(String mobilePhone, String loginName, String password, Byte userStats, Date modifiedTime){
		this.mobilePhone = mobilePhone;
		this.loginName = loginName;
		this.password = password;
		this.userStats = userStats;
		this.modifiedTime = modifiedTime;
	}	
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Byte getUserStats() {
		return userStats;
	}
	
	public void setUserStats(Byte userStats) {
		this.userStats = userStats;
	}
	
	public Date getModifiedTime() {
		return modifiedTime;
	}
	
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getIdentityCardNo() {
		return identityCardNo;
	}

	public void setIdentityCardNo(String identityCardNo) {
		this.identityCardNo = identityCardNo;
	}
	
	
	
}
