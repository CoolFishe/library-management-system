package com.zz.librarymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, library Builder! Project Setup Success!";
    }
}
