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
 * Servlet implementation class MedicineMaster
 */
@WebServlet("/MedicineMaster")
public class MedicineMaster extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicineMaster() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		Medicine medicine = new Medicine(s_no, medicine_name, category, strength, dosage_form , mfg_date, exp_date, market_prize, discount);
		UserDao rDao = new UserDao();
		String result = rDao.insert(medicine);
		response.sendRedirect("showMedicineDetail.jsp");
	
	}

}
