package com.bdqn.meitao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdqn.meitao.pojo.Area;
import com.bdqn.meitao.service.AreaService;

@Controller
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/getarea",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public Object getArea() {
		//掉service去查所有的area
		List<Area> alist = areaService.selectAll();
		
		return alist;
	}
}
