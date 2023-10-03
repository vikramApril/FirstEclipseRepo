package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = res.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet S1</title>");
			out.println("</head>");
			out.println("<body>");
			
			String name = req.getParameter("nme");
			//create a cookie
			System.out.println("c name: "+name);
			Cookie c = new Cookie("user_name", name);
			res.addCookie(c);
			System.out.println("add cookies");
			
			out.println("<h1 align='center'>Hello "+name+" welcome to my website... </h1>");
			out.println("<h3 align='center' style='color: orange;'><a href='Servlet2'>Go to servlet 2 </a></h3>");
			
				
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Short description";
	}
}
