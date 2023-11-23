package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class UserEntity {
	 
	@Id
	@Column
	private String email;
	
	@Column 
	private String name;
	
	@Column
	private String mobile;
	
	@Column 
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [email=" + email + ", name=" + name + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
	

}
