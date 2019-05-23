package com.store.clientsoft.customer.dao;

import org.apache.ibatis.annotations.Param;

import com.store.clientsoft.customer.entity.CustomerLogin;

public interface CustomerLoginDao {
	
	CustomerLogin validaCustomerLogin(@Param("loginName")String loginName);
	
	Integer validaLoginName(@Param("loginName")String loginName);
	
	Integer validaMobilePhone(@Param("mobilePhone")String mobilePhone);
	
	Integer registeredCustomer(CustomerLogin customerLogin);
	
}
