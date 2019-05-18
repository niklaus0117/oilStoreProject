package com.store.clientsoft.customer.entity;

import java.util.Date;

public class CustomerLogin {
	private String customerId;
	private String mobilePhone;
	private String loginName;
	private String loginPwd;
	private String identityCardNo;
	private Integer userStats;
	private Date modifiedTime;
	
	public CustomerLogin(){};
	
	public CustomerLogin(String customerId,String mobilePhone, String loginName, String loginPwd, Integer userStats, Date modifiedTime){
		this.customerId = customerId;
		this.mobilePhone = mobilePhone;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.userStats = userStats;
		this.modifiedTime = modifiedTime;
	}	
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getloginPwd() {
		return loginPwd;
	}
	
	public void setloginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	public Integer getUserStats() {
		return userStats;
	}
	
	public void setUserStats(Integer userStats) {
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
