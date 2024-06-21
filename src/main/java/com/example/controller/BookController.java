package com.example.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookService;

@RestController()
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		
		return bookService.getBooks();
	}
	
	@PostMapping("/books")
	public String addBook(@RequestBody Book book) {
		
		if(bookService.addBook(book))
			return "Book added successfully";
		else
			return "Bad request";
	}
	
	@PutMapping("/books")
	public String updateBook(@RequestBody Book book) {
		if(bookService.updateBook(book))
			return "book updated successfully";
		else
			return "book with id = " + book.getId() + " not found";
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable int id) {
		
		if(bookService.deleteBook(id))
			return "book deleted successfully";
		else
			return "book with id = " + id + " not found";
	}
	
}
