package com.bridgeit.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        
       System.out.println("this is where servlet object get created");
    }
    public void init(ServletConfig config)
    {
    	System.out.println("Object is initialzed");
    }
    
    public void service(ServletRequest request,ServletResponse response) throws IOException, ServletException
    {
    	PrintWriter out=response.getWriter();
    
    	RequestDispatcher requestDispatcher=request.getRequestDispatcher("/ConfigExample");
    	requestDispatcher.include(request, response);
    	out.flush();
    	out.close();
    }
    	
    	public void destroy()
    	{
    		System.out.println("close all resoureces");
    	}
    
}

	

