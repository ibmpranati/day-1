package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.set.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		Map<String, Book> books = new HashMap<String, Book>();
		System.out.println(books.size());
		for(int i = 0; i < 10; i++) {
			Book book1 = new Book("Java");
			books.put("Book" + i, book1);
		}
//		books.clear();		//Removes all the elements
//		books.remove("Book2");
		System.out.println(books.containsKey("Book5"));
		System.out.println(books.size());	//Entry = key + value
		
	}
}
