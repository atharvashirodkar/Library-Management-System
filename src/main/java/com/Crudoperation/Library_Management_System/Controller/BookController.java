package com.Crudoperation.Library_Management_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Crudoperation.Library_Management_System.Entities.Book;
import com.Crudoperation.Library_Management_System.Service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}

	@GetMapping("/view-books")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}
	
	@PostMapping("/add-books")
	public Book addBooks(@RequestBody Book book) {
		return bookService.addBooks(book);
	}
	
	@GetMapping("/book/{bookId}")
	public Book searchBookById(@PathVariable String bookId) {

		return bookService.searchBookById(Long.parseLong(bookId));

}

	@PutMapping("/update-book")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/delete-book/{bookId}")
	public String deleteBook(@PathVariable String bookId) {
		return bookService.deleteBook(Long.parseLong(bookId));
	}
	
}
