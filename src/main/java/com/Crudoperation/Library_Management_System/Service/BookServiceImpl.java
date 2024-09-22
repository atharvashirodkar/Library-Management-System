package com.Crudoperation.Library_Management_System.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Crudoperation.Library_Management_System.Entities.Book;

@Service
public class BookServiceImpl implements BookService{
	List<Book> list;

	public BookServiceImpl() {

		list = new ArrayList<>();
//		list.add(new Book(1001, "Sherlock Holmes", "Sir Aurthur Doyle", "Mystery", "THis is Mystery Book", ""));
//		list.add(new Book(1002, "Harry Potter", "J K Rowling", "Science Fiction", "THis is Science Fiction Book", ""));

	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Book addBooks(Book book) {
		// TODO Auto-generated method stub
		list.add(book);
		return book;
	}

	@Override
	public Book searchBookById(long bookId) {
		// TODO Auto-generated method stub
		Book searchedBook = null;
		

		for (Book b : list) {
			if (b.getId() == bookId) {
				searchedBook = b;
				break;
			}

		}

		return searchedBook;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub

		for (Book b : list) {

			if (b.getId() == book.getId()) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
				b.setGenre(book.getGenre());
				b.setBody(book.getBody());
				b.setBody(book.getLink());
				break;
			}
		}

		return book;
	}

	@Override
	public String deleteBook(long bookId) {
		// TODO Auto-generated method stub

		List<Book> removeBook = new ArrayList<>();

		for (Book b : list) {

			if (b.getId() == bookId) {

				removeBook.add(b);
				break;
			}
		}
		list.removeAll(removeBook);

		return "Book Deleted Successfully";
	}
	
	

}
