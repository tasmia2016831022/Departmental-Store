package com.testProject.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mytable")
public class User {
	
	@Id
	private String username;
	private String address;
	private int phone;
	private String password;
	
	

	public User() {
		
	}

	public User(String username, String address,int phone,String password) {
		this.username = username;
		this.address = address;
		this.phone =phone;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", address=" + address + ", phone=" + phone + ", password=" + password
				+ "]";
	}
	
	

}
