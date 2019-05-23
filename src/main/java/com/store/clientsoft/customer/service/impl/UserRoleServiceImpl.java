package com.store.clientsoft.customer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.clientsoft.customer.dao.UserRoleDao;
import com.store.clientsoft.customer.entity.UserRole;
import com.store.clientsoft.customer.service.UserRoleService;
import com.store.clientsoft.exception.CustomerException;

@Service
public class UserRoleServiceImpl implements UserRoleService{
	
	private Logger logger = LoggerFactory.getLogger(UserRoleServiceImpl.class);
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	private int validaRoleName(String roleName) throws CustomerException{
		Integer count = userRoleDao.validaRoleName(roleName);
		if (count > 0) {
			logger.error("The role name already exisis!");
			throw new CustomerException("角色名已经存在");
		}
		return count;
	}
	
	@Override
	public int addUserRole(UserRole userRole) throws CustomerException {
		if ("".equals(userRole.getRoleName())) {
			throw new CustomerException("角色名不能为空");
		}
		validaRoleName(userRole.getRoleName());
		int count = 0; 
		try {
			count = userRoleDao.addUserRole(userRole);
		} catch (Exception e) {
			throw new CustomerException(e.getMessage());
		}
		return count;
	}

}
