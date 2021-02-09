package com.bean;

public class Billing {
	String date,medicine_name,price,discount,total_price,payment;

	public Billing() {
		super();
	}

	public Billing(String date, String medicine_name, String price, String discount, String total_price,
			String payment) {
		super();
		this.date = date;
		this.medicine_name = medicine_name;
		this.price = price;
		this.discount = discount;
		this.total_price = total_price;
		this.payment = payment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	

}
