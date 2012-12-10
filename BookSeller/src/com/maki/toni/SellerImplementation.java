package com.maki.toni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.ECS.client.jax.AWSECommerceService;
import com.ECS.client.jax.AWSECommerceServicePortType;
import com.ECS.client.jax.ItemSearchRequest;
import com.ECS.client.jax.ItemSearch;
import com.ECS.client.jax.ItemSearchResponse;
import com.ECS.client.jax.Items;
import com.ECS.client.jax.Item;
import com.ECS.client.jax.Price;


@WebService(endpointInterface = "com.maki.toni.SellerInterface")
public class SellerImplementation implements SellerInterface {

	@Override
	public ArrayList<Book> searchBooks(String query) {
		String ACCESSKEY = "AKIAJE2DQTSQHGEWGY6Q";  // keys registered for the course (new)
		String SECRET_ACCESSKEY = "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";
		String ASSOCIATE_TAG = "aaltunivwebte-20";
		
		AWSECommerceService service = new AWSECommerceService();
		service.setHandlerResolver(new AwsHandlerResolver(ACCESSKEY, SECRET_ACCESSKEY));  // adds signatures to requests
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();

		ItemSearchRequest itemRequest = new ItemSearchRequest();
		itemRequest.setSearchIndex("Books"); // limit search to book items
		itemRequest.setKeywords(query);   // set search keywords here
		
		// what item information we want to have in the response
		itemRequest.getResponseGroup().add("ItemAttributes"); // std attributes like title and author
		itemRequest.getResponseGroup().add("Offers");         // pricing information
		
		ItemSearch search = new ItemSearch();
		search.setAWSAccessKeyId(ACCESSKEY);
		search.setAssociateTag(ASSOCIATE_TAG);
		search.getRequest().add(itemRequest);

		// fire the actual query using the web service
		ItemSearchResponse response = port.itemSearch(search);

		// process query results
		Items result = response.getItems().get(0);
		System.out.println("Got results: " + result.getTotalResults());
		
		// print out detailed information for the first page of results (max 10 items)
		List<Item> items = result.getItem();
		ArrayList<Book> books = new ArrayList<Book>();
		for (Item item : items) {
			System.out.print(item.getItemAttributes().getTitle());
			System.out.print(" by the authors " + item.getItemAttributes().getAuthor());
			Price price = item.getItemAttributes().getListPrice();
			if (price != null) {
				System.out.println(", list price: " + price.getFormattedPrice() + " (" + price.getAmount() + " cents)");
			} else {
				System.out.println(", no prices");
			}
			String title = item.getItemAttributes().getTitle();
			List<String> authors  = item.getItemAttributes().getAuthor();
			String p = (price != null) ? item.getItemAttributes().getListPrice().getFormattedPrice() : null;
			String isbn = item.getItemAttributes().getISBN();
			books.add(new Book(title, authors, p, isbn, null));

//			System.out.println(item.getASIN());
//			System.out.println(item.getDetailPageURL());
		}
		return books;
	}
	
	public Book getRating(Book book) {
		if (book.getRating() != null) {
			return book;
		}
		org.apache.http.client.HttpClient client = new DefaultHttpClient();
		String key = "uv1J3LcJ7zGuhzCXwaCcUQ&";
		String uri = "http://www.goodreads.com/book/review_counts.json?key=" + key + "&isbns=" + book.getIsbn();
		System.out.println(uri);
		HttpGet request = new HttpGet(uri);
		try {
			HttpResponse response = client.execute(request);
			String jsonStr = responseToString(response);
			JSONObject js = new JSONObject(jsonStr);
			JSONArray books = js.getJSONArray("books");
			JSONObject jsonbook = books.getJSONObject(0);
			String rating = jsonbook.getString("average_rating");
			book.setRating(rating);
			return book;
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private String responseToString(HttpResponse response)
			throws IOException {
		InputStream content = null;
		content = response.getEntity().getContent();
		BufferedReader r = new BufferedReader(new InputStreamReader(content));
		StringBuilder total = new StringBuilder();
		String line;
		while ((line = r.readLine()) != null) {
			total.append(line);
		}
		return total.toString();
	}
	/*
	 * Return values:
	 * 0: Account not found
	 * 1: Not enough money
	 * 2: Transfer successful
	 * 3: Unknown value
	 */
	@Override
	public int orderBook(Book book, String username, String password) {
		BankImplementService service = new BankImplementService();
		BankInterface port = service.getBankImplementPort();
		String formatted_price = book.getPrice().substring(1);
		double price = Double.parseDouble(formatted_price);
		String result = port.transfer(username, password, price, "AmazonNumber");
		if (result.equals("No account found")) {
			return 0;
		} else if (result.equals("Not enough money")) {
			return 1;
		} else if (result.equals("Transfer success")) {
			return 2;
		} else {
			return 3;
		}
		
	}

	@Override
	public double deposit(double amount, String username, String password) {
		BankImplementService service = new BankImplementService();
		BankInterface port = service.getBankImplementPort();
		Account acc = port.getAccountInformation(username, password);
		if (acc == null) {
			return -1;
		}
		acc = port.deposit(amount, acc);
		return acc.getBalance();
	}

	@Override
	public boolean create(String username, String password) {
		BankImplementService service = new BankImplementService();
		BankInterface port = service.getBankImplementPort();
		Account acc = port.createAccount(username, password);
		return acc != null;
	}
	
}
