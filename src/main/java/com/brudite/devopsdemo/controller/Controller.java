package com.brudite.devopsdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/index")
    public String getUserDetails(Model model)
    {
        return "index";
    }
}
