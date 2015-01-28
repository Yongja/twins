package com.jcf.system.util;
import java.util.List;

import org.jdom.Document;

import org.jdom.Element;

import org.jdom.input.SAXBuilder;

import org.jdom.output.XMLOutputter;


public class TestWS {
	String aaa ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CallRestWS crw = new CallRestWS();
		   String aaa = null;
		try {
			//Example exp;
			aaa = crw.restClient();
			

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println(aaa);
	

 


  try{

   SAXBuilder parser = new SAXBuilder();

   parser.setValidation(true);

   parser.setIgnoringElementContentWhitespace(true);

   Document doc = parser.build(aaa);

   

   XMLOutputter outp = new XMLOutputter();   

   

   Element root = doc.getRootElement();   

   List namedChildren = root.getChildren("PERSON");   

   Element test = (Element) namedChildren.get(0);

   

   System.out.println("test 1 : "+ test.getChildText("LASTNAME"));

   System.out.println("test 2 : "+ test.getChildText("FIRSTNAME"));

   System.out.println("test 3 : "+ test.getChildText("COMPANY"));

   System.out.println("test 4 : "+ test.getChildText("EMAIL"));

   

  }catch(Exception e){}

 }

}



