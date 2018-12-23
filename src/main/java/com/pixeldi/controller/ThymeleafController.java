package com.pixeldi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Controller
public class ThymeleafController {

    @GetMapping("/cheese")
    public String index(Model model){

        ArrayList<String> cheeses= new ArrayList<>();
        cheeses.add("chedder");
        cheeses.add("parmesan");
        cheeses.add("muster");

        model.addAttribute("cheeses",cheeses);

        model.addAttribute("title","My Cheese");
        return "index";
    }
}
