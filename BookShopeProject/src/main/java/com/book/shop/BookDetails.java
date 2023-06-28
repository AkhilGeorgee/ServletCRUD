package com.book.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.shop.DAOBookShop.BookDAO;
import com.book.shop.DTOBookShoop.BookDTO;


@WebServlet("/BookDetails")
public class BookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BookDetails() {
        super();
        System.out.println("BookDetails Object created..");
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		//res.getWriter().append("Served at: ").append(req.getContextPath());
		res.setContentType("text/html");
		out.println("<body style=' font-family: sans-serif;"
				+ "    display: flex;"
				+ "    align-items: center;"
				+ "    justify-content: center;"
				+ "    min-height:100% ;"
				+ "    margin: 0;"
				+ "    background-color: #26495f;'>");
		out.println("<div style='background-color: #26495f;"
				+ "    border-radius: 1px;"
				+ "    overflow: hidden;"
				+ "    width: 700px;"
				+ "   max-width: 100%;"
				+ "    margin-top: 200px;"
				+ "    margin-right: 100px;'>");
		out.println("<div style=' border-bottom: 0px solid #24118e;"
				+ "    padding: 10px 30%;"
				+ "    color: #019f55;"
				+ "    font-style: unset;"
				+ "    justify-content: space-between;"
				+ "    font-weight: bolder;"
				+ "    font-family:Arial, Helvetica, sans-serif;'>");
		out.println("<h1 style=' border-bottom: 0px solid #24118e;"
				+ "    padding: 10px 10px;"
				+ "    color: #019f55;"
				+ "    font-style: unset;"
				+ "    justify-content: space-between;"
				+ "    font-weight: bolder;"
				+ "    font-family:Arial, Helvetica, sans-serif;'>Customers Details</h1>");
		out.println("</div>");
		out.println("<div style=' background-color: #26495f;"
				+ "   width: 100%;'>");
		
		List<BookDTO> dto=BookDAO.select();
		
		out.println("<table style=' width: 700px;"
				+ "  background-color: #e7f4f5;"
				+ "  border-collapse: collapse;"
				+ "  border-width: 3px;"
				+ "  border-color: #ff0000;"
				+ "  border-style: solid;"
				+ "  color: #2e642a;"
				+ "  margin-top: 50px;'>");
		out.println("<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>ID</th>"
				+ "<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>Name</th>"
				+ "<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>Password</th>"
				+ "<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>Quantity</th>"
				+ "<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>Book Name</th>"
				+ "<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>Edit</th>"
				+ "<th style=' border-width: 2px;"
				+ "    border-color: #ff0000;"
				+ "    border-style: solid;"
				+ "    padding: 3px;"
				+ "    justify-content: space-between;"
				+ "    border-spacing: 3px;'>Delete</th>"
				+ "</tr>");
		  
		for(BookDTO bdto:dto)
		{
		    out.println("<tr><td style=' border-width: 2px;"
		    		+ "    border-color: #ff0000;"
		    		+ "    border-style: solid;"
		    		+ "    padding: 3px;"
		    		+ "    justify-content: space-between;"
		    		+ "    border-spacing: 3px;'>"+bdto.getId()+"</td>"
		    		
		    				+ "<td style=' border-width: 2px;"
		    				+ "    border-color: #ff0000;"
		    				+ "    border-style: solid;"
		    				+ "    padding: 3px;"
		    				+ "    justify-content: space-between;"
		    				+ "    border-spacing: 3px;'>"+bdto.getName()+"</td>"
		    				
		    						+ "<td style=' border-width: 2px;"
		    						+ "    border-color: #ff0000;"
		    						+ "    border-style: solid;"
		    						+ "    padding: 3px;"
		    						+ "    justify-content: space-between;"
		    						+ "    border-spacing: 3px;'>"+bdto.getPassword()+"</td>"
		    						
		    								+ "<td style=' border-width: 2px;"
		    								+ "    border-color: #ff0000;"
		    								+ "    border-style: solid;"
		    								+ "    padding: 3px;"
		    								+ "    justify-content: space-between;"
		    								+ "    border-spacing: 3px;'>"+bdto.getQuantity()+"</td>"
		    								
		    										+ "<td style=' border-width: 2px;"
		    										+ "    border-color: #ff0000;"
		    										+ "    border-style: solid;"
		    										+ "    padding: 3px;"
		    										+ "    justify-content: space-between;"
		    										+ "    border-spacing: 3px;'>"+bdto.getBookname()+"</td>"
		    										
		    										          + "<td style=' border-width: 2px;"
		    										          + "border-color: #ff0000;"
		    										          + "border-style: solid;"
		    										          + "padding: 3px;"
		    										          + "justify-content: space-between;"
		    										          + "border-spacing: 3px;'><a href='BookUpdate1?id="+bdto.getId()+"'>Edit</a></td>"
		    										          
		    										                 + "<td style=' border-width: 2px;"
		    										                 + "border-color: #ff0000;"
		    										                 + "border-style: solid;"
		    										                 + "padding: 3px;"
		    										                 + "justify-content: space-between;"
		    										                 + "border-spacing: 3px;'><a href='BookDelete?id="+bdto.getId()+"'>Delete</a></td>"
		    										                 + "</tr>");
		}
		
		out.println("</table>");
		out.println("</div>");
		
		
		out.println("</div>");
		out.println("</body>");
		
	}

	
}
