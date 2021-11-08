package com.example.comp3095_assignment1.controllers;

/*********************************************************************************
* Project: < Recipe Project>
        * Assignment: < assignment #1 >
        * Author(s): < Ming Yang>
        * Student Number: < 101287844>
        * Date: 11/05/2021
        * Description: This is controller for this assignment, gives app url path to follow
        *********************************************************************************/

import com.example.comp3095_assignment1.model.User;
import com.example.comp3095_assignment1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/regist")
    @ResponseBody
    public String regist(@RequestParam(value = "username")String username, @RequestParam(value = "password")String password,
                         @RequestParam(value = "firstname")String firstname, @RequestParam(value = "lastname")String lastname){
        Random random = new Random();
        int s = random.nextInt(10000)%(10000+1);
        User user = new User();
        user.setId(s);
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        userRepository.save(user);
        return "success";
    }

    @RequestMapping("/goregister")//
    public String goregister(){
        return  "register";
    }

    @RequestMapping("/login")//
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/gologin")
    @ResponseBody
    public String login(@RequestParam(value = "username")String username, @RequestParam(value = "password")String password){
        List<User> users = userRepository.findByUsernameAndPassword(username, password);
        if (CollectionUtils.isEmpty(users)){
            return "failed";
        }
        return "success";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/")
    public String index1(){
        return "login";
    }

    @RequestMapping(value = "/user/plan.html")
    public String plan(){
        return "user/plan";
    }

    @RequestMapping(value = "/user/profile.html")
    public String profile(){
        return "user/profilfe";
    }
}