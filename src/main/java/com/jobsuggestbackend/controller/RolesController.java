package com.jobsuggestbackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roles")
public class RolesController {
    @PostMapping("/createRoles")
    public String roles() {return "Create Roles";}
}
