package com.bdqn.meitao.service;

import java.util.List;

import com.bdqn.meitao.pojo.User;

public interface UserService {
	
	public User findByNameAndPwd(String name ,String pwd);//缺什么写什么！！！
	
	public User findUserById(int id);
	
	public List<User> findAllUser();
	
	public int updateUserPrivilege(int uid,int rid);

}
