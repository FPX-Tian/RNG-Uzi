package com.bdqn.meitao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.meitao.dao.AreaMapper;
import com.bdqn.meitao.pojo.Area;
import com.bdqn.meitao.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaMapper dao ;

	@Override
	public List<Area> selectAll() {
		return dao.selectByExample(null);
	}

}
