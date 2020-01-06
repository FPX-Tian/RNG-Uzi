package com.bdqn.meitao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.meitao.dao.RoleMapper;
import com.bdqn.meitao.pojo.Role;
import com.bdqn.meitao.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper dao;
	
	@Override
	public Role findByRoleId(int id) {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public List<Role> findAllRole() {
		return dao.selectByExample(null);
	}

}
