package com.store.clientsoft.customer.entity;

import java.util.Date;

public class CustomerLogin {
	private String customerId;
	private String mobilePhone;
	private String loginName;
	private String loginPwd;
	private String identityCardNo;
	private Integer userStatus;
	private Date createTime;
	private Date modifiedTime;
	private String roleId;
	
	public CustomerLogin(){};
	
	public CustomerLogin(String customerId,String mobilePhone, String loginName, String loginPwd, Integer userStatus, Date modifiedTime, String roleId){
		this.customerId = customerId;
		this.mobilePhone = mobilePhone;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.userStatus = userStatus;
		this.modifiedTime = modifiedTime;
		this.roleId = roleId;
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
	
	public String getLoginPwd() {
		return loginPwd;
	}
	
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	public Integer getUserStatus() {
		return userStatus;
	}
	
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
}
