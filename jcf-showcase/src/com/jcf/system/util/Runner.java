package com.jcf.system.util;

import java.util.ArrayList;
import java.util.List;

import com.jcf.sample.example.model.Example;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Runner {
//	public static void main(String[] args) throws Exception {
	public List<Example> getWebService() {
		String tmpWsXml = null;
	    String wsXml = null;
	    
		CallRestWS crws = new CallRestWS();
				
		try {
			tmpWsXml = crws.restClient();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tmpWsXml = tmpWsXml.replaceAll("resolves-to", "resolves_to");
		wsXml = tmpWsXml.replaceAll("double", "string");
		
	    XStream stream = new XStream(new DomDriver());
		stream.processAnnotations(Root.class);
//		
//		String pattern ="resolves-to";
//		stream.ignoreUnknownElements(pattern );
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/temp/test2.xml")));
//		
//		String temp =null;
//		String restring = null;
//        while( (temp = br.readLine()) != null) {
//        	restring = temp.replaceAll("resolves-to", "resolves_to");
//            aaa+= restring + "\n";
//        }
//       // String ttt =  crws.stripNonValidXMLCharacters(aaa);
//        System.out.println(aaa);
//        
////		Root fromXML = (Root)stream.fromXML(new FileInputStream("c:/temp/test2.xml"));
		Root fromXML = (Root)stream.fromXML(wsXml);
//		List<Root> aaa =  (Root)stream.fromXML(wsXml);
		//System.out.println("aaaaaaaaaaaa");
		
		//Example a = new Example();
		
		//List aa = (List) 
		List<Example> aa = new ArrayList<Example>();
		
		//System.out.println(fromXML.google.size());
		
		for(int i=0 ; i<fromXML.google.size();i++){
			Example e = new Example();
			//for (int j=0; j<fromXML.getGoogle().get(i).getEntry().size(); j++){
				e.setKeyFlag(fromXML.getGoogle().get(i).getEntry().get(0).getString().get(1));
				e.setHspName(fromXML.getGoogle().get(i).getEntry().get(1).getString().get(1));
				e.setLatitude(fromXML.getGoogle().get(i).getEntry().get(2).getString().get(1));
				e.setHspConstant(fromXML.getGoogle().get(i).getEntry().get(3).getString().get(1));
				e.setAddress(fromXML.getGoogle().get(i).getEntry().get(4).getString().get(1));
				e.setLongitude(fromXML.getGoogle().get(i).getEntry().get(5).getString().get(1));
				e.setWorkTime(fromXML.getGoogle().get(i).getEntry().get(6).getString().get(1));
				e.setRoadAddress(fromXML.getGoogle().get(i).getEntry().get(7).getString().get(1));
				e.setPostCode(fromXML.getGoogle().get(i).getEntry().get(8).getString().get(1));
				e.setParts(fromXML.getGoogle().get(i).getEntry().get(9).getString().get(1));
				e.setId(fromXML.getGoogle().get(i).getEntry().get(10).getString().get(1));
				e.setPhoneNo(fromXML.getGoogle().get(i).getEntry().get(11).getString().get(1));
				
 
				aa.add(e);
			//}

		}
		
		System.out.println("aa"+aa);
		
		//List<Example> aa = (List<Google>) new Root(); 
		//fromXML.getGoogle().listIterator()
		
		return  aa;
		
	}
	


}
