package com.maki.toni;

import java.util.ArrayList;

import javax.xml.ws.Endpoint;

import com.maki.toni.SellerImplementation;

public class SellerPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/Sell",new SellerImplementation());
		SellerImplementation imp = new SellerImplementation();
		System.out.println("Created instance of implementation, testing search");
		ArrayList<Book> books = imp.searchBooks("Asia");
		Book book = books.get(0);
		book = imp.getRating(book);
		System.out.println("Book isbn is: " + book.getIsbn());
		System.out.println("Rating: " + book.getRating());
	}
}