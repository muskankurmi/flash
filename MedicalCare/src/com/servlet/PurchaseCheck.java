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
 * Servlet implementation class PurchaseCheck
 */
@WebServlet("/PurchaseCheck")
public class PurchaseCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PurchaseCheck() {
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
		String category = request.getParameter("category");
		String vendor = request.getParameter("vendor");
		String total_price = request.getParameter("total_price");
		String paid = request.getParameter("paid");
		String unpaid = request.getParameter("unpaid");

		PurchaseBill purchaseBill = new PurchaseBill(date,medicine_name, category, vendor, total_price, paid, unpaid);
		UserDao rDao = new UserDao();
		String result = rDao.insert(purchaseBill);
		response.sendRedirect("showPurchaseBilling.jsp");

	}

}
