/*********************************************************************************
 * Project: < Recipe Project>
 * Assignment: < assignment #1 >
 * Author(s): < Harsh Patel>
 * Student Number: < 101243993>
 * Date: 11/06/2021
 * Description: This is controller for this assignment, gives app url path to follow
 *********************************************************************************/

package com.example.comp3095_assignment1.controllers;

import com.example.comp3095_assignment1.model.Recipe;
import com.example.comp3095_assignment1.model.User;
import com.example.comp3095_assignment1.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;




}
