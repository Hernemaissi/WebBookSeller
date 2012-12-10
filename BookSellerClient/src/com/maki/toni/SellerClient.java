package com.maki.toni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.maki.toni.*;

public class SellerClient {
	public static void main(String[] args) {

		SellerImplementationService service = new SellerImplementationService();
		SellerInterface port = service.getSellerImplementationPort();
		String line;
		String command;
		String param = null;
		ArrayList<Book> books = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the Book Selling Client");
		System.out.println("Commands:");
		System.out.println("search [term] - Searches for books that have [term] on the title");
		System.out.println("details [book index] - Receive details from the book with the parameter index");
		System.out.println("order [book index] - Order book with the parameter index");
		System.out.println("deposit [amount] - Test method to deposit some money to bank account");
		System.out.println("create - Creates a new bank account to test with");
		System.out.println("help - shows the commands");
		System.out.println("end - closes the program");
		while(true) {
			System.out.println("Enter command:");
			try {
				line = reader.readLine();
				String parts[] = line.split(" ");
				command = line.split(" ")[0];
				if (parts.length > 1) { param = line.split(" ")[1]; }
				if (command.equalsIgnoreCase("search") && param != null) {
					books = (ArrayList<Book>)port.searchBooks(param);
					System.out.println("Found the following books: ");
					for (int i = 0; i < books.size(); i++) {
						System.out.println(i + ". " + books.get(i).getTitle());
					}
					System.out.println("Use command details [index] to get more info or order [index] to order the book");
				}else if (command.equalsIgnoreCase("details") && param != null) {
					if (books != null) {
						Book book = books.get(Integer.parseInt(param));
						book = port.getRating(book);
						System.out.println("Title: " + book.getTitle());
						System.out.println("Authors: " + book.getAuthors());
						System.out.println("ISBN: " + book.getIsbn());
						if (book.getRating() != null) {
							System.out.println("Rating: " + book.getRating());
						}else {
							System.out.println("Rating: Not Available");
						}
						if (book.getPrice() != null) {
							System.out.println("Price: " + book.getPrice());
						} else {
							System.out.println("Price: Unavailable");
						}
					}else {
						System.out.println("Use the search command first to search for books");
					}
				}else if (command.equalsIgnoreCase("order") && param != null) {
					if (books != null) {
						Book book = books.get(Integer.parseInt(param));
						if (book.getPrice() != null) {
							System.out.println("Please enter username:");
							String username = reader.readLine();
							System.out.println("Please enter password:");
							String password = reader.readLine();
							int res = port.orderBook(book, username, password);
							switch (res) {
							case 0:
								System.out.println("Wrong username/password");
								break;
							case 1:
								System.out.println("Insufficient funds");
								break;
							case 2:
								System.out.println("Order completed succesfully");
								break;
							default:
								System.out.println("Unknown error: " + res);
								break;
							}
						}else {
							System.out.println("You can't order that book because there is no price available");
						}
					}else {
						System.out.println("Use the search command first to search for books");
					}
				}else if (command.equalsIgnoreCase("deposit") && param != null) {
					double amount = Double.parseDouble(param);
					System.out.println("Please enter username:");
					String username = reader.readLine();
					System.out.println("Please enter password:");
					String password = reader.readLine();
					amount = port.deposit(amount, username, password);
					if (amount != -1) {
						System.out.println("Account balance now: " + amount);
					}else {
						System.out.println("Wrong username/password");
					}
					
				}else if (command.equalsIgnoreCase("create")) {
					System.out.println("Please enter username for new account:");
					String username = reader.readLine();
					System.out.println("Please enter password for new account:");
					String password = reader.readLine();
					boolean suc = port.create(username, password);
					if (suc) {
						System.out.println("Account created succesfully");
					}else {
						System.out.println("Failed to create account");
					}
				}else if (command.equalsIgnoreCase("help")) {
					System.out.println("Welcome to the Book Selling Client");
					System.out.println("Commands:");
					System.out.println("search [term] - Searches for books that have [term] on the title");
					System.out.println("details [book index] - Receive details from the book with the parameter index");
					System.out.println("order [book index] - Order book with the parameter index");
					System.out.println("deposit [amount] - Test method to deposit some money to bank account");
					System.out.println("create - Creates a new bank account to test with");
					System.out.println("help - shows the commands");
					System.out.println("end - closes the program");
				}else if (command.equalsIgnoreCase("end")) {
					break;
				}else {
					System.out.println("Unknown command. Type help for a list of commands.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Bye!");
		 
	}
	
}