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
 * Servlet implementation class InvoiceCheck
 */
@WebServlet("/InvoiceCheck")
public class InvoiceCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoiceCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String batch_no = request.getParameter("batch_no");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String date = request.getParameter("date");
		String payment_method = request.getParameter("payment_method");
		String item = request.getParameter("item");
		String expiry_date = request.getParameter("expiry_date");
		String quantity = request.getParameter("quantity");
		String price = request.getParameter("price");
		String gst = request.getParameter("gst");
		String discount = request.getParameter("discount");
		String final_amount = request.getParameter("final_amount");
		String total = request.getParameter("total");

Invoice invoice = new Invoice(batch_no, name,date,payment_method,email,item,expiry_date,quantity,price,gst,discount,final_amount,total);
		UserDao rDao = new UserDao();
		String result = rDao.insert(invoice);
		response.sendRedirect("ShowivoiceDetail.jsp");


	
	}

}
