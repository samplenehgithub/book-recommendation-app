package com.recommendation.RecomendationApi.service;



import java.util.List;

import com.recommendation.RecomendationApi.model.Author;

public interface AuthorServiceImpl {

	public Author addAuthor(Author author);
	Author getAuthorById(int authorId);
	List<Author> getAllAuthors();
}

