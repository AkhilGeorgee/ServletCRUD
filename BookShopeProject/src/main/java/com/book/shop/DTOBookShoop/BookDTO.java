package com.book.shop.DTOBookShoop;

import java.io.Serializable;

public class BookDTO implements Serializable
{
	

	private int id;
	
	private String name;
     
     private String password;
     
     private String quantity;
     
     private String bookname;

	

     public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

     
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getQuantity() {
		return quantity;
	}



	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public BookDTO() 
	{
		System.out.println("Object Created..");
	}
     
}
