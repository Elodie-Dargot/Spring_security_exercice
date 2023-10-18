package com.wildcodeschool.security_exercice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class main {
    @PostMapping ("/register")
    public String register(){
        return "Register page";
    }

    @GetMapping("/login")
    public String login(){
        return "Login page";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Admin page";
    }
}
