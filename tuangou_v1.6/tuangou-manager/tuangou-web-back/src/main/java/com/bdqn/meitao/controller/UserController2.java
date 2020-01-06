package com.bdqn.meitao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdqn.meitao.pojo.Functions;
import com.bdqn.meitao.pojo.Privilege;
import com.bdqn.meitao.pojo.Role;
import com.bdqn.meitao.pojo.User;
import com.bdqn.meitao.service.FunctionService;
import com.bdqn.meitao.service.PrivilegeService;
import com.bdqn.meitao.service.RoleService;
import com.bdqn.meitao.service.UserService;

@Controller
public class UserController2 {
	@Autowired
	UserService userService;
	
	@Autowired
	PrivilegeService priService;
	
	@Autowired
	FunctionService funService;
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/login2")
	public ModelAndView login(@RequestParam("login") String name,@RequestParam("password") String pwd) {
		System.out.println("login controller------------------");
		System.out.println(name+"  "+pwd);
		//调用sevice层处理登录业务,缺什么写什么！！！
		User user = userService.findByNameAndPwd(name, pwd);
		ModelAndView mv = new ModelAndView();
		if(user != null) {
			mv.setViewName("main");
			mv.addObject("user", user);
		}else {
			mv.setViewName("login");
			mv.addObject("error", "用户名或密码错误！");
		}
		return mv;
	}
	
	// @RequestMapping中produces属性可以设置返回数据的类型以及编码，可以是json或者xml
	// 但是必须要和@ResponseBody注解一起使用才可以，不加@ResponseBody注解,相当于按照和返回String同名jsp页面解析自然就会报错。
	// 如果返过来，不加produces属性，只有@ResponseBody注解的话也是没有问题的，只是在浏览器中直接访问的时候有区别：
	// 方法一 ：produces有两个好处：一个是浏览器查看方便（json自动格式化，带搜索），另一个可以防止中文乱码。书p285
	@RequestMapping(value="/getpri",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public Object getpri(@RequestParam("roleId") Integer rid) {
		System.out.println("roleId----------------"+rid);
		//根据角色ID查权限
		List<Privilege> plist = priService.findByRoleId(rid);
		//a.定义一个list集合存放整个json数据，所以的权限
		List<Map> result = new ArrayList<Map>();
		
		for(int i=0;i<plist.size();i++) {
			Privilege  p = plist.get(i);//该role对象的每项权限
			HashMap map = new HashMap();
			map.put("text", p.getPrivilegeName());
			
			List<Map> clist = new ArrayList<Map>();//放某个权限下的功能集合
			List<Functions> flist = funService.findFunByPid(p.getPrivilegeId());//查询出当前Privilege下的所有功能
			for(int j =0;j<flist.size();j++) {
				HashMap map2 = new HashMap();
				Functions fun = flist.get(j);//该role下某个Privilege下的某功能
				map2.put("text", fun.getFunctionName());
				HashMap map3 = new HashMap();
				map3.put("url", fun.getUrl());
				map2.put("attributes", map3);
				clist.add(map2);
			}
			map.put("children", clist);
			
			result.add(map);
		}
		
		//5.最后还要将我们查出的用户所拥有的权限和功能做成json传给前端页面
		//以上5件事情可以有多种方法实现
		
		//主流的4中json解析技术，用jackson工具帮我们生产json ,前提是，json工具操作的是对象，对象怎么来？
		//将result转换为json
		return result;
	}
	
	//1.打开权限管理页面，查询出所有的后台用户，并显示出所有用户的信息和该用的角色
	//2.点开你要修改那个用户，并列出项目的角色列表，供选择
	//3.更改用户角色后，重新保存
	@RequestMapping("/getAllUser")
	public ModelAndView getAllUser() {
		
		List<User> ulist = userService.findAllUser();
		List<Role> rlist = roleService.findAllRole();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ulist");
		mv.addObject("ulist", ulist);
		mv.addObject("rlist", rlist);
		return mv;
	}
	
	@RequestMapping("/getUserById")
	public ModelAndView getAllUser(@RequestParam("uid") Integer id) {
		
		User user = userService.findUserById(id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user");
		mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(@RequestParam("uid") Integer uid,@RequestParam("rid") Integer rid) {
				
		int i = userService.updateUserPrivilege(uid, rid);
		if(i == 1) {
			return "redirect:getAllUser";
		}
		return "fail";
	}

}
