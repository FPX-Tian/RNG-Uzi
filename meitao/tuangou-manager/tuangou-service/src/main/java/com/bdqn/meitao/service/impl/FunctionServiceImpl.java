package com.bdqn.meitao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.meitao.dao.FunctionsMapper;
import com.bdqn.meitao.pojo.Functions;
import com.bdqn.meitao.service.FunctionService;

@Service
public class FunctionServiceImpl implements FunctionService{
	@Autowired
	FunctionsMapper dao;
	
	@Override
	public List<Functions> findFunByPid(int pid) {
		return dao.selectByPrivilegeId(pid);
	}

}
