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
 * Servlet implementation class BillingCheck
 */
@WebServlet("/BillingCheck")
public class BillingCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BillingCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String date = request.getParameter("date");
		String medicine_name = request.getParameter("medicine_name");
		String price = request.getParameter("price");
		String discount = request.getParameter("discount");
		String total_price = request.getParameter("total_price");
		String payment = request.getParameter("payment");
		

	Billing billing = new Billing(date, medicine_name, price, discount, total_price, payment);
		UserDao rDao = new UserDao();
		String result = rDao.insert(billing);
		response.sendRedirect("showBilling.jsp");

	}

}
