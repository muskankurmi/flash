package com.bean;

public class Admin {
	
	String admin_name, username, password, email, phone;

	public Admin() {
		super();
	}

	public Admin(String admin_name, String username, String password, String email, String phone) {
		super();
		this.admin_name = admin_name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}