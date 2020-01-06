package com.bdqn.meitao.jedis.dao;

public interface JedisDao {//jedis对数据增，删，改，查的dao接口
	//调用jedis对象的方法，方法名跟redis的命令一致
	//String
	String set(String key, String value);
	String get(String key);
	long incr(String key);//加1
	long decrby(String key);
	
	//Hashes(Map)
	//redis命令：hset myhash field1 "s"：若字段 field1 不存在，创建该键及与其关联的 Hashes。
	//Hashes 中 key 为 field1，并设 value 为 s ，若字段 field1 存在，则无效。
	//jedis对于的方法
	long hset(String hkey, String key, String value);
	String hget(String hkey, String key);//添加hashset
	long hdel(String hkey, String key);
	
	//全局
	long expire(String key, int second);//设置有过期时间的变量
	long ttl(String key);//查看是否过期
	long del(String key);
}
