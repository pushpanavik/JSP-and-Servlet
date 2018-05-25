package com.bridgeit.filterservlet;

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
 * Servlet implementation class ClothProduct
 */
@WebServlet("/cp")
public class ClothProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClothProduct() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext=getServletContext();
		String offermsg=servletContext.getInitParameter("ofm");
		String offerper=servletContext.getInitParameter("ofp");
		
		Product prd=new  Product();
		prd.setId("cp1256");
		prd.setName("Cotton ");
		prd.setCategory("Suits");
		prd.setPrice(2000);
		
		servletContext.setAttribute("cpd", prd);
		PrintWriter out=response.getWriter();
		out.println("<html> <body bgcolor='green'>"+ "<h1>Cloth Product Details</h1>"+
				"" +offermsg + offerper +" %off" +"<br> <a href=\"Product.html\">Back</a>"+ "</body> </html>");
		out.flush();
		out.close();
		
	}
}
