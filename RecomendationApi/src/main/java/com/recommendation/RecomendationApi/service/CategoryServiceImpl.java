package com.recommendation.RecomendationApi.service;


import org.springframework.stereotype.Service;

import com.recommendation.RecomendationApi.model.Category;

@Service
public interface CategoryServiceImpl {

	Category addCategory(Category category);

}


