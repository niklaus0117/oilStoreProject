package com.store.clientsoft.customer.service;

import com.store.clientsoft.customer.entity.CustomerLogin;

public interface CustomerLoginService {
	
	public CustomerLogin customerLogin(String loginName,String password) throws Exception;
	
	public Integer validaLoginName(String loginName) throws Exception;
	
	public Integer validaMobilePhone(String mobilePhone) throws Exception;
	
	public Integer registeredCustomer(CustomerLogin customerLogin) throws Exception;

}
