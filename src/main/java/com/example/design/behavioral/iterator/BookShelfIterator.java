package com.example.design.behavioral.iterator;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return index < bookShelf.getSize();
	}

	@Override
	public Book next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
