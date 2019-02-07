package com.dicka.jpaonetoone.model;

public class RequestData {

	private String libraryName;
	private String addresStreet;
	private String addresZipcode;
	
	public RequestData(){
		
	}
	
	public RequestData(String libraryName, String addresStreet, String addresZipcode){
		this.libraryName = libraryName;
		this.addresStreet = addresStreet;
		this.addresZipcode = addresZipcode;
	}
	
	public String getLibraryName(){
		return libraryName;
	}
	
	public void setLibraryName(String libraryName){
		this.libraryName = libraryName;
	}
	
	public String getAddresStreet(){
		return addresStreet;
	}
	
	public void setAddresStreet(String addresStreet){
		this.addresStreet = addresStreet;
	}
	
	public String getAddresZipcode(){
		return addresZipcode;
	}
	
	public void setAddresZipcode(String addresZipcode){
		this.addresZipcode = addresZipcode;
	}
}
