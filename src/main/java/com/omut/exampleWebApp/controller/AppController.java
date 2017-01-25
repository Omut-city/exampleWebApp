package com.omut.exampleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping
    public String indexPage (Model model) {
        String greeting = "Hello, this is an example of Web Application for EFKO company";
        model.addAttribute("greeting", greeting);
        return "index";
    }
}
