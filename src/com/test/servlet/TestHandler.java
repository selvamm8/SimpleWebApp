package com.test.servlet;

 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestHandler extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Simple Web App::  Servlet method called ");
		out.println("<html>");
		out.println("<body>"); 
		out.println("<h1>Hello Servlet Get Method Called in App </h1>");
		out.println("</body>");
		out.println("</html>");
	}
}