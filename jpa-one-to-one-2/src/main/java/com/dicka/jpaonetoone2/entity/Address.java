package com.dicka.jpaonetoone2.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	
	@Column(name = "zip_code")
	private String zipCode;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private Library library;
	
	public Address(){
		
	}
	
	public Address(String street, String zipCode, Library library){
		this.street = street;
		this.zipCode = zipCode;
		this.library = library;
		this.library.setAddress(this);
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getZipCode(){
		return zipCode;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public Library getLibrary(){
		return library;
	}
	
	public void setLibrary(Library library){
		this.library = library;
	}
}
