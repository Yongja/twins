package com.jcf.system.util;

 
import java.io.File;
 
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import com.jcf.sample.example.model.Example;
 
public class XmlReaderExample {
 
//	public static void main(String argv[]) {
    public List getWebService(){
    	List wsList = new ArrayList();
		try {
			//File file = new File("./addressbook.xml");
			
			DocumentBuilderFactory docBuildFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuild = docBuildFact.newDocumentBuilder();
			
			CallRestWS crw = new CallRestWS();
			String aaa =  crw.restClient();
			
//			Document doc = docBuild.parse(file);
			
			//////////
			String addr = "http://api.data.go.kr/openapi/4f43aaf7-f391-4048-9532-f102b5ae0bbf"+"?serviceKey=";//"신청후 승인된 사용하실려는 서비스의 URL"+"?ServiceKey=";
			String serviceKey = "63cKTXSSLIa5yUJDQDLxn6d1s2Kpt%2FIYLol74pJsclTueGpBjq6KHfoeFSCgJFAN2QvjlpZ0Y%2B2%2FYgPWjEg1%2Bw%3D%3D";//"발급받으신 서비스키";
								  
			String parameter = "";
			String titleName = null;
			//인증키(서비스키) url인코딩
			//serviceKey = URLEncoder.encode(serviceKey, "UTF-8");
			
			/* parameter setting
			 * parameter = parameter + "&" + "PARAM1=AAA";
			 * parameter = parameter + "&" + "PARAM2=BBB";
			 * parameter = parameter + "&" + "PARAM3=CCC";
			 * */
			
			addr = addr + serviceKey + parameter;
			
			URL url = new URL(addr);
			//////////
			
			InputStream in = url.openStream(); 
			
			Document doc = docBuild.parse(in);
			doc.getDocumentElement().normalize();
 
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			System.out.println();
			
			
			
			// person엘리먼트 리스트
			NodeList personlist = doc.getElementsByTagName("entry");
 
			for (int i = 0; i < personlist.getLength(); i++) {
 
				System.out.println("---------- entry "+ i + "번째 ------------------");
 
				Node personNode = personlist.item(i);
 
				if (personNode.getNodeType() == Node.ELEMENT_NODE) {
					// person엘리먼트 
					Element personElmnt = (Element) personNode;
 
					// name 태그
					NodeList nameList= personElmnt.getElementsByTagName("string");
					Element nameElmnt = (Element) nameList.item(0);
	
					Node title = nameElmnt.getFirstChild();
					
					System.out.println("string    : " + title.getNodeValue());
					titleName = title.getNodeValue();
					String desc = null;
					// name 태그
	//			NodeList nameList1= personElmnt.getElementsByTagName("string");
					if (personElmnt.getElementsByTagName("null").getLength() != 0 ){
						System.out.println("string    : " + "없음!!!");
						desc = "--";
					}else if(personElmnt.getElementsByTagName("double").getLength() != 0){
						NodeList nameList1= personElmnt.getElementsByTagName("double");
						Element nameElmnt1 = (Element) nameList1.item(0);
						Node des1 = nameElmnt1.getFirstChild();
						
						System.out.println("string    : " + des1.getNodeValue());
						desc = des1.getNodeValue();
					}else{
						 
						nameElmnt = (Element) nameList.item(1);
						Node des = nameElmnt.getFirstChild();
						
						System.out.println("string    : " + des.getNodeValue());
						desc = des.getNodeValue();
					}
					HashMap<String, String> map =  new HashMap<String,String>();
					map.put(titleName, desc);
					
					
					wsList.add(map);
//					// tel 태그
//					NodeList telList= personElmnt.getElementsByTagName("tel");
//					Element telElmnt = (Element) telList.item(0);
//					Node tel = telElmnt.getFirstChild();
//					System.out.println("tel     : " + tel.getNodeValue());
// 
//					// address 태그
//					NodeList addressList= personElmnt.getElementsByTagName("address");
//					Element addressElmnt = (Element) addressList.item(0);
//					Node address = addressElmnt.getFirstChild();
//					System.out.println("address : " + address.getNodeValue());
				}
				 
				
				System.out.println("---------------------------------------------");
				System.out.println();
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wsList;
	}
}