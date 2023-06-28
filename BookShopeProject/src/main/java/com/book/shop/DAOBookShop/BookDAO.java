package com.book.shop.DAOBookShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.book.shop.DTOBookShoop.BookDTO;

public class BookDAO 
{
     public static Connection geConnection()
     {
    	 Connection con=null;
    	 
    	 try 
    	 {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_PROGRAM","root","akhil");
    	 } 
    	 catch (Exception e)
    	 {
			System.out.println(e);
    	 }
    	 
		return con;
    	 
     }
     
     
     public static int save(BookDTO dto)
     {
    	 int i=0;
    	 
    	 Connection con=BookDAO.geConnection();
    	 
    	 try 
    	 {
	         PreparedStatement ps=con.prepareStatement("insert into Book_Shop(name,password,quantity,bookname)values(?,?,?,?)");
	         
	         ps.setString(1,dto.getName());
	         ps.setString(2,dto.getPassword());
	         ps.setString(3,dto.getQuantity());
	         ps.setString(4,dto.getBookname());
	         
	         i=ps.executeUpdate();
    	 }
    	 catch (Exception e) 
    	 {
			System.out.println(e);
    	 }
    	 
		return i;
    	 
     }
     
     public static List<BookDTO> select()
     {
    	 
    	 List<BookDTO> adto=new ArrayList<BookDTO>();
    	 
    	 Connection con=BookDAO.geConnection();
    	 
    	 try 
    	 {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Book_Shop");
			
			while (rs.next()) 
			{
				BookDTO dto=new BookDTO();
				dto.setName(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setQuantity(rs.getString(3));
				dto.setBookname(rs.getString(4));
				
				adto.add(dto);
			}
			con.close();
    	 }
    	 catch (Exception e) 
    	 {
			System.out.println(e);
			e.printStackTrace();
		 }
    	 
    	 
		return adto;
    	 
     }
     
     public static BookDTO select1(int id)
     {
    	 
    	 
    	 BookDTO bdto=new BookDTO();
    	 
    	 try 
    	 {
    		 Connection con=BookDAO.geConnection();
		      PreparedStatement ps=con.prepareStatement("select * from Book_Shop where id=?");
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				bdto.setId(rs.getInt(1));
				bdto.setName(rs.getString(2));
				bdto.setPassword(rs.getString(3));
				bdto.setQuantity(rs.getString(4));
				bdto.setBookname(rs.getString(5));
			}
			con.close();
    	 } 
    	 catch (Exception e)
    	 {
			System.out.println(e);
    	 }
		return bdto;
     }
     
     
     public static int update(BookDTO dto)
     {
    	 int i=0;
    	 
    	 try 
    	 {
			Connection con=BookDAO.geConnection();
			PreparedStatement ps=con.prepareStatement("update Book_Shop set name=?,password=?,quantity=?,bookname=? where id=?");
			
			ps.setString(1,dto.getName());
			ps.setString(2,dto.getPassword());
			ps.setString(3,dto.getQuantity());
			ps.setString(4,dto.getBookname());
			ps.setInt(5, dto.getId());
			
			i=ps.executeUpdate();
    	 }
    	 catch (Exception e)
    	 {
			System.out.println(e);
    	 }
		return i;
     }
     
     public static int delete(int id)
     {
    	 int s=0;
    	 Connection con=BookDAO.geConnection();
    	 try 
    	 {
			PreparedStatement ps=con.prepareStatement("delete from Book_Shop where id=?");
			ps.setInt(1,id);
			s=ps.executeUpdate();
    	 } 
    	 catch (Exception e) 
    	 {
    		 System.out.println(e);
			
    	 }
		return s;
     }
     
     
}
