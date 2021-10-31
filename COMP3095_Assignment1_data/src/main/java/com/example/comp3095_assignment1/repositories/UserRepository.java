package com.example.comp3095_assignment1.repositories;

import com.example.comp3095_assignment1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
