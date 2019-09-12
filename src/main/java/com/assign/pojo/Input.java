package com.assign.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Input {
	@JsonProperty("recipeId")
	private int recipeId;
	@JsonProperty("isVeg")
	private String isVeg;
	@JsonProperty("numberOfPeople")
	private int numberOfPeople;
	@JsonProperty("ingredients")
	private String ingredients;
	@JsonProperty("instructions")
	private String instructions;
	@JsonProperty("recipeName")
	private String recipeName;
	public int getRecipeId() {
		return recipeId;
	}
	@JsonProperty("recipeId")
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getIsVeg() {
		return isVeg;
	}
	@JsonProperty("isVeg")
	public void setIsVeg(String isVeg) {
		this.isVeg = isVeg;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	@JsonProperty("numberOfPeople")
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public String getIngredients() {
		return ingredients;
	}
	@JsonProperty("ingredients")
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstructions() {
		return instructions;
	}
	@JsonProperty("instructions")
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getRecipeName() {
		return recipeName;
	}
	@JsonProperty("recipeName")
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	
}
