package com.example.comp3095_assignment1.controllers;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping(value = "/user/createRecipes")
    public String createRecipe(){
        return "user/createRecipe";
    }

    @RequestMapping(value = "/user/createdRecipe")
    public String createdRecipe(Recipe recipe){
        recipeRepository.save(recipe);
        return "user/createRecipe";
    }

    @RequestMapping(value = "/recipe/view")
    public String viewRecipe(Model model){
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipe/view";
    }

    @RequestMapping(value = "recipe/ingredients/{name}")
    public String viewIngredients(Model model, @PathVariable String name){
        model.addAttribute("recipe",recipeRepository.findRecipeByName(name));
        return "recipe/ingredients";
    }

    @RequestMapping(value = "recipe/steps/{name}")
    public String viewSteps(Model model, @PathVariable String name){
        model.addAttribute("recipe",recipeRepository.findRecipeByName(name));
        return "recipe/steps";
    }

    @RequestMapping(value = "/user/goProfile")
    public String goProfile(){
        return "user/profile";
    }

    @RequestMapping(value = "/search")
    public String search(){
        return "recipe/search";
    }

}