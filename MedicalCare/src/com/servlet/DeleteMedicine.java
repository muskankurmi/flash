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
 * Servlet implementation class DeleteMedicine
 */
@WebServlet("/DeleteMedicine")
public class DeleteMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteMedicine() {
		super();
		// TODO Auto-generated constructor stub
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			String s_no = request.getParameter("s_no");
		     int a = Integer.parseInt(s_no);
			UserDao rDao = new UserDao();
			String result = rDao.delete(s_no);
			response.sendRedirect("welcome.jsp");

	}

}
