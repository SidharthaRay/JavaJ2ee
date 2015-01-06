package com.ws.training.business;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.ws.training.business.ws.ProductCatalogService;
import com.ws.training.model.Product;

@WebService(endpointInterface="com.ws.training.business.ProductCatalogService")
public class ProductCatalogServiceBO implements ProductCatalogService {
	
	private List<String> books = new ArrayList<String>();
	private List<String> musics = new ArrayList<String>();
	private List<String> movies = new ArrayList<String>();
		
	private List<Product> bookList = new ArrayList<Product>();
	private List<Product> musicList = new ArrayList<Product>();
	private List<Product> movieList = new ArrayList<Product>();
		
	public ProductCatalogServiceBO() {
		books.add("Effective Java");
		books.add("Thinking in Java");
		books.add("Patterns of Enterprise Application");
		
		bookList.add(new Product("Effective Java", "ABCD", "12123.22"));
		bookList.add(new Product("Thinking in Java", "PQR", "9898.76"));
		bookList.add(new Product("Patterns of Enterprise Application", "XYZ", "656548.9"));
		
		musics.add("KK Hits");
		musics.add("Shankar Madhvan's Specials");
		musics.add("Bollywood Hits");
		
		musicList.add(new Product("KK Hits", "ABC", "12121.12"));
		musicList.add(new Product("Shankar Madhvan's Specials", "PQR", "56654.12"));
		musicList.add(new Product("Bollywood Hits", "XYZ", "74565.12"));
		
		movies.add("Thor 2");
		movies.add("Iron Man 3");
		movies.add("Escape Plan");
		
		movieList.add(new Product("Thor 2", "ABC", "12121.21"));
		movieList.add(new Product("Iron Man 3", "PQR", "45454.21"));
		movieList.add(new Product("Escape Plan", "XYZ", "78787.21"));
	}
	
	@Override
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Musics");
		categories.add("Movies");
		return categories;
	}
	
	@Override
	public List<String> getProducts(String category) {
		if(category.equalsIgnoreCase("books")) {
			return books;
		} else if(category.equalsIgnoreCase("musics")) {
			return musics;
		} else if(category.equalsIgnoreCase("movies")) {
			return movies;
		} else {
			return null;
		}
	}
	
	@Override
	public List<Product> getProductsV2(String category) {
		if(category.equalsIgnoreCase("books")) {
			return bookList;
		} else if(category.equalsIgnoreCase("musics")) {
			return musicList;
		} else if(category.equalsIgnoreCase("movies")) {
			return movieList;
		} else {
			return null;
		}
	} 
	
}
