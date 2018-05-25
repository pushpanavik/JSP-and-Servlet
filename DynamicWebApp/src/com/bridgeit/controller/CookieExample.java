package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.model.User;

public class CookieExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieExample() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		
		
		/*String name=request.getParameter("first");
		
		User u=new User();
		u.setFirstname(name);
		
		Cookie cookie=new Cookie("nmg", name);
		cookie.setMaxAge(30*60);
		response.addCookie(cookie);
		
		out.print("<html>");
		out.print("<form action='SecondServlet'>");
		out.print("<input type=submit> ");
		out.print("</form>");
		out.print("</html>");
		out.flush();
		out.close();
		*/
		
		String name=request.getParameter("first");
		HttpSession httpSession=request.getSession();
		httpSession.setMaxInactiveInterval(200*200);
		//httpSession.invalidate();
		httpSession.setAttribute("nmg", name);
		
		
		out.print("<html");
		out.print("<form action='SecondServlet'>");
		out.print("<input type=submit value=NextServlet>");
		out.print("</form>");
		out.print("</html>");
		out.flush();
		out.close();
		
		
		
		}

}
