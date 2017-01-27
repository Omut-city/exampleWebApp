package com.omut.exampleWebApp.controller;

import com.omut.exampleWebApp.dao.Airplane;
import com.omut.exampleWebApp.model.Add;
import com.omut.exampleWebApp.model.Create;
import com.omut.exampleWebApp.model.Insert;
import com.omut.exampleWebApp.model.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {
    private static String greeting = "Hello, this is an example of Web Application for EFKO company";

    @Autowired
    Create create;
    @Autowired
    Insert insert;
    @Autowired
    Select select;
    @Autowired
    Add add;

    @RequestMapping ("/")
    public String indexPage (Model model) {
        String response = "Ready";
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("response", response);
        return "index";
    }

    @RequestMapping ("/create")
    public String create (Model model) {
        String message = "Create request successfully completed";
        String response = create.create();
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("message", message);
        model.addAttribute("response", response);
        return "result";
    }

    @RequestMapping ("/insert")
    public String insert (Model model) {
        String message = "Insert request successfully completed";
        String response = insert.insert();
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("message", message);
        model.addAttribute("response", response);
        return "result";
    }

    @RequestMapping ("/select")
    public String select (Model model) {
        String message = "Select request successfully completed";
        String response = "Data selected from table";
        List list = select.select();
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("message", message);
        model.addAttribute("response", response);
        model.addAttribute("list", list);
        return "view";
    }

    @RequestMapping ("/addForm")
    public String addForm (Model model) {
        String response = "Form is ready";
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("response", response);
        return "addForm";
    }

    @RequestMapping ("/addFormAsXML")
    public String addFormAsXML (Model model) {
        String response = "Form is ready";
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("response", response);
        return "addFormAsXML";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add (HttpServletRequest request, Model model)
            throws UnsupportedEncodingException {
        String message = "Add request successfully completed";
        String response = add.add(request);
        model.addAttribute("greeting", AppController.greeting);
        model.addAttribute("message", message);
        model.addAttribute("response", response);
        return "result";
    }

    @RequestMapping (
            value="/viewAllAsXML",
            method = RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public String viewAllAsXML () {
        String result = "";
         for (Airplane airplane: select.select()) {
            result += airplane.toXML();
        }
        return result;
    }

    @RequestMapping (
            value="/downloadAllAsXML",
            method = RequestMethod.GET,
            produces = "application/txt")
    @ResponseBody
    public String downloadAllAsXML () {
        String result = "";

        for (Airplane airplane: select.select()) {
            result += airplane.toXML();
        }
        return result;
    }

    @RequestMapping(
            value = "viewAsXML/{id}",
            method = RequestMethod.GET,
            produces = "application/xml")
    @ResponseBody
    public String viewAsXMLById(@PathVariable("id") int id) {
        return select.selectById(id).toXML();
    }

    @RequestMapping(
            value = "downloadAsXML/{id}",
            method = RequestMethod.GET,
            produces = "application/txt")
    @ResponseBody
    public String downloadAsXMLById(@PathVariable("id") int id) {
        return select.selectById(id).toXML();
    }
}
