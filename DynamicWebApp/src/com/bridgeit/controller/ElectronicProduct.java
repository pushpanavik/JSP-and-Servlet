package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.model.Product;

/**
 * Servlet implementation class ElectronicProduct
 */
@WebServlet("/ep")
public class ElectronicProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElectronicProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServletContext servletContext=getServletContext();
	
	String offermsg=servletContext.getInitParameter("ofm");
	String offerper=servletContext.getInitParameter("ofp");
	
	Product p=new Product();
	p.setId("ep1234");
	p.setName("Apple");
	p.setCategory("Iphone");
	p.setPrice(50000);
	
	//Adding object into scope
	servletContext.setAttribute("epd", p);
	PrintWriter out=response.getWriter();
	out.println("<html> <body bgcolor='orange'>"+ "<h1> Electronices Product Details</h1>"+
	"" +offermsg + offerper +" %off" +"<br> <a href=\"Product.html\">Back</a>"+ "</body> </html>");
	
	out.flush();
	out.close();
	
	
		
	}

	

}
