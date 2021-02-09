package com.bean;

public class Medicine {

	String s_no, medicine_name, category, strength, dosage_form, mfg_date, exp_date, market_prize, discount;

	public Medicine() {
		super();
	}

	public Medicine(String s_no, String medicine_name, String category, String strength, String dosage_form,
			String mfg_date, String exp_date, String market_prize, String discount) {
		super();
		this.s_no = s_no;
		this.medicine_name = medicine_name;
		this.category = category;
		this.strength = strength;
		this.dosage_form = dosage_form;
		this.mfg_date = mfg_date;
		this.exp_date = exp_date;
		this.market_prize = market_prize;
		this.discount = discount;
	}

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
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

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getDosage_form() {
		return dosage_form;
	}

	public void setDosage_form(String dosage_form) {
		this.dosage_form = dosage_form;
	}

	public String getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(String mfg_date) {
		this.mfg_date = mfg_date;
	}

	public String getExp_date() {
		return exp_date;
	}

	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}

	public String getMarket_prize() {
		return market_prize;
	}

	public void setMarket_prize(String market_prize) {
		this.market_prize = market_prize;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

}
