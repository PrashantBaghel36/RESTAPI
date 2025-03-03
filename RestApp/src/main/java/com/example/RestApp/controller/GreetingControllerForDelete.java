package com.example.RestApp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingControllerForDelete {

    // DELETE: /greeting/delete
    @DeleteMapping("/greeting/delete")
    public String deleteGreeting(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        return "Goodbye, " + name;  // Simulate the deletion of a greeting message
    }
}

