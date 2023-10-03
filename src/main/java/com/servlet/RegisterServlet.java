package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2 align='center' style='color: green;'>Welcome to Register Servlet</h2>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String umail = req.getParameter("user_mail");
		String gender = req.getParameter("user_gender");
		String edu = req.getParameter("user_edu");
		
		String cond = req.getParameter("condition");
		
		if(cond!=null) {
			out.println("Name :     "+name+"<br>");
			out.println("Password : "+password+"<br>");
			out.println("Mail Id :  "+umail+"<br>");
			out.println("Gender :   "+gender+"<br>");
			out.println("Education: "+edu+"<br>");
			
			//
			//jdbc code
			//
			//save to db
			//
			
			RequestDispatcher rd = req.getRequestDispatcher("/SuccessServlet");
			rd.forward(req, res);
		}else {
			out.println("<h2 align='center' style='color: red;'>You have not accepted terms and condition</h2>");
			//want to add form.html in servlet page
			//get the object of RequestDispatcher
			RequestDispatcher rd = req.getRequestDispatcher("./form.html");
			//use include function
			rd.include(req, res);
			
		}
		
		
		
	}

}
