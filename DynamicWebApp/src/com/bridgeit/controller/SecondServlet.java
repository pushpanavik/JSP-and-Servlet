package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	//@WebServlet("/ss")
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			PrintWriter out=response.getWriter();
			/*Cookie[] c=request.getCookies();
			
			
			out.println("second servlet cookie value "+ c[0].getValue());
			out.flush();
			out.close();*/
			
			
			HttpSession httpSession=request.getSession(false);
			String name=(String) httpSession.getAttribute("nmg");
			out.println("second session object" +name + "id" +httpSession.getCreationTime() +httpSession.getId()+ httpSession.getLastAccessedTime());
			out.flush();
			out.close();
		}
		
	}

}
