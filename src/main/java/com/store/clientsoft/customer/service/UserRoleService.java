package com.store.clientsoft.customer.service;

import com.store.clientsoft.customer.entity.UserRole;
import com.store.clientsoft.exception.CustomerException;

public interface UserRoleService {
	
	public int addUserRole(UserRole userRole) throws CustomerException;
}
