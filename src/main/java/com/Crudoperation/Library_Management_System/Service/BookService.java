package com.Crudoperation.Library_Management_System.Service;

import java.util.List;

import com.Crudoperation.Library_Management_System.Entities.Book;

public interface BookService {

	List<Book> getBooks();

	Book addBooks(Book book);

	Book searchBookById(long book);

	Book updateBook(Book book);

	String deleteBook(long book);

}
