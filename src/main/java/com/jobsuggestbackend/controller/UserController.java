package com.jobsuggestbackend.controller;

import com.jobsuggestbackend.DTO.UserRegisterInputDTO;
import com.jobsuggestbackend.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody UserRegisterInputDTO inputDTO) {
        return userService.register(inputDTO);
    }

    @PostMapping("/login")
    public String login() {
        return "";
    }

    @PostMapping("/registerModerator")
    public String registerModerator() {
        return "Create Moderator";
    }
}
