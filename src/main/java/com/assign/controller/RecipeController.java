package com.assign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assign.dao.Recipes;
import com.assign.dao.repository.RecipeRepository;
import com.assign.pojo.Input;


@Controller
public class RecipeController {
	
	@Autowired
	RecipeRepository recipeRepository; 
	
	@Autowired
	DatabaseAccess databaseAccess;
	
	@RequestMapping(value="/index/add")
	public String add(@RequestBody Input input) {
		
		recipeRepository.save(databaseAccess.addRecipes(input));
		System.out.println("add recipe");
		return "index";
	}
	
	@RequestMapping(value="/index/find")
	public String find(@RequestParam String name) {
		//recipeRepository.findByRecipeName(name);
		System.out.println("find");
		return "index";
		
	}
	
	@RequestMapping(value="/index/delete")
	public String delete(@RequestParam String name) {
		//recipeRepository.delete(recipeRepository.findByRecipeName(name));
		System.out.println("delete");
		return "index";
		
	}
	
	@RequestMapping(value="/index/edit")
	public String edit(@RequestParam String name) {
		//Recipes recipes = recipeRepository.findByRecipeName(name);
		
		//recipeRepository.save(databaseAccess.editRecipes(recipes));
		
		System.out.println("Edit");
		return "index";
		
	}
	
}
