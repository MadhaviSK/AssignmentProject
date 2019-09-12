package com.assign.controller;

import com.assign.dao.Recipes;
import com.assign.pojo.Input;

public class DatabaseAccess {

	public Recipes addRecipes(Input input) {
		Recipes recipes = new Recipes();
		
		recipes.setId(input.getRecipeId());
		recipes.setIngredients(input.getIngredients());
		recipes.setInstructions(input.getInstructions());
		recipes.setIsVeg(input.getIsVeg());
		recipes.setNumberOfPeople(input.getNumberOfPeople());
		recipes.setRecipeName(input.getRecipeName());
		
		return recipes;
	}
	
	public Recipes editRecipes(Recipes recipes) {
		//Recipes recipes = new Recipes();
		
		recipes.setId(recipes.getId());
		recipes.setIngredients(recipes.getIngredients());
		recipes.setInstructions(recipes.getInstructions());
		recipes.setIsVeg(recipes.getIsVeg());
		recipes.setNumberOfPeople(recipes.getNumberOfPeople());
		
		return recipes;
	}
	
}
