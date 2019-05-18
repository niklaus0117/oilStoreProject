package com.store.clientsoft.customer.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.clientsoft.common.Response;
import com.store.clientsoft.customer.entity.CustomerLogin;
import com.store.clientsoft.customer.service.CustomerLoginService;
import com.store.clientsoft.exception.CustomerException;
import com.store.clientsoft.util.Base64Code;
import com.store.clientsoft.util.MD5Util;
import com.store.clientsoft.util.UUIDUtils;

@RestController
@RequestMapping("/login")
public class CustomerLoginController {
	
	private Logger logger = LoggerFactory.getLogger(CustomerLoginController.class);
	
	@Autowired
	private CustomerLoginService customerLoginService;
	
	@PostMapping("/customerLogin")
	public Response<CustomerLogin> Login(HttpServletRequest request,@RequestBody CustomerLogin customerLogin) throws Exception{
		CustomerLogin customer = customerLoginService.customerLogin(customerLogin.getLoginName(), customerLogin.getloginPwd());
		return new Response<CustomerLogin>("0", "TRUE", "SUCCESS", customer);
	}
	
	@PostMapping("/validaLoginName")
	public Response<String> LoginName(@RequestBody CustomerLogin customerLogin) throws Exception{
		Integer loginNameCount = customerLoginService.validaLoginName(customerLogin.getLoginName());
		return new Response<String>("0", "TRUE", "SUCCESS", loginNameCount.toString());
	}
	
	@PostMapping("/registeredCustomer")
	public Response<String> registeredCustomer(@RequestBody CustomerLogin customerLogin) throws CustomerException{
		
		Response<String> response = new Response<String>();
		customerLogin.setloginPwd(MD5Util.string2MD5(Base64Code.base64decode(customerLogin.getloginPwd())));
		customerLogin.setCustomerId(UUIDUtils.getUUID());
		try {
			if(customerLoginService.registeredCustomer(customerLogin) > 0){
				response.setCode("0");
				response.setState("TURE");
				response.setMessage("SUCCESS");
				response.setResponseDate("User resgistration is successful");
			}else{
				throw new CustomerException("ÓÃ»§×¢²áÊ§°Ü");
			}
		} catch (Exception e) {
			throw new CustomerException(e.getMessage());
		}
		return response;
	}
}
