package com.training;

import com.training.exceptions.MyCustomExceptions;
import com.training.exceptions.RangeCheckException;

public class Book {
	private int bookId;
	private String bookName;
	private String authorName;
	private double price;
	
	public Book(int bookId, String bookName, String authorName,double price)throws Exception {
		super();
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		if(price<100||price>500)
		{
			throw new RangeCheckException("Book Price Not in Range");
		}
		else {
		this.price=price;}
		
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) throws Exception{
		try {
			this.bookName = bookName;
		} catch (NullPointerException ne) {
			throw new MyCustomExceptions("Book Name has not valid String", ne);
		}
		
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws Exception{
		if(price<100.00||price>500.00) {
			throw new RangeCheckException("The book price is not in the given range");
		}else {
		this.price = price;}
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ "]";
	}
	
	
}
