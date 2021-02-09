package com.bean;

public class DayBilling {

	 String date, day, total_sale;

	public DayBilling() {
		super();
	}

	public DayBilling(String date, String day, String total_sale) {
		super();
		this.date = date;
		this.day = day;
		this.total_sale = total_sale;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTotal_sale() {
		return total_sale;
	}

	public void setTotal_sale(String total_sale) {
		this.total_sale = total_sale;
	}
}
