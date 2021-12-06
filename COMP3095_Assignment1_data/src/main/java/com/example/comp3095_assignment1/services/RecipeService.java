package com.example.comp3095_assignment1.services;

/*********************************************************************************
 * Project: < Recipe Project>
 * Assignment: < assignment #1 >
 * Author(s): < Harsh Patel>
 * Student Number: < 101243993>
 * Date: 11/06/2021
 * Description: This is controller for this assignment, gives app url path to follow
 *********************************************************************************/

import com.example.comp3095_assignment1.model.Recipe;
import com.example.comp3095_assignment1.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe searchRecipe(String name) {
            return recipeRepository.findRecipeByName(name);
    }

    public List<Recipe> viewRecipe(){
        return recipeRepository.findAll();
    }
}