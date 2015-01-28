package com.jcf.system.util;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("list")
public class Root {
	
	@XStreamImplicit(itemFieldName="com.google.gson.internal.LinkedTreeMap")
//	@XStreamAlias("LinkedTreeMap")
	List<Google> google;
	
	/**
	 * @return the google
	 */
	public List<Google> getGoogle() {
		return google;
	}

	public void setGoogle(List<Google> google) {
		this.google = google;
	}
	

	public class Google {
		
		@XStreamAlias("resolves_to")
		@XStreamAsAttribute
		String resolves;

		/**
		 * @return the resolves
		 */
		public String getResolves() {
			return resolves;
		}

		/**
		 * @param resolves the resolves to set
		 */
		public void setResolves(String resolves) {
			this.resolves = resolves;
		}

		@XStreamImplicit
//		private Resolves resoves;
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
	}
	
	
}
