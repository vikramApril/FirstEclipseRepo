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
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
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
			
			//getting all the cookies.....
			Cookie[] cookies=req.getCookies();
			boolean f = false;
			String name = "";
			if(cookies==null) {
				out.println("<h1>You are new user go to home page and submit your name</h1>");
				return;
			}else {
				for(Cookie c : cookies) {
					String tname = c.getName();
					System.out.println("-----------------");
					System.out.println(tname);
					System.out.println("-----------------");
					if(tname.equals("user_name")) {
						f = true;
						name = c.getValue();
					}
				}
			}
			
			
			//String name = req.getParameter("nme");
			if(f) {
				out.println("<h1 align='center'>Hello "+name+" welcome to my website... </h1>");
				out.println("<h3 align='center'><a href='Servlet1' style='color: orange;'>Go to servlet 1 </a></h3>");
				out.println("<h4 align='right'>Thank you</h4>");
			}
			
			
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			e.printStackTrace();
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
