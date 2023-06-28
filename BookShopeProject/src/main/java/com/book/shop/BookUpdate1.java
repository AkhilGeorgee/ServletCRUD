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

@WebServlet("/BookUpdate1")
public class BookUpdate1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BookUpdate1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		
		String eid=req.getParameter("id");
		int id=Integer.parseInt(eid);
		
		BookDTO dto=BookDAO.select1(id);
		
		out.println("<body style=' font-family: sans-serif;"
				+ "    display: flex;"
				+ "    align-items: center;"
				+ "    justify-content: center;"
				+ "    min-height:100% ;"
				+ "    margin: 0;"
				+ "    background-color: #26495f;'>");
		
		out.println("<form method='post' action='' style=' padding: 30px 20px;"
				+ "    background-color: #002339;"
				+ "    margin: 90px 10px;"
				+ "    width: 400px;"
				+ "    border-radius: 20px;"
				+ "    margin-bottom: 10px;"
				+ "    padding-bottom: 20px;"
				+ "    position: relative;'>");
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
				+ "    font-family:Arial, Helvetica, sans-serif;'>Update Details</h1>");
		out.println("</div>");
		
		out.println("<label style=' display: inline-block;"
				+ "    margin-bottom: 20px;"
				+ "    padding-top: 10px;"
				+ "    margin-left: 15px;"
				+ "    color: rgb(219, 20, 27);"
				+ "    font-weight: bolder;"
				+ "    font-family: 'Lucida Console','Courier New', monospace;'>ID </label>"
				+ "<input style='border: 2px solid #fef8f8;"
				+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);"
				+ "    border-radius: 15px;"
				+ "    display: block;"
				+ "    margin: 10px 5px;"
				+ "    font-family: inherit;"
				+ "    font-size: 14px;"
				+ "    padding: 16px;"
				+ "    width: 100%;"
				+ "coler=#fff;"
				+ "    font-family:'Times New Roman', Times, serif;' type='hidden' name='id' value="+dto.getId()+" required='required'/>");
		
		out.println("<label style=' display: inline-block;"
				+ "    margin-bottom: 20px;"
				+ "    padding-top: 10px;"
				+ "    margin-left: 15px;"
				+ "    color: rgb(219, 20, 27);"
				+ "    font-weight: bolder;"
				+ "    font-family: 'Lucida Console','Courier New', monospace;'>UserName </label>"
				+ "<input style='border: 2px solid #fef8f8;"
				+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);"
				+ "    border-radius: 15px;"
				+ "    display: block;"
				+ "    margin: 10px 5px;"
				+ "    font-family: inherit;"
				+ "    font-size: 14px;"
				+ "    padding: 16px;"
				+ "    width: 100%;"
				+ "    font-family:'Times New Roman', Times, serif;' type='text' name='name' value="+dto.getName()+" placeholder='Enter your UserName...' required='required'/>");
		
		out.println(" <label style=' display: inline-block;"
				+ "    margin-bottom: 20px;"
				+ "    padding-top: 10px;"
				+ "    margin-left: 15px;"
				+ "    color: rgb(219, 20, 27);"
				+ "    font-weight: bolder;"
				+ "    font-family: 'Lucida Console','Courier New', monospace;'>Password </label> "
				+ "<input style='border: 2px solid #fef8f8;"
				+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);"
				+ "    border-radius: 15px;"
				+ "    display: block;"
				+ "    margin: 10px 5px;"
				+ "    font-family: inherit;"
				+ "    font-size: 14px;"
				+ "    padding: 16px;"
				+ "    width: 100%;"
				+ "    font-family:'Times New Roman', Times, serif;' type='password' name='password' value="+dto.getPassword()+" required='required' placeholder='Enter your password...'/>");
		
		out.println("<label style=' display: inline-block;"
				+ "    margin-bottom: 20px;"
				+ "    padding-top: 10px;"
				+ "    margin-left: 15px;"
				+ "    color: rgb(219, 20, 27);"
				+ "    font-weight: bolder;"
				+ "    font-family:'Lucida Console','Courier New', monospace;'>Quantity </label>"
				+ "<input style='border: 2px solid #fef8f8;"
				+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);"
				+ "    border-radius: 15px;"
				+ "    display: block;"
				+ "    margin: 10px 5px;"
				+ "    font-family: inherit;"
				+ "    font-size: 14px;"
				+ "    padding: 16px;"
				+ "    width: 100%;"
				+ "    font-family:'Times New Roman', Times, serif; ' type='number' name='quantity' value="+dto.getQuantity()+" required='required' placeholder='Enter your quantity...'/>");
		out.println(" <label style=' display: inline-block;"
				+ "    margin-bottom: 20px;"
				+ "    padding-top: 10px;"
				+ "    margin-left: 15px;"
				+ "    color: rgb(219, 20, 27);"
				+ "    font-weight: bolder;"
				+ "    font-family:'Lucida Console','Courier New', monospace;'>Book Name </label>"
				+ "                <select style=' border: 2px solid #fef8f8;"
				+ "    box-shadow: 0 2px 5px rgb(0,0,0,0.3);"
				+ "    border-radius: 15px;"
				+ "    display: block;"
				+ "    font-family: 'Times New Roman', Times, serif;"
				+ "    font-size: 16px;"
				+ "    padding: 15px;"
				+ "    width: 100%;"
				+ "    margin: 10px 5px;'>"
				+ "                    <option value='select you'r book...'>select you'r book...</option>"
				+ "                    <option value='The Iliad'>The Iliad</option>"
				+ "                    <option value='Don Quixote'>Don Quixote</option>"
				+ "                    <option value='Beloved'>Beloved</option>"
				+ "                    <option value='Ulysses'>Ulysses</option>"
				+ "                    <option value='Invisible Man'>Invisible Man</option>"
				+ "                    <option value='Jane Eyre'>Jane Eyre</option>"
				+ "                    <option value='The Hobbit'>The Hobbit</option>"
				+ "                    <option value='Anna Karenina'>Anna Karenina</option>"
				+ "                    <option value='Frankenstein'>Frankenstein</option>"
				+ "                    <option value='Wuthering Heights'>Wuthering Heights</option>"
				+ "                </select>");
		out.println(" <button style=' background: #019f55;"
				+ "    border: 2px solid #ff2306;"
				+ "    border-radius: 50px;"
				+ "    color: #f9f7fa;"
				+ "    display: block;"
				+ "    width: 100%;"
				+ "    padding: 10px;"
				+ "    margin: 50px 2px;"
				+ "    font-family:'Great Vibes', cursive;"
				+ "    font-size: 20px;"
				+ "    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;"
				+ "    box-shadow: 0 2px 5px rgba(114, 100, 100, 0.888);' type='submit'>Save&Update</button>");
		out.println("</form>");
	}

}
