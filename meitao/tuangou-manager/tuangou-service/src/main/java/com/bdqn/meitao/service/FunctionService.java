package com.bdqn.meitao.service;

import java.util.List;

import com.bdqn.meitao.pojo.Functions;

public interface FunctionService {
	public List<Functions> findFunByPid(int pid);
}
