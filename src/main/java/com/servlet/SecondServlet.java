package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet(urlPatterns = "/second", name = "SecondServlet" )
public class SecondServlet extends GenericServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is servlet using generic servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h2 align='center'>Second Servlet</h2>");
	}


}
