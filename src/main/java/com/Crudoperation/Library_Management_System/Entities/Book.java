package com.Crudoperation.Library_Management_System.Entities;

public class Book {
	private long id;
	private String title;
	private String author;
	private String genre;
	private String body;
	private String link;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", body=" + body + ",link=" + link + "]";
	}
	
	public Book(long id, String title, String author, String genre, String body, String link) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.body = body;
		this.link = link;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
