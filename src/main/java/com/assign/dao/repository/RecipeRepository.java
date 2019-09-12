package com.assign.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assign.dao.Recipes;



public interface RecipeRepository extends CrudRepository<Recipes, Integer>{

	@Query("SELECT r FROM RecipeDAO r WHERE recipeName= 1?")
	Recipes findByRecipeName(String recipeName);
}
