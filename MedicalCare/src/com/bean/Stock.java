package com.bean;

public class Stock {
	
	String medicine_name,status,strength,vendor,category,price;

	public Stock() {
		super();
	}

	public Stock(String medicine_name, String status, String strength, String vendor, String category, String price) {
		super();
		this.medicine_name = medicine_name;
		this.status = status;
		this.strength = strength;
		this.vendor = vendor;
		this.category = category;
		this.price = price;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	

}
