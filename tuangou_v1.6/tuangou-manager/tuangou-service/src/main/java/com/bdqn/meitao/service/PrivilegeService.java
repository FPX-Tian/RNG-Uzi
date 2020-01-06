package com.bdqn.meitao.service;

import java.util.List;

import com.bdqn.meitao.pojo.Privilege;

public interface PrivilegeService {
	 public List<Privilege> findByRoleId(int id);
}
