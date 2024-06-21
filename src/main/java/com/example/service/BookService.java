package com.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;

@Service
public class BookService {
	
	static List<Book> books = new ArrayList<>();
	
	static int bookCount = 3;
	
	static {
		books.add(new Book(1, "playing in my way", "sachin", "English"));
		books.add(new Book(2, "Harry Potter", "JK Rowling", "English"));
		books.add(new Book(3, "Winds of winter", "George RR Martin", "English"));	
	}
	
	
	public List<Book> getBooks(){
		return books;
	}
	
	public boolean addBook(Book book) {
		bookCount += 1;
		book.setId(bookCount);
		
		try {
			books.add(book);
		}
		catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	public boolean updateBook(Book updateBook) {
		Iterator<Book> itr = books.iterator();
		
		while(itr.hasNext()) {
			Book book = itr.next();
			if(book.getId() == updateBook.getId()) {
				book.setAuthor(updateBook.getAuthor());
				book.setLanguage(updateBook.getLanguage());
				book.setTitle(updateBook.getTitle());
				return true;
			}
		}
		
		return false;
	}
	
	public boolean deleteBook(int id) {
		
		Iterator<Book> itr = books.iterator();
		
		while(itr.hasNext()) {
			Book book = itr.next();
			if(book.getId() == id) {
				itr.remove();
				return true;
			}
		}
		
		return false;
		
	}
	
	

}
