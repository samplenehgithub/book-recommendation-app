package com.recommendation.RecomendationApi.service;


import java.util.List;

import com.recommendation.RecomendationApi.model.Book;

public interface BookServiceImpl {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public Book getBookById(int id);
	public Book getBookByName(String name);
	public void deleteBook(int id);
	public Book UpdateBookById(int id, Book book);

}




