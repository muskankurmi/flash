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
 * Servlet implementation class StockCheck
 */
@WebServlet("/StockCheck")
public class StockCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StockCheck() {
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

		String medicine_name = request.getParameter("medicine_name");
		String status = request.getParameter("status");
		String strength = request.getParameter("strength");
		String vendor = request.getParameter("vendor");
		String category = request.getParameter("category");
		String price = request.getParameter("price");

		Stock stock = new Stock(medicine_name, status, strength, vendor, category, price);
		UserDao rDao = new UserDao();
		String result = rDao.insert(stock);
		response.sendRedirect("showStock.jsp");

	}

}
