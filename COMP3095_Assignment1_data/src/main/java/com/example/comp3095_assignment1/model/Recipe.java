
/*********************************************************************************
 * Project: < Recipe Project>
 * Assignment: < assignment #1 >
 * Author(s): < Harsh Patel>
 * Student Number: < 101243993>
 * Date: 11/05/2021
 * Description: This is model for this recipe entity, gives info about all the attributes of recipe.
 *********************************************************************************/

package com.example.comp3095_assignment1.model;

import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private Long prepTime;
    private Long cookTime;
    private Long totalTime;
    private String course;
    private String cuisine;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;

    public Recipe() {
    }

    public Recipe(String name, Long prepTime, Long cookTime, Long totalTime, String course, String cuisine, User user) {
        this.Name = name;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.totalTime = totalTime;
        this.course = course;
        this.cuisine = cuisine;
        this.user = user;
    }

    public Recipe(String name, Long prepTime, Long cookTime, Long totalTime, String course, String cuisine) {
        this.Name = name;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.totalTime = totalTime;
        this.course = course;
        this.cuisine = cuisine;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Long prepTime) {
        this.prepTime = prepTime;
    }

    public Long getCookTime() {
        return cookTime;
    }

    public void setCookTime(Long cookTime) {
        this.cookTime = cookTime;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public User getUser() {
        return user;
    }
}
