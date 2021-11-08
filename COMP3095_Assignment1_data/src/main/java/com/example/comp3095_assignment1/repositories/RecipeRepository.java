package com.example.comp3095_assignment1.repositories;

import com.example.comp3095_assignment1.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {


}
