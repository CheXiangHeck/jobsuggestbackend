package com.jobsuggestbackend.controller;

import com.jobsuggestbackend.DTO.UserLoginDTO;
import com.jobsuggestbackend.DTO.UserRegisterInputDTO;
import com.jobsuggestbackend.application.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody UserRegisterInputDTO inputDTO) {
        String result = userService.register(inputDTO);
        Map<String, String> response = new HashMap<>();
        response.put("message", result);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody UserLoginDTO inputLoginDTO) {
        String result = userService.login(inputLoginDTO);
        Map<String, String> response = new HashMap<>();
        response.put("message", result);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/registerModerator")
    public ResponseEntity<Map<String, String>> registerModerator(@RequestBody UserRegisterInputDTO inputDTO) {
        String result = userService.registerModerator(inputDTO);
        Map<String, String> response = new HashMap<>();
        response.put("message", result);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/createProfile")
    public ResponseEntity<Map<String, String>> createProfile() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Create Profile");
        return ResponseEntity.ok(response);
    }
}
