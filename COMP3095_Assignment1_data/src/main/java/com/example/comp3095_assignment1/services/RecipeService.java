package com.example.comp3095_assignment1.services;

import com.example.comp3095_assignment1.model.Recipe;
import com.example.comp3095_assignment1.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe searchRecipe(String name) {
            return recipeRepository.findByName(name);
    }

    public List<Recipe> viewRecipe(){
        return recipeRepository.findAll();
    }
}