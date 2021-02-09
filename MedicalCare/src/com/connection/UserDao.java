package com.connection;
import com.bean.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.User;

public class UserDao {

	private String dburl = "jdbc:mysql://localhost:3306/medicalshop";
	private String dbuname = "root";
	private String dbpassword = "root";
	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	//for user details //

	public String insert(User user) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.users values (?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPhone());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}

	public boolean validate(User user) throws ClassNotFoundException {
		boolean status = false;

		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "user login successfull";
		String sql = "select * from medicalshop.users where uname=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPassword());
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "user login failed";
		}

		return status;

	}

	
	//admin login
	
	public boolean validate(Admin admin) throws ClassNotFoundException {
		boolean status = false;

		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "user login successfull";
		String sql = "select * from medicalshop.admin where username=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,admin.getUsername());
			ps.setString(2, admin.getPassword());
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "admin login failed";
		}

		return status;

	}


	
	
	
	// for medicine details //
	
	public String insert(Medicine medicine) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.medicine values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, medicine.getS_no());
			ps.setString(2, medicine.getMedicine_name());
			ps.setString(3, medicine.getCategory());
			ps.setString(4, medicine.getStrength());
			ps.setString(5, medicine.getDosage_form());
			ps.setString(6, medicine.getMfg_date());
			ps.setString(7, medicine.getExp_date());
			ps.setString(8, medicine.getMarket_prize());
			ps.setString(9, medicine.getDiscount());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}
	
	//update medcne
	public String update(Medicine medicine) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "update medicalshop.medicine set medicine_name=?,category=?,strength=?,dosage_form=?,mfg_date=?,exp_date=?,market_prize=?,discount=?where s_no=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, medicine.getS_no());
			ps.setString(2, medicine.getMedicine_name());
			ps.setString(3, medicine.getCategory());
			ps.setString(4, medicine.getStrength());
			ps.setString(5, medicine.getDosage_form());
			ps.setString(6, medicine.getMfg_date());
			ps.setString(7, medicine.getExp_date());
			ps.setString(8, medicine.getMarket_prize());
			ps.setString(9, medicine.getDiscount());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}


	
	public String delete(String s_no) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data deleted successfully";
		String sql = "delete from medicalshop.medicine where s_no=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s_no);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not deleted";
		}
		return result;

	}
	
	
	
	public List<Medicine> getAllRecords1(){
		loadDriver (dbdriver);
		Connection con = getConnection();
		List<Medicine> medicineList=null;
		String result = "data fatched successfully";
		String sql = "select * from medicalshop.medicine";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				medicineList =new ArrayList<>();
				do {
					Medicine medicine= new Medicine();
					medicine.setS_no(rs.getString("s_no"));
					medicine.setMedicine_name(rs.getString("medicine_name"));
					medicine.setCategory(rs.getString("category"));
					medicine.setStrength(rs.getString("strength"));
					medicine.setDosage_form(rs.getString("dosage_form"));
					medicine.setMfg_date(rs.getString("mfg_date"));
					medicine.setExp_date(rs.getString("exp_date"));
					medicine.setMarket_prize(rs.getString("market_prize"));
					medicine.setDiscount(rs.getString("discount"));
					medicineList.add(medicine);
				
				
			}while(rs.next());
			}} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicineList;
	}


	//for vendor details //
	

	public String insert(Vendor vendor) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.vendor_table values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vendor.getS_no());
			ps.setString(2, vendor.getVendor_name());
			ps.setString(3, vendor.getPurchase_history());
			ps.setString(4, vendor.getContact_purpose());
			ps.setString(5, vendor.getContact_no());
			ps.setString(6, vendor.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}

	public List<Vendor> getAllRecords() {
		loadDriver(dbdriver);
		List<Vendor> vendorList=null;
		Connection con = getConnection();
		String result = "data fatched successfully";
		String sql = "select * from medicalshop.vendor_table";
		

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vendorList=new ArrayList<>();
				do {
					Vendor vendor=new Vendor();
					vendor.setS_no(rs.getString("s_no"));
					vendor.setVendor_name(rs.getString("vendor_name"));
					vendor.setPurchase_history(rs.getString("purchase_history"));
					vendor.setContact_purpose(rs.getString("contact_purpose"));
					vendor.setContact_no(rs.getString("contact_no"));
					vendor.setAddress(rs.getString("address"));
					
				vendorList.add(vendor);
				
				
			}while(rs.next());
			}} catch (SQLException e) {
			e.printStackTrace();
		}
		return vendorList;
	}
	
	// for stock cheack
	
	public String insert(Stock stock) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.stock values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, stock.getMedicine_name());
			ps.setString(2, stock.getStatus());
			ps.setString(3, stock.getStrength());
			ps.setString(4, stock.getVendor());
			ps.setString(5, stock.getCategory());
			ps.setString(6, stock.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}

	// for billing 
	
	public String insert(Billing billing) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.billing values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, billing.getDate());
			ps.setString(2, billing.getMedicine_name());
			ps.setString(3, billing.getPrice());
			ps.setString(4, billing.getDiscount());
			ps.setString(5, billing.getTotal_price());
			ps.setString(6, billing.getPayment());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}
	
	// for total sale of the day
	
	public String insert(DayBilling daybilling) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.day_billing values (?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, daybilling.getDate());
			ps.setString(2, daybilling.getDay());
			ps.setString(3, daybilling.getTotal_sale());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}
	
	// for purchase billing fron vendors
	
	public String insert(PurchaseBill purchaseBill) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.purchase_bill values (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, purchaseBill.getDate());
			ps.setString(2, purchaseBill.getMedicine_name());
			ps.setString(3, purchaseBill.getCategory());
			ps.setString(4, purchaseBill.getVendor());
			ps.setString(5, purchaseBill.getTotal_price());
			ps.setString(6, purchaseBill.getPaid());
			ps.setString(7, purchaseBill.getUnpaid());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}	
	
	public String insert(Invoice invoice) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "data entered successfully";
		String sql = "insert into medicalshop.bill values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, invoice.getBatch_no());
			ps.setString(2, invoice.getName());
			ps.setString(3, invoice.getEmail());
			ps.setString(4, invoice.getDate());
			ps.setString(5, invoice.getPayment_method());
			ps.setString(6, invoice.getItem());
			ps.setString(7, invoice.getExpiry_date());
			ps.setString(8, invoice.getQuantity());
			ps.setString(9, invoice.getPrice());
			ps.setString(10, invoice.getGst());
			ps.setString(11, invoice.getDiscount());
			ps.setString(12, invoice.getFinal_amount());
			ps.setString(13, invoice.getTotal());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		return result;

	}	

}
