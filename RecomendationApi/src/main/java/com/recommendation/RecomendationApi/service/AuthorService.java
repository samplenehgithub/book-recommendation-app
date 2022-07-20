package com.recommendation.RecomendationApi.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.repository.AuthorRepository;

public class AuthorService implements AuthorServiceImpl{

	@Autowired
	AuthorRepository authorRepo;
	
	@Override
	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorRepo.save(author);
	}
	@Override
	public List<Author> getAllAuthors() {
	
		
		
		// TODO Auto-generated method stub
		return authorRepo.findAll();
		
		
	}

//	@Override
//	public Author getAuthorByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	//@Override
//	public List<Author> getAllAuthors() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

	


	//@Override
	
	//@Override
//	public Author getAuthorByName(String name)
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Author addauthorName(Author author) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public List<Author> getAllAuthor() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Author getAuthorByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
	@Override
	public Author getAuthorById(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}
	public Author getAuthorByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	}



