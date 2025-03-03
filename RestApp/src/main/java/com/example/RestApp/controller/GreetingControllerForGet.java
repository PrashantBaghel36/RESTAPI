package com.example.RestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerForGet {

    // GET: /greeting
    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello there";
    // Return a simple greeting message
    }
}

