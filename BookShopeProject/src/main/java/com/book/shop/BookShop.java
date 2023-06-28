package com.book.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.shop.DAOBookShop.BookDAO;
import com.book.shop.DTOBookShoop.BookDTO;

@WebServlet("/BookShop")
public class BookShop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String quantity=req.getParameter("quantity");
		String bookname=req.getParameter("bookname");
		
		BookDTO dto=new BookDTO();
		
		dto.setName(name);
		dto.setPassword(password);
		dto.setQuantity(quantity);
		dto.setBookname(bookname);
		
		int i=BookDAO.save(dto);
		
		if(i>0)
		{
			out.println("<body style='font-family: sans-serif;"
					+ "    display: flex;"
					+ "    align-items: center;"
					+ "    justify-content: center;"
					+ "    min-height:100% ;"
					+ "    margin: 0;"
					+ "    background-color: #26495f;'>");
			out.println( "<div style=' border-radius: 3px;"
					+ "    margin: 150px 10px;"
					+ "    overflow: hidden;"
					+ "    width: 400px;"
					+ "    max-width: 100%;';>");
			out.println("<div style='border-bottom: 0px solid #24118e;"
					+ "    padding: 10px 30px;"
					+ "    color: #019f55;"
					+ "    font-style: unset;"
					+ "    justify-content: space-between;"
					+ "    font-weight: bolder;"
					+ "    font-family:'Times New Roman', Times, serif;'>");
			out.println("<h1 style='font-style: italic;'>Successfull</h1>");
			out.println("</div>");
			out.println("<div style=' border: 2px solid #eef3f7;"
					+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);"
					+ "    border-radius: 15px;"
					+ "    display: block;"
					+ "    margin: 10px 5px;"
					+ "    font-family: inherit;"
					+ "    font-size: 14px;"
					+ "    padding: 16px;"
					+ "    width: 80%;"
					+ "    font-family:'Times New Roman', Times, serif;'>");
			out.println("<a style='outline: 0;"
					+ "    border: 0;"
					+ "    text-decoration: none;"
					+ "    color: #f90a0a;"
					+ "    font-size: 20px;"
					+ "    font-weight: bold;"
					+ "    margin-left:80px ;' href='Booking.html'>Add Employee</a>");
			out.println("</div>");
			out.println("<div style=' border: 2px solid #eef3f7;"
					+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);"
					+ "    border-radius: 15px;"
					+ "    display: block;"
					+ "    margin: 10px 5px;"
					+ "    font-family: inherit;"
					+ "    font-size: 14px;"
					+ "    padding: 16px;"
					+ "    width: 80%;"
					+ "    font-family:'Times New Roman', Times, serif;'>");
			out.println("<a style='outline: 0;"
					+ "    border: 0;"
					+ "    text-decoration: none;"
					+ "    color: #f70a0a;"
					+ "    font-size: 20px;"
					+ "    font-weight: bold;"
					+ "    margin-left:70px ; ' href='BookDetails'>View Users Tabel</a>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");
			out.println("</body>");
		}
		else
		{
			out.println("Not Saved...");
		}
		
		
		
	}

}
