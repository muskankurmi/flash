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
 * Servlet implementation class UpdateMedicine
 */
@WebServlet("/UpdateMedicine")
public class UpdateMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMedicine() {
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
		String medicine_name = request.getParameter("medicine_name");
		String category  = request.getParameter("category");
		String strength = request.getParameter("strength");
		String dosage_form = request.getParameter("dosage_form");
		String mfg_date = request.getParameter("mfg_date");
		String exp_date = request.getParameter("exp_date");
		String market_prize = request.getParameter("market_prize");
		String discount = request.getParameter("discount");
		
		Medicine medicine = new Medicine();
		medicine.setS_no(s_no);
		medicine.setMedicine_name(medicine_name);
		medicine.setCategory(category);
		medicine.setStrength(strength);
		medicine.setDosage_form(dosage_form);
		medicine.setMfg_date(mfg_date);
		medicine.setExp_date(exp_date);
		medicine.setMarket_prize(market_prize);
		medicine.setDiscount(discount);

		UserDao rDao = new UserDao();
		String result = rDao.update(medicine);
		response.sendRedirect("showMedicineDetail.jsp");
		
	
	}

}
