package com.bean;

public class PurchaseBill {

	String date,medicine_name,category,vendor,Total_price,paid,unpaid;

	public PurchaseBill() {
		super();
	}

	public PurchaseBill(String date, String medicine_name, String category, String vendor, String total_price,
			String paid, String unpaid) {
		super();
		this.date = date;
		this.medicine_name = medicine_name;
		this.category = category;
		this.vendor = vendor;
		Total_price = total_price;
		this.paid = paid;
		this.unpaid = unpaid;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getTotal_price() {
		return Total_price;
	}

	public void setTotal_price(String total_price) {
		Total_price = total_price;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getUnpaid() {
		return unpaid;
	}

	public void setUnpaid(String unpaid) {
		this.unpaid = unpaid;
	}
	
}
