package com.jcf.system.util;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;

public class CallRestWS {
	public String restClient() throws Exception{
		String addr = "http://api.data.go.kr/openapi/4f43aaf7-f391-4048-9532-f102b5ae0bbf"+"?serviceKey=";//"신청후 승인된 사용하실려는 서비스의 URL"+"?ServiceKey=";
		String serviceKey = "63cKTXSSLIa5yUJDQDLxn6d1s2Kpt%2FIYLol74pJsclTueGpBjq6KHfoeFSCgJFAN2QvjlpZ0Y%2B2%2FYgPWjEg1%2Bw%3D%3D";//"발급받으신 서비스키";
							  
		String parameter = "";
		
		//인증키(서비스키) url인코딩
		//serviceKey = URLEncoder.encode(serviceKey, "UTF-8");
		
		/* parameter setting
		 * parameter = parameter + "&" + "PARAM1=AAA";
		 * parameter = parameter + "&" + "PARAM2=BBB";
		 * parameter = parameter + "&" + "PARAM3=CCC";
		 * */
		
		addr = addr + serviceKey + parameter;
		
		URL url = new URL(addr);
		InputStream in = url.openStream(); 
		CachedOutputStream bos = new CachedOutputStream();
		IOUtils.copy(in, bos);
		in.close();
		bos.close();
		return bos.getOut().toString();
	}
	
}
