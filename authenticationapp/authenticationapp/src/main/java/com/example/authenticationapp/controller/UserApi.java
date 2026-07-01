package com.example.authenticationapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.authenticationapp.entity.User;
import com.example.authenticationapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){

        return userService.registerUser(user);

    }

    @GetMapping("/get")
    public List<User> getUsers(){

        return userService.getUsers();

    }

    @PostMapping("/login")
    public String login(@RequestBody User user){

        return userService.login(user);

    }

}