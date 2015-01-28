package com.jcf.system.util;

 

	import java.io.File;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

	 

	public class TestXml {	 

	 public static void main(String argv[]) {

	 DocumentBuilderFactory t_dbf = null;
	 DocumentBuilder t_db = null;
	 Document t_doc = null;
	 NodeList t_nodes = null;
	 Element t_element = null;
	 InputSource t_is = new InputSource();
	 
	  try {
	   //File file = new File("onj.xml");
		   t_dbf = DocumentBuilderFactory.newInstance();
		   t_db = t_dbf.newDocumentBuilder();
		   t_is = new InputSource();
		   
		   CallRestWS crw = new CallRestWS();
		   String t_xmlStr = null;
	
		   t_xmlStr = crw.restClient();
		
		   System.out.println(t_xmlStr);
	
		   
		   t_is.setCharacterStream(new StringReader(t_xmlStr));
		   t_doc = t_db.parse(t_is);
		   t_nodes = t_doc.getElementsByTagName("entry");
		   
		   for (int i=0, t_len = t_nodes.getLength(); i< t_len;  i++){
			   t_element  = (Element) t_nodes.item(i);
			   System.out.println(t_element.getAttribute("string"));
		   }
		   
	   
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	}



