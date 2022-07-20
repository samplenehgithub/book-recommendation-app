package com.recommendation.RecomendationApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recommendation.RecomendationApi.model.Category;
import com.recommendation.RecomendationApi.repository.CategoryRepository;

@Service
public class CategoryService implements CategoryServiceImpl {
	
	@Autowired
	CategoryRepository catRepo;
	
	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return catRepo.save(category);
	}

//	public Category addCategory1(Category category) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}


