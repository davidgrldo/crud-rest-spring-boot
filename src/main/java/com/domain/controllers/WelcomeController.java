package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public String index() {
        return "Welcome to Spring Boot REST API";
    }

    // @PostMapping
    // public String other() {
    //     return "Hello World";
    // }
}
