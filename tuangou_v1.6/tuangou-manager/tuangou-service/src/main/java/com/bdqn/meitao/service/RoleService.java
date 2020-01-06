package com.bdqn.meitao.service;

import java.util.List;

import com.bdqn.meitao.pojo.Role;

public interface RoleService {
	
	public Role findByRoleId(int id);
	
	public List<Role> findAllRole();

}
