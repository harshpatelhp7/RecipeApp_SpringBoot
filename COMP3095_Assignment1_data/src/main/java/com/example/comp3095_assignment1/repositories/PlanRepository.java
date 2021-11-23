package com.example.comp3095_assignment1.repositories;

import com.example.comp3095_assignment1.model.Plan;
import com.example.comp3095_assignment1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{


    List<Plan> findByName(String name);


}
