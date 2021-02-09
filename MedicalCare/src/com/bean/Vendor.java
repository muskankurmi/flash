package com.bean;

public class Vendor {
String s_no, vendor_name, purchase_history, contact_purpose, contact_no , address;

public Vendor() {
	super();
}

public Vendor(String s_no, String vendor_name, String purchase_history, String contact_purpose, String contact_no,
		String address) {
	super();
	this.s_no = s_no;
	this.vendor_name = vendor_name;
	this.purchase_history = purchase_history;
	this.contact_purpose = contact_purpose;
	this.contact_no = contact_no;
	this.address = address;
}

public String getS_no() {
	return s_no;
}

public void setS_no(String s_no) {
	this.s_no = s_no;
}

public String getVendor_name() {
	return vendor_name;
}

public void setVendor_name(String vendor_name) {
	this.vendor_name = vendor_name;
}

public String getPurchase_history() {
	return purchase_history;
}

public void setPurchase_history(String purchase_history) {
	this.purchase_history = purchase_history;
}

public String getContact_purpose() {
	return contact_purpose;
}

public void setContact_purpose(String contact_purpose) {
	this.contact_purpose = contact_purpose;
}

public String getContact_no() {
	return contact_no;
}

public void setContact_no(String contact_no) {
	this.contact_no = contact_no;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
