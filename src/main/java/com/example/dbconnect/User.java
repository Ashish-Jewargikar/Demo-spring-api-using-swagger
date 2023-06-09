package com.example.dbconnect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {

	@Id
	private int id;
	private String name;
	private int age;
	private int phoneNo;
	private String address;
	
	
	public User() {
	}


	public User(int id, String name, int age, int phoneNo,String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address=address;
	}


	public int getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
