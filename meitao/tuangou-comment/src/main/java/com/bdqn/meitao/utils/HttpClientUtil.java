package com.bdqn.meitao.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {
	public static String doGet(String url,Map<String, String> param){
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String resultString ="";
		CloseableHttpResponse response=null;
		try {
			URIBuilder builder =new URIBuilder(url);
			if(param!=null){
				for (String key : param.keySet()) {
					builder.addParameter(key, param.get(key));//效果http://localhost:8081/httpclien?key1=value1&key2=value2
				}
			}
			URI uri =builder.build();//绑定请求要传递的参数
			
			//创建http GET请求
			HttpGet httpGet =new HttpGet(uri);
			//执行请求
			response=httpClient.execute(httpGet);
			//判断返回状态是否为200
			if(response.getStatusLine().getStatusCode()==200){
				resultString=EntityUtils.toString(response.getEntity(),"UTF-8");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(response!=null){
					response.close();
				}
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultString;
	}

	public static String doGet(String url){
		return doGet(url,null);
	}
	public static String doPost(String url,Map<String, String> param){
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response=null;
		String resultString ="";
		try {
			HttpPost httpPost =new HttpPost(url);
			if(param!=null){
				List<NameValuePair> paramList=new ArrayList<NameValuePair>();
				for (String key : param.keySet()) {
					paramList.add(new BasicNameValuePair(key, param.get(key)));//效果http://localhost:8081/httpclien?key1=value1&key2=value2
				}
				UrlEncodedFormEntity entity=new UrlEncodedFormEntity(paramList);
				httpPost.setEntity(entity);
			}
			response=httpClient.execute(httpPost);
			resultString=EntityUtils.toString(response.getEntity(),"UTF-8");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
					response.close();
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultString;
	}

	public static String doPost(String url){
		return doGet(url,null);
	}
	public static String doPostJson(String url,String json){
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response=null;
		String resultString ="";
		try {
		HttpPost httpPost =new HttpPost(url);
		StringEntity entity  = new StringEntity(json,ContentType.APPLICATION_JSON);
		httpPost.setEntity(entity);
		response = httpClient.execute(httpPost);
		resultString=EntityUtils.toString(response.getEntity(),"UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				response.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultString;
	}
}
