package com.example.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
	private List<Book> books;
	
	public BookShelf() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public int getSize() {
		return books.size();
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
