package com.bdqn.meitao.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bdqn.meitao.pojo.Product;
import com.bdqn.meitao.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ProductController {
	
	@Autowired
	ProductService proService;
	
	@RequestMapping(value = "/product/listall", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public Object getAllProduct() throws IOException {
		return proService.getAllProduct();
	}
	
	@RequestMapping(value = "/product/listall2")
	public void getAllProduct2(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Product> plist = proService.getAllProduct();
		String json = mapper.writeValueAsString(plist);//准备好的红包
		
		try {  
	        response.setContentType("text/plain");  
	        response.setHeader("Pragma", "No-cache");  
	        response.setHeader("Cache-Control", "no-cache");  
	        response.setDateHeader("Expires", 0);  
	        
	        response.setCharacterEncoding("utf-8");
	        
	        Map<String,String> map = new HashMap<String,String>();   
	        map.put("result", "content");  
	        PrintWriter out = response.getWriter();    
	        
	        String jsonpCallback = request.getParameter("jsonpCallback");//客户端请求参数 ,好比藏红包的那个笔记本
	        
	        out.println(jsonpCallback + "(" +json+ ")" );//返回jsonp格式数据  
	        out.flush();  
	        out.close();  
	      } catch (IOException e) {  
	       e.printStackTrace();  
	      }  
		
	}
	
	@RequestMapping(value = "/product/list", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public Object proListByPage(int page, int rows) throws IOException {
		// 前端框架datagrid 分页操作会传两个参数，page页码，rows行数，给服务端
		System.out.println("------------page:" + page + "  " + "rows:" + rows);
		List<Product> list = proService.getByPage(Integer.valueOf(page),Integer.valueOf(rows));
		Collections.reverse(list);// 将所有商品反转，优先显示最新添加的商品

		// JONS解析四大主流工具：Gson,jackson,fastJson,json-lib
		//{'total': 总记录数 ,'rows': [{"productid":1,"title":"虎标苦荞茶","productdesc":"香浓","originalprice":38.00000,"currentprice":12.70140,"areaid":4,"shopid":3,"categoryid":13,"picture":null,"salescount":null,"iscommend":null},{"productid":2,"title":"味客吉柿饼","productdesc":"解酒","originalprice":12.50000,"currentprice":4.19840,"areaid":4,"shopid":3,"categoryid":13,"picture":null,"salescount":null,"iscommend":null}]},
		Map<String, Object> jsonMap = new HashMap<String, Object>();// 定义map
		jsonMap.put("total", proService.getCount());// total键 存放总记录数，必须的
		jsonMap.put("rows", list);// rows键 存放每页记录 list

		return jsonMap;
	}

	//http://localhost:8080/product/all
	@RequestMapping(value = "/product/all")
	public String showAll() {
		return "prolist";//给前端返回prolist.jsp这个页面
	}
	
	@RequestMapping(value = "/showAddP")
	public String showAdd() {
		System.out.println("------------添加商品页面");
		return "addpro";
	}
	
	// 添加商品 +多文件上传
	@RequestMapping(value = "/product/add", method = RequestMethod.POST) // 服务端数据校验
	public String addPro(Product pro, HttpSession session, HttpServletRequest request,
			@RequestParam(value = "attachs", required = false) MultipartFile[] attachs) {//多个文件放到MultipartFile数组中
		// 定义多个变量用来存放文件保存的路径
		String picPath1 = null;
		String picPath2 = null;

		String errorInfo = null;// 用来存放上传失败时的错误信息
		boolean flag = true;

		//拼接图片存放的路径
		String path = request.getSession().getServletContext().getRealPath("upload" + File.separator + "goods");
		System.out.println("uploadFile path ============== > " + path);

		for (int i = 0; i < attachs.length; i++) {
			MultipartFile attach = attachs[i];
			if (!attach.isEmpty()) {
				if (i == 0) {
					errorInfo = "uploadPic1Error";
				} else if (i == 1) {
					errorInfo = "uploadPic2Error";
				}

				String oldFileName = attach.getOriginalFilename();// 获取文件原名
				System.out.println("uploadFile oldFileName ============== > " + oldFileName);

				String suffix = FilenameUtils.getExtension(oldFileName);// 获取原文件名后缀
				System.out.println("uploadFile prefix============> " + suffix);

				int filesize = 500000;// 设置上传文件的大小 500kb
				System.out.println("uploadFile size============> " + attach.getSize());

				if (attach.getSize() > filesize) {// 上传大小不得超过 500k
					request.setAttribute(errorInfo, " * 上传大小不得超过 500k");
					flag = false;
				} else if (suffix.equalsIgnoreCase("jpg") || suffix.equalsIgnoreCase("png")
						|| suffix.equalsIgnoreCase("jpeg") || suffix.equalsIgnoreCase("pneg")) {//若都不成立则上传图片格式不正确
					String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1, 1000000) + "_pro.jpg";// 随机生一个整数作为文件名前部分
					System.out.println("new fileName==========> " + attach.getName());

					File targetFile = new File(path, fileName);//创建图片保存的文件对象

					if (!targetFile.exists()) {// 若存放文件的目录（文件）不存在，则要创建该目录
						targetFile.mkdirs();
					}

					try {
						attach.transferTo(targetFile); // 将文件保存到上面创建的目录中（io流写的过程）
					} catch (Exception e) {
						e.printStackTrace();
						request.setAttribute(errorInfo, " * 上传失败！");
						flag = false;
					}
					if (i == 0) {
						picPath1 = path + File.separator + fileName;
					} else if (i == 1) {
						picPath2 = path + File.separator + fileName;
					}
				} else {
					request.setAttribute(errorInfo, " * 上传图片格式不正确");
					flag = false;
				}
			}
		}

		if (flag) {
//			user.setCreatedBy(((User)session.getAttribute(Constants.USER_SESSION)).getId());
			pro.setPicture(picPath1);
			int i = proService.addProduct(pro);// 把商品保存到数据库中
			if (i == 1) {
//				return "redirect:/product/list2";//方法二：服务端直接跳转到第二个请求，把数据查出来丢给前端
				return "prolist";// 方法一：prolist.jsp自己去请求数据
			}
		}
		return "addPro";
	}
}
