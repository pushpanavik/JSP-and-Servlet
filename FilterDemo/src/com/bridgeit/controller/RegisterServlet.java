package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.model.RegisterFormPojo;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/rs")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Uname="admin";
		String pass="abc123";
		String First_Name=request.getParameter("first_name");
		String Last_Name=request.getParameter("last_Name");
		String UserName=request.getParameter("username");
		String Password=request.getParameter("password");
		String Address=request.getParameter("address");
		int Contact_No=Integer.parseInt(request.getParameter("contact"));
	
		RegisterFormPojo rfp=new RegisterFormPojo();
		rfp.setFirst_Name(First_Name);
		rfp.setLast_Name(Last_Name);
		rfp.setUserName(UserName);
		rfp.setPassword(Password);
		rfp.setContact_No(Contact_No);
		rfp.setAddress(Address);
		
		if(Uname.equals(UserName) && pass.equals(Password))
		{
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("UserName", "Pushpa");
			httpSession.setMaxInactiveInterval(30*60);
			
			Cookie cookie=new Cookie("UserName",UserName );
			cookie.setMaxAge(200);
			response.addCookie(cookie);
			response.sendRedirect("LoginSuccess.jsp");
						
		}
		else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font>");
			rd.include(request, response);
		}
		
	}
}
