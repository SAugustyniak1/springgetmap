package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(@RequestParam("v") String x, Model model){

        model.addAttribute("name", x);

        return "index";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contacts";
    }
}
