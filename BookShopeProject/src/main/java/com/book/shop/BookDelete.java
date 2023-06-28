package com.book.shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.shop.DAOBookShop.BookDAO;


@WebServlet("/BookDelete")
public class BookDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public BookDelete() {
        super();
        System.out.println("BookDelete Object Created..");
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		 String id1=req.getParameter("id");  
	        int id=Integer.parseInt(id1);  
	        BookDAO.delete(id);  
	        res.sendRedirect("BookDetails");
	}

}
