package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter  out = response.getWriter();
		
		String user_name = request.getParameter("name");
		
        out.println("<h2> First Servlet...</h2>");
		
		out.println("<br>");
		
		out.println("<h2> Hello, "+user_name+" Welcome to my Website.. </h2>");
		
		out.println("<br>");
		
		out.println("<h2><a href='SecondServlet'>Go To Servlet 2</a></h2>");
		

	}

}
