package com.maki.toni;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	private String title;
	private List<String> authors;
	private String price;
	private String isbn;
	private String rating;
	
	public Book() {
		this(null, null, null, null, null);
	}


	public Book(String title, List<String> authors, String price, String isbn, String rating) {
		this.title = title;
		this.authors = authors;
		this.price = price;
		this.isbn = isbn;
		this.rating = rating;
	}

	@XmlAttribute
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlAttribute
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@XmlAttribute
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@XmlAttribute
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	@XmlAttribute
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}


