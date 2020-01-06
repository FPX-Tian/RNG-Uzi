package com.bdqn.meitao.portal.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdqn.meitao.pojo.Product;
import com.bdqn.meitao.portal.service.ProductService;
import com.bdqn.meitao.utils.HttpClientUtil;

@Controller
public class PortalController {

	@Autowired
	private ProductService pService;
	
	@RequestMapping("main")//main鍏跺疄灏变唬琛ㄧ潃涓�涓祫婧愬搴斾竴涓敮涓�鐨勮祫婧愭爣璇�
	public String main() {
		return "main";
	}	

	@RequestMapping("gethot")
	@ResponseBody  //杩斿洖缁欏鎴风json
	public Object ajaxmain() {
		System.out.println("gethot---------------------");
		List<Product> list = pService.getHot();
		return list;
	}
	@RequestMapping("getresp")
	@ResponseBody  //json
	public String gethttpResponse() {
		HashMap<String, String> user= new HashMap<String, String>();
		user.put("login", "admin");
		user.put("password", "123456");
		String result= HttpClientUtil.doPost("http://localhost:8080/login2", user);
		System.out.println("HttpClientUtil-------------"+result);
	return null;
	}
	//@RequestMapping("main")
	public ModelAndView showmain() {
		System.out.println("main---------------------");
		List<Product> list = pService.getHot();
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("plist", list);
		return mv;
	}

	//@RequestMapping("main") // 
	public String getJsonFromMeitao(HttpServletRequest request) throws ClientProtocolException, IOException {
		System.out.println("main json---------------------");
		// 1.鍒涘缓涓�涓猦ttpclient瀵硅薄
		CloseableHttpClient httpClient = HttpClients.createDefault();
		// 2.鍒涘缓涓�涓狦ET瀵硅薄
		HttpGet get = new HttpGet("http://localhost:8080/product/list");
		// 3.鎵ц姝ET璇锋眰
		CloseableHttpResponse response = httpClient.execute(get);
		// 4.鑾峰彇鍝嶅簲鐨勭粨鏋�
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println(statusCode);

		HttpEntity entity = response.getEntity();// 鑾峰彇鍝嶅簲浣�
		String string = EntityUtils.toString(entity, "utf-8");
		System.out.println(string);

		// 5.鍏抽棴httpclient
		response.close();
		httpClient.close();
		
		request.setAttribute("pjson", string);
		
		return "main";
	}

}
