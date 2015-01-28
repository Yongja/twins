package com.jcf.system.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias("list")
public class Root2 {
	
	@XStreamImplicit
	List<Entry> entry;

	public List<Entry> getEntry() {
		return entry;
	}

	public void setEntry(List<Entry> entry) {
		this.entry = entry;
	}
	
	public class Entry {
		@XStreamImplicit
		List<String> string;

		public List<String> getString() {
			return string;
		}

		public void setString(List<String> string) {
			this.string = string;
		}
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {

		XStream stream = new XStream(new DomDriver());
		
		stream.processAnnotations(Root2.class);
		
		Root2 fromXML = (Root2)stream.fromXML(new FileInputStream("c:/temp/test3.xml"));
		
		System.out.println("aaaaaaaaaaaa");
				
	}

}
