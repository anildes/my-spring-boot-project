package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    // Simple GET request to return a welcome message
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to my Spring Boot application!";
    }

    // Simple POST request to echo back the message sent in the request body
    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "You sent: " + message;
    }
}
