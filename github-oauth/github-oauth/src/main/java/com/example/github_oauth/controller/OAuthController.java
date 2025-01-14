package com.example.github_oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OAuthController {

    @GetMapping
    @ResponseBody
    public String greet(){
        return "Hello Welcome to GitHub OAuth";
    }
}
