package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.dao.LoginDao;
import com.bridgeit.model.LoginPojo;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String Email = request.getParameter("email");
		String Password = request.getParameter("pwd");
		out.print(Email);
		LoginPojo log=new LoginPojo();
		log.setEmail(Email);
		log.setPassword(Password);
		
			boolean flag;
			try {
				flag = LoginDao.validateUser(log);
				if(flag)
				{
					ServletContext context=getServletContext();
					RequestDispatcher requestDispatcher=context.getRequestDispatcher("/FirstServlet");
					requestDispatcher.forward(request, response);
				}
				else
				{
					
					System.out.println("authentication failed try again");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("error.html");
					requestDispatcher.forward(request,response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	

}
