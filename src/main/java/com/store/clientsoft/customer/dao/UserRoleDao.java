package com.store.clientsoft.customer.dao;

import com.store.clientsoft.customer.entity.UserRole;

public interface UserRoleDao {
	
	Integer addUserRole(UserRole userRole);
	
	Integer validaRoleName(String roleName);
}
