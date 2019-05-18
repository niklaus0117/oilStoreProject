package com.store.clientsoft.customer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.clientsoft.customer.dao.CustomerLoginDao;
import com.store.clientsoft.customer.entity.CustomerLogin;
import com.store.clientsoft.customer.service.CustomerLoginService;
import com.store.clientsoft.exception.CustomerException;
import com.store.clientsoft.util.SimpleDateFormatDate;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{
	
	private Logger logger = LoggerFactory.getLogger(CustomerLoginServiceImpl.class);
	
	@Autowired
	private CustomerLoginDao customerLoginDao;
	@Autowired
	private SimpleDateFormatDate simpleDate;
	
	@Override
	public Integer validaLoginName(String loginName) throws Exception {
		Integer loginNameCount = customerLoginDao.validaLoginName(loginName);
		if (loginNameCount > 0) {
			throw new CustomerException("username already exists");
		}
		return loginNameCount;
	}
	
	@Override
	public Integer validaMobilePhone(String mobilePhone) throws Exception {
		Integer mobilePhoneCount = customerLoginDao.validaMobilePhone(mobilePhone);
		if (mobilePhoneCount > 0) {
			throw new CustomerException("The phone number has been registered");
		}
		return mobilePhoneCount;
	}
	
	@Override
	public Integer registeredCustomer(CustomerLogin customerLogin) throws Exception {
		Integer mobilePhoneCount = customerLoginDao.validaMobilePhone(customerLogin.getMobilePhone());
		if (mobilePhoneCount > 0) {
			throw new CustomerException("The phone number has been registered");
		}
		validaLoginName(customerLogin.getLoginName());
//		customerLogin.setModifiedTime(simpleDate.DataInfo());
		Integer count = customerLoginDao.registeredCustomer(customerLogin);
		return count;
	}
	
	@Override
	public CustomerLogin customerLogin(String loginName, String password) throws Exception {
		if(loginName.equals("")){
			throw new CustomerException("用户名不能为空");
		}
		if(password.equals("")){
			throw new CustomerException("密码不能为空");
		}
		
		CustomerLogin customer = customerLoginDao.validaCustomerLogin(loginName);
		if(customer == null){
			throw new CustomerException("用户名错误");
		}
		if(customer.getloginPwd().equals(password)){
			return customer;
		} else {
			throw new CustomerException("密码错误");
		}
	}





}
