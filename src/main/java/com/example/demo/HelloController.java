package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class HelloController {

    @GetMapping
    public String home() {
        return "CI/CD working successfully ";
    }

    @GetMapping("/version")
    public String version() {
        return "version 1.0.0 ";
    }
}
