package com.bean;

public class Invoice {
	String batch_no ,name,email,date,payment_method,item,expiry_date,quantity,price,gst,discount,final_amount,total;

	public Invoice() {
		super();
	}

	public Invoice(String batch_no, String name, String email, String date, String payment_method, String item,
			String expiry_date, String quantity, String price, String gst, String discount, String final_amount,
			String total) {
		super();
		this.batch_no = batch_no;
		this.name = name;
		this.email = email;
		this.date = date;
		this.payment_method = payment_method;
		this.item = item;
		this.expiry_date = expiry_date;
		this.quantity = quantity;
		this.price = price;
		this.gst = gst;
		this.discount = discount;
		this.final_amount = final_amount;
		this.total = total;
	}

	public String getBatch_no() {
		return batch_no;
	}

	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFinal_amount() {
		return final_amount;
	}

	public void setFinal_amount(String final_amount) {
		this.final_amount = final_amount;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}
