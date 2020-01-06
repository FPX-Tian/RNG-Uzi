package com.bdqn.meitao.jedis.dao.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bdqn.meitao.jedis.dao.JedisDao;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisDaoSingle implements JedisDao{
	//Jedis jedis = new Jedis("192.168.1.199",6379);//我们依赖一个jedis，让spring给我们注入一个
	
	@Autowired
	private JedisPool jedisPool; //让spring给我们注入jedis的链接池，然后我们从池中获取jedis
	
	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.get(key);
		jedis.close();
		return string;
	}

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.set(key, value);
		jedis.close();
		return string;
	}

	@Override
	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.hget(hkey, key);
		jedis.close();
		return string;
	}

	@Override
	public long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(hkey, key, value);
		jedis.close();
		return result;
	}

	@Override
	public long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	@Override
	public long expire(String key, int second) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, second);
		jedis.close();
		return result;
	}

	@Override
	public long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		jedis.close();
		return result;
	}

	@Override
	public long del(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.del(key);
		jedis.close();
		return result;
	}

	@Override
	public long hdel(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hdel(hkey, key);
		jedis.close();
		return result;
	}

	@Override
	public long decrby(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.decr(key);
		return result;
	}

}
