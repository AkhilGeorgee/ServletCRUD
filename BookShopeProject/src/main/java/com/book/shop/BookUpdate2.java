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

@WebServlet("/BookUpdate2")
public class BookUpdate2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public BookUpdate2() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");  
        PrintWriter out=res.getWriter();  
          
        String sid=req.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String name=req.getParameter("name");  
        String password=req.getParameter("password");  
        String quantity=req.getParameter("quantity");  
        String bookname=req.getParameter("bookname");  
          
        BookDTO dto=new BookDTO();  
        dto.setId(id);  
        dto.setName(name);  
        dto.setPassword(password);  
        dto.setQuantity(quantity);  
        dto.setBookname(bookname);  
          
        int st=BookDAO.update(dto);  
        if(st>0)
        {  
            res.sendRedirect("BookDetails");  
        }
        else
        {  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
	}
		

}
