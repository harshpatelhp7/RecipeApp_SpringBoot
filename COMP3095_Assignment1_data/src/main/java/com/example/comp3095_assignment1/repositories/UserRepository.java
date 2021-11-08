package com.example.comp3095_assignment1.repositories;
/*********************************************************************************
 * Project: < Recipe Project>
 * Assignment: < assignment #1 >
 * Author(s): < Ming Yang>
 * Student Number: < 101287844>
 * Date: 10/31/2021
 * Description: This is repository for this assignment, define some terms like findByUsernameAndPassword
 * and any other terms needed
 *********************************************************************************/
import com.example.comp3095_assignment1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> findByUsernameAndPassword(String username, String password);
}
