package com.store.clientsoft.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.clientsoft.common.Response;
import com.store.clientsoft.customer.entity.UserRole;
import com.store.clientsoft.customer.service.UserRoleService;
import com.store.clientsoft.exception.CustomerException;
import com.store.clientsoft.exception.constants.ResConstants;
import com.store.clientsoft.util.UUIDUtils;

@RestController
@RequestMapping("/role")
public class UserRoleController {
	
	private Logger logger = LoggerFactory.getLogger(UserRoleController.class);
	
	@Autowired
	private UserRoleService userRoleService;
	
	@PostMapping("/addRole")
	public Response<String> addUserRole(@RequestBody UserRole userRole) throws CustomerException{
		
		Response<String> response = null;
		userRole.setRoleId(UUIDUtils.getUUID());
		if (userRoleService.addUserRole(userRole) > 0) {
			logger.info("UserRoleController addUserRole success!");
			response = new Response<String>(ResConstants.RESPONSE_CODE_SUCCESS, ResConstants.RESPONSE_CODE_STATE,
					ResConstants.RESPONSE_CODE_MESSAGE, " add role is successful");
		} else {
			throw new CustomerException("Ìí¼ÓÐÂ½ÇÉ«Ê§°Ü");
		}
		return response;
	}
	
}
