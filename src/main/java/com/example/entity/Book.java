package com.example.entity;

public class Book {

	private int id;
	
	private String title;

	private String author;

	private String language;

	public Book(int id, String title, String author, String language) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", language=" + language + "]";
	}

}
