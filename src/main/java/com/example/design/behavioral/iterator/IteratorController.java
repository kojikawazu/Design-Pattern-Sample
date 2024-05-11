package com.example.design.behavioral.iterator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IteratorController {

	@GetMapping("/iterator")
	public String getMessage() {
		BookShelf bookShelf = new BookShelf();
		bookShelf.addBook(new Book("Design Patterns"));
		bookShelf.addBook(new Book("Effective Java"));
		bookShelf.addBook(new Book("Clean Code"));
		
		Iterator<Book> iterator = bookShelf.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.println(book.getName());
		}
		
		return "iterator";
	}
}
