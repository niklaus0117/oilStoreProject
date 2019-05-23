package com.store.clientsoft.customer.dao;

import org.apache.ibatis.annotations.Param;

import com.store.clientsoft.customer.entity.UserRole;

public interface UserRoleDao {
	
	Integer addUserRole(UserRole userRole);
	
	Integer validaRoleName(@Param("roleName")String roleName);
}
