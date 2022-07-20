package com.recommendation.RecomendationApi.service;


import java.util.List;

import com.recommendation.RecomendationApi.model.AppUser;

public interface AppUserServiceImpl {

	List<AppUser> getAllUsers();

	AppUser signUpUser(AppUser appUser);

	AppUser signInUser(AppUser appUser);

	AppUser updateUser(AppUser appUser);

}





