package com.store.clientsoft.customer.service;

import com.store.clientsoft.customer.entity.CustomerLogin;

public interface CustomerLoginService {
	
	public CustomerLogin customerLogin(String loginName,String password) throws Exception;
	
	public int validaLoginName(String loginName) throws Exception;
	
	public int validaMobilePhone(String mobilePhone) throws Exception;
	
	public int registeredCustomer(CustomerLogin customerLogin) throws Exception;

}
