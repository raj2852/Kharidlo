package com.kharidlo.kharidlo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to kharidlo";
    }
}
