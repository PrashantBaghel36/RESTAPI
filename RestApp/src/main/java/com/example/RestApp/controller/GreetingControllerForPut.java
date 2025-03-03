package com.example.RestApp.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingControllerForPut {

    // PUT: /greeting/update
    @PutMapping("/greeting/update")
    public String updateGreeting(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        return "Updated greeting for " + name;  // Update the greeting with the provided name
    }
}
