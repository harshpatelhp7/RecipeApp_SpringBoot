package com.example.comp3095_assignment1.model;
/*********************************************************************************
 * Project: < Recipe Project>
 * Assignment: < assignment #2 >
 * Author(s): < Ming Yang>
 * Student Number: < 101287844>
 * Date: 10/31/2021
 * Description: This is model made for plan/events
 *********************************************************************************/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}