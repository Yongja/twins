package com.jcf.system.rest;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Person")
public class Person {
//		private int id;
//	   private String name;
//	   private int age;
//
//	   public Person(int id, String name, int age) {
//	      this.id = id;
//	      this.name = name;
//	      this.age = age;
//	   }
	   
	private String keyFlag;
	private String HspName;
	private String latitude;
	private String HspConstant;
	private String address;
	private String longitude;
	private String workTime;
	private String roadAddress;
	private String postCode;
	private String parts;
	private String id;
	private String phoneNo;

		   public Person(String keyFlag, String HspName, String latitude,String HspConstant, String address
				   ,String longitude
				   ,String workTime
				   ,String roadAddress
				   ,String postCode
				   ,String parts
				   ,String id
				   ,String phoneNo) {
		      this.keyFlag = keyFlag;
		      this.HspName = HspName;
		      this.latitude = latitude;
		      this.HspConstant = HspConstant;
		      this.address = address;
		  	this.longitude = longitude;
		  	this.workTime = workTime;
		  	this.roadAddress = roadAddress;
		  	this.postCode = postCode;
		  	this.parts =  parts;
		  	this.id =  id;
		  	this.phoneNo = phoneNo;
		   }
		   
//	private String keyFlag;
//	private String HspName;
//	private String latitude;
//	private String HspConstant;
//	private String address;
//	private String longitude;
//	private String workTime;
//	private String roadAddress;
//	private String postCode;
//	private String parts;
//	private String id;
//	private String phoneNo;
//	/**
//	 * @return the keyFlag
//	 */
//	public String getKeyFlag() {
//		return keyFlag;
//	}
//	/**
//	 * @param keyFlag the keyFlag to set
//	 */
//	public void setKeyFlag(String keyFlag) {
//		this.keyFlag = keyFlag;
//	}
//	/**
//	 * @return the hspName
//	 */
//	public String getHspName() {
//		return HspName;
//	}
//	/**
//	 * @param hspName the hspName to set
//	 */
//	public void setHspName(String hspName) {
//		HspName = hspName;
//	}
//	/**
//	 * @return the latitude
//	 */
//	public String getLatitude() {
//		return latitude;
//	}
//	/**
//	 * @param latitude the latitude to set
//	 */
//	public void setLatitude(String latitude) {
//		this.latitude = latitude;
//	}
//	/**
//	 * @return the hspConstant
//	 */
//	public String getHspConstant() {
//		return HspConstant;
//	}
//	/**
//	 * @param hspConstant the hspConstant to set
//	 */
//	public void setHspConstant(String hspConstant) {
//		HspConstant = hspConstant;
//	}
//	/**
//	 * @return the address
//	 */
//	public String getAddress() {
//		return address;
//	}
//	/**
//	 * @param address the address to set
//	 */
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	/**
//	 * @return the longitude
//	 */
//	public String getLongitude() {
//		return longitude;
//	}
//	/**
//	 * @param longitude the longitude to set
//	 */
//	public void setLongitude(String longitude) {
//		this.longitude = longitude;
//	}
//	/**
//	 * @return the workTime
//	 */
//	public String getWorkTime() {
//		return workTime;
//	}
//	/**
//	 * @param workTime the workTime to set
//	 */
//	public void setWorkTime(String workTime) {
//		this.workTime = workTime;
//	}
//	/**
//	 * @return the roadAddress
//	 */
//	public String getRoadAddress() {
//		return roadAddress;
//	}
//	/**
//	 * @param roadAddress the roadAddress to set
//	 */
//	public void setRoadAddress(String roadAddress) {
//		this.roadAddress = roadAddress;
//	}
//	/**
//	 * @return the postCode
//	 */
//	public String getPostCode() {
//		return postCode;
//	}
//	/**
//	 * @param postCode the postCode to set
//	 */
//	public void setPostCode(String postCode) {
//		this.postCode = postCode;
//	}
//	/**
//	 * @return the parts
//	 */
//	public String getParts() {
//		return parts;
//	}
//	/**
//	 * @param parts the parts to set
//	 */
//	public void setParts(String parts) {
//		this.parts = parts;
//	}
//	/**
//	 * @return the id
//	 */
//	public String getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(String id) {
//		this.id = id;
//	}
//	/**
//	 * @return the phoneNo
//	 */
//	public String getPhoneNo() {
//		return phoneNo;
//	}
//	/**
//	 * @param phoneNo the phoneNo to set
//	 */
//	public void setPhoneNo(String phoneNo) {
//		this.phoneNo = phoneNo;
//	}
	
}
