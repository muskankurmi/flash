package com.servlet;

import com.bean.*;
import com.connection.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password= request.getParameter("password");
		User user = new User();
		user.setUname(uname);
		user.setPassword(password);
		UserDao loginDao = new UserDao();
		try {
			if (loginDao.validate(user)) {
				HttpSession session  = request.getSession();
				session.setAttribute(uname, "uname");
				session.setMaxInactiveInterval(15);
				response.sendRedirect("welcomeUser.jsp");
				
			} else {
				response.sendRedirect("index.html");

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	}


