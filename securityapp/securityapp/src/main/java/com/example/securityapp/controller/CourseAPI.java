package com.example.securityapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class CourseAPI {


    @GetMapping("/home")
    public String home() {
        return "home page....";
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses page....";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile page....";
    }
}




    

