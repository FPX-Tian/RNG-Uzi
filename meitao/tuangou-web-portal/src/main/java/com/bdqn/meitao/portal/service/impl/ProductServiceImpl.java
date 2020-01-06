package com.bdqn.meitao.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.meitao.dao.ProductMapper;
import com.bdqn.meitao.jedis.dao.JedisDao;
import com.bdqn.meitao.pojo.Product;
import com.bdqn.meitao.portal.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper dao;
	
	@Autowired
	private JedisDao jedisClient;
	//在redi的spring配置文件中，我们注入的是集群版的jedisCluster

	@Override
	public List<Product> getHot() {//拿畅销商品
		ObjectMapper mapper = new ObjectMapper();
		//以下是service层的业务逻辑
		//把hot商品存入redis的目的是什么？不就是为了从Reids中拿hot商品更快吗
		//如果说是第一个访问页面，去调用getHot，先去缓存中找，缓存中肯定没有，那就去找数据库要。
		//第一次的数据只可能来源于数据库，然后放入redis缓存中
		//当有人getHot一次了，是大家都要用的数据，第一次查询之后就应该放到redis中去了
		//后续的人再调用getHot，首先去redis中找，找到就直接拿走，若找不到，再才去数据库中找
		
		//1.先从缓存中去查，看有没有要找的数据
		System.out.println("从缓存中查数据-----------------------");
		String result = jedisClient.hget("pjosn", "hot");
		//2.若缓存中有，则取缓存中的数据
		if (result != null) {
			System.out.println("缓存中有数据-----------------------");
			JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class,Product.class );
	    	try {
	    		List<Product> resultList = mapper.readValue(result, javaType);//用jackson的api把redis中的json字符转换成list集合对象
	    		return resultList;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//2.缓存中没有的话，从数据库中查询
		System.out.println("从数据库中查数据-----------------------");
		List<Product> list = dao.selectHot(10);//第一个访问的人，肯定没有，得去查数据库
		try {
			String hotjson = mapper.writeValueAsString(list);//用jackson的api把对象变成json的字符串
			//3.向缓存中添加内容（重新将数据放到缓存中）
			jedisClient.hset("pjosn", "hot", hotjson);
			System.out.println("向缓存中保持数据-----------------------");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//同步缓存：只需要删除缓存的数据就可
	public String syncRedisHdel(String hname,String hkey) {
		try {
			System.out.println("删除redis中的-------------"+hkey);
			jedisClient.hdel(hname, hkey);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("通过邮件或短信通知管理员系统出错啦！");
			return "fail";
		}
		return "ok";
	}
}
