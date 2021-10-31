package com.example.comp3095_assignment1.controllers;


import com.example.comp3095_assignment1.model.User;
import com.example.comp3095_assignment1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/unregisteredUser", method = RequestMethod.GET)
    public String unregisteredUser(){

        return "users/unregisteredUser";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(User user){
        userRepository.save(user);
        return "Successfully Registered.";
    }


    @RequestMapping(value = "/registeredUser", method = RequestMethod.GET)
    public String getUsers(Model model){
        model.addAttribute("users",userRepository.findAll());
        return "users/list";

    }
}
