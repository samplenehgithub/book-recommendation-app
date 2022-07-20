package com.recommendation.RecomendationApi.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	// @org.springframework.beans.factory.annotation.Autowired(required=true)
import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.service.AuthorService;

	@RestController
	@RequestMapping("/author")
	//@CrossOrigin(origins = "*")

  public class AuthorController {

		@Autowired(required=false)
		AuthorService authorService;

		// http://localhost:8080/author/get-all-author
		@GetMapping("/getAllAuthor")
		
		public List<Author> getAuthor() {
			List<Author> allAuthorList = (List<Author>) authorService.getAllAuthors();
			return allAuthorList;
		}
		@GetMapping("/authorByName/{name}")
		public ResponseEntity<Author> getAuthorByName(@PathVariable("name") String name) {
			Author author = authorService.getAuthorByName(name);
			if (author == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(author));
		}
	}
//		public ResponseEntity<List<Author>> getAllAuthor() {
//			List<Author> authors = authorService.getAllAuthor();
//			if(authors != null) {
//				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//			}
//			return ResponseEntity.of(Optional.of(authors));
//			}
		// http://localhost:8080/author/get-author-by-id/{authorid}
//		@GetMapping("/get-author-by-authorId/{authorId}")
//		public ResponseEntity<Author> getAuthorById(@PathVariable(name = "authorId") int authorId) {
//			LOG.info(Integer.toString(authorId));
//			Author author = authorService.getAuthorById(authorId);
//			HttpStatus status = HttpStatus.OK;
//			ResponseEntity<Author> response = new ResponseEntity<>(author, status);
//			return response;
//		}
		// http://localhost:8080/author/add-authorName
		//@PostMapping("/add-authorName")
//		public Author addBook(@RequestBody Author  author) {
//			LOG.info(author.toString());
//			return authorService.addauthorName(author);
//		}
//	}

	

		
	