package com.maki.toni;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SellerInterface {
	 @WebMethod ArrayList<Book> searchBooks(String query);
	 @WebMethod Book getRating(Book book);
	 @WebMethod int orderBook(Book book, String username, String password);
	 @WebMethod double deposit(double amount, String username, String password);
	 @WebMethod boolean create(String username, String password);
}
