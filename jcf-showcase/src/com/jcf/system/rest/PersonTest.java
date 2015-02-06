package com.jcf.system.rest;

import com.jcf.system.util.CallRestWS;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class PersonTest {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		 //XStream xStream = new XStream();
			XStream xStream = new XStream(new StaxDriver());
	      xStream.alias("person", Person.class);
	      xStream.alias("persons", PersonList.class);
	      xStream.addImplicitCollection(PersonList.class, "personList"); 

	      PersonList p = new PersonList();
	  //    p.add(new Person(1, "사자", 16));
	  //    p.add(new Person(2, "고양이", 26));

	     CallRestWS crw = new CallRestWS();
		   String xml = null;
	
			//Example exp;
			xml = crw.restClient();
	 //     String xml = xStream.toXML(p);  // p 객체를 xml 로 변환
			
	    //  String xml = aaa;  // p 객체를 xml 로 변환

	      PersonList personList = (PersonList) xStream.fromXML(xml); // xml을 객체로 변환
	 //     Person pp = (Person) xStream.fromXML(xml);
	      System.out.print(personList);
	}

}
