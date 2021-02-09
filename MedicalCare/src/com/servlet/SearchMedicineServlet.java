package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchMedicineServlet
 */
@WebServlet("/SearchMedicineServlet")
public class SearchMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchMedicineServlet() {
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
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "medicalshop";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        Statement st=null;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("connected!.....");
            String medicine_name = request.getParameter("medicine_name");
            ArrayList al = null;
            ArrayList pid_list = new ArrayList();
            String query = "select * from medicalshop.medicine";
            if(medicine_name!=null && !medicine_name.equals("")){
                query = "select * from medicalshop.medicine where medicine_name='" + medicine_name + "' ";
            }
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                al = new ArrayList();

                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                al.add(rs.getString(4));
                al.add(rs.getString(5));
                al.add(rs.getString(6));
                al.add(rs.getString(7));
                al.add(rs.getString(8));
                al.add(rs.getString(9));
                System.out.println("al :: " + al);
                pid_list.add(al);
            }

            request.setAttribute("piList", pid_list);
            RequestDispatcher view = request.getRequestDispatcher("viewSerachMedicine.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "getting records from database through servlet controller";
    }// </editor-fold>
}
