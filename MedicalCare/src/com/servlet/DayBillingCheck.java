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
 * Servlet implementation class DayBillingCheck
 */
@WebServlet("/DayBillingCheck")
public class DayBillingCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DayBillingCheck() {
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
		String day = request.getParameter("day");
		String total_sale = request.getParameter("total_sale");
		String vendor = request.getParameter("vendor");
		String category = request.getParameter("category");
		String price = request.getParameter("price");

	DayBilling daybilling = new DayBilling(date, day, total_sale);
		UserDao rDao = new UserDao();
		String result = rDao.insert(daybilling);
		response.sendRedirect("showTotalBilling.jsp");

	}

}
