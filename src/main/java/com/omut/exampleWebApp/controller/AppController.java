package com.omut.exampleWebApp.controller;

import com.omut.exampleWebApp.model.Create;
import com.omut.exampleWebApp.model.Insert;
import com.omut.exampleWebApp.model.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    private static String greeting = "Hello, this is an example of Web Application for EFKO company";
    private static String message = "Create request successfully completed";

    @Autowired
    Create create;
    @Autowired
    Insert insert;
    @Autowired
    Select select;

    @RequestMapping ("/")
    public String indexPage (Model model) {
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("greeting", greeting);
        return "index";
    }

    @RequestMapping ("/create")
    public String create (Model model) {
        String message = "Create request successfully completed";
        String response = create.create();
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("response", message);
        model.addAttribute("response", response);
        return "result";
    }

    @RequestMapping ("/insert")
    public String insert (Model model) {
        String message = "Insert request successfully completed";
        String response = insert.insert();
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("response", message);
        model.addAttribute("response", response);
        return "result";
    }

    @RequestMapping ("/select")
    public String select (Model model) {
        String message = "Select request successfully completed";
        String response = select.select();
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("response", message);
        model.addAttribute("response", response);
        return "result";
    }
}
