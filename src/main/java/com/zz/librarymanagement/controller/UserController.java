package com.zz.librarymanagement.controller;

import com.zz.librarymanagement.repository.domain.User;
import com.zz.librarymanagement.repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/user")
    public User getUser() {
       User user = userService.getById(1);
       return user;
    }
}
