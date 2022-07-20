package com.recommendation.RecomendationApi.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recommendation.RecomendationApi.exception.BookNotFoundException;
import com.recommendation.RecomendationApi.model.Book;
import com.recommendation.RecomendationApi.repository.BookRepository;

@Service
public class BookService implements BookServiceImpl { 
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("In Servixe");
		return bookRepository.save(book);
	}

	@Override
	public Book getBookById(int id) {
		
		return bookRepository.findBookByBookId(id);
	}

	@Override
	public Book getBookByName(String name) {
		return bookRepository.findBookByBookName(name);
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findBookByBookId(id);
		if(book != null) {
			bookRepository.deleteById(id);
		}else {
			throw new BookNotFoundException("Book not found");
		}
		
	}

	@Override
	public Book UpdateBookById(int id, Book book) {
		Book bookForUpdate = bookRepository.findBookByBookId(id);
		if(bookForUpdate != null) {
			return bookRepository.save(book);
		}else {
			throw new BookNotFoundException("Book not found");
		}
		
	}

	

}





