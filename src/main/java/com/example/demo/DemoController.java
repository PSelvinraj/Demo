package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/api")  // Base URL path for this controller
public class DemoController {

    @GetMapping("/hello")  // Maps HTTP GET requests to "/api/hello"
    public String sayHello() {
        return "Hello from Percy's Microservice!";
    }
}
