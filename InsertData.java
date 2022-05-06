package com.ml.CSVfile;

public class InsertData {
	private String id;
	private String address;
	private String city;
	private String state;
	private String postal_code;
	private String country;
	private String []Line=new String[6];
	
	public InsertData(String id, String address, String city, String state, String postal_code, String country) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.country = country;
		
	}
	public String[] getLine() {
		Line[0]=this.id;Line[1]=this.address;Line[2]=this.city;Line[3]=this.state;Line[4]=this.postal_code;Line[5]=this.country;;
		return Line;
	}
	public void setLine(String[] line) {
		Line = line;
	}
	public InsertData() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
