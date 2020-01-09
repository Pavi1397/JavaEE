package com.deloitte;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = "Rahul";
		String password = "12345";
		
		String inUname = request.getParameter("txtuname");
		String inPassword = request.getParameter("txtpassword");
		if(uName.equals(inUname) && password.equals(inPassword)){
			{
				HttpSession ssn = request.getSession();
				ssn.setAttribute("user", inUname);
				response.sendRedirect("welcome.jsp");
				} }
		else {
					response.sendRedirect("login.jsp");
				}
			
		}
		
	}


