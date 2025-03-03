package com.example.RestApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingControllerForPost {

    // POST: /greeting/create
    @PostMapping("/greeting/create")
    public String createGreeting(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        return "Hello, " + name + "!";  // Create a greeting message using the provided name
    }
}

