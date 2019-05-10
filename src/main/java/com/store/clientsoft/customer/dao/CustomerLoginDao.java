package com.store.clientsoft.customer.dao;

import org.apache.ibatis.annotations.Param;

import com.store.clientsoft.customer.entity.CustomerLogin;

public interface CustomerLoginDao {
	
	CustomerLogin validaCustomerLogin(@Param("loginName")String loginName);
	
	Integer validaLoginName(String loginName);
	
	Integer validaMobilePhone(String mobilePhone);
	
	Integer registeredCustomer(CustomerLogin customerLogin);
	
}
