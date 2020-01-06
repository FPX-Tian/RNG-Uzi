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
	//��redi��spring�����ļ��У�����ע����Ǽ�Ⱥ���jedisCluster

	@Override
	public List<Product> getHot() {//�ó�����Ʒ
		ObjectMapper mapper = new ObjectMapper();
		//������service���ҵ���߼�
		//��hot��Ʒ����redis��Ŀ����ʲô��������Ϊ�˴�Reids����hot��Ʒ������
		//���˵�ǵ�һ������ҳ�棬ȥ����getHot����ȥ�������ң������п϶�û�У��Ǿ�ȥ�����ݿ�Ҫ��
		//��һ�ε�����ֻ������Դ�����ݿ⣬Ȼ�����redis������
		//������getHotһ���ˣ��Ǵ�Ҷ�Ҫ�õ����ݣ���һ�β�ѯ֮���Ӧ�÷ŵ�redis��ȥ��
		//���������ٵ���getHot������ȥredis���ң��ҵ���ֱ�����ߣ����Ҳ������ٲ�ȥ���ݿ�����
		
		//1.�ȴӻ�����ȥ�飬����û��Ҫ�ҵ�����
		System.out.println("�ӻ����в�����-----------------------");
		String result = jedisClient.hget("pjosn", "hot");
		//2.���������У���ȡ�����е�����
		if (result != null) {
			System.out.println("������������-----------------------");
			JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class,Product.class );
	    	try {
	    		List<Product> resultList = mapper.readValue(result, javaType);//��jackson��api��redis�е�json�ַ�ת����list���϶���
	    		return resultList;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//2.������û�еĻ��������ݿ��в�ѯ
		System.out.println("�����ݿ��в�����-----------------------");
		List<Product> list = dao.selectHot(10);//��һ�����ʵ��ˣ��϶�û�У���ȥ�����ݿ�
		try {
			String hotjson = mapper.writeValueAsString(list);//��jackson��api�Ѷ�����json���ַ���
			//3.�򻺴���������ݣ����½����ݷŵ������У�
			jedisClient.hset("pjosn", "hot", hotjson);
			System.out.println("�򻺴��б�������-----------------------");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//ͬ�����棺ֻ��Ҫɾ����������ݾͿ�
	public String syncRedisHdel(String hname,String hkey) {
		try {
			System.out.println("ɾ��redis�е�-------------"+hkey);
			jedisClient.hdel(hname, hkey);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ͨ���ʼ������֪ͨ����Աϵͳ��������");
			return "fail";
		}
		return "ok";
	}
}
