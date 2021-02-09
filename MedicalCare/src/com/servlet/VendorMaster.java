package com.servlet;

import com.bean.*;
import com.connection.*;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VendorMaster
 */
@WebServlet("/VendorMaster")
public class VendorMaster extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorMaster() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String s_no = request.getParameter("s_no");
		String vendor_name = request.getParameter("vendor_name");
		String purchase_history  = request.getParameter("purchase_history");
		String contact_purpose = request.getParameter("contact_purpose");
		String contact_no = request.getParameter("contact_no");
		String address = request.getParameter("address");		
		Vendor vendor = new Vendor(s_no,  vendor_name, purchase_history, contact_purpose, contact_no , address);
		UserDao rDao = new UserDao();
		String result = rDao.insert(vendor);
		response.sendRedirect("welcome.jsp");
	
	}

}
