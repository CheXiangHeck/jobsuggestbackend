package com.jobsuggestbackend.controller;

import com.jobsuggestbackend.DTO.UserLoginDTO;
import com.jobsuggestbackend.DTO.UserRegisterInputDTO;
import com.jobsuggestbackend.application.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    public String login(@RequestBody UserLoginDTO inputLoginDTO) {
        return userService.login(inputLoginDTO);
    }

    @PostMapping("/registerModerator")
    public String registerModerator(@RequestBody UserRegisterInputDTO inputDTO) {
        return userService.registerModerator(inputDTO);
    }
}
