package com.livemarker.webBlog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Инфомация обо мне");
        return "about";
    }
    @GetMapping("/blogMain")
    public String blogMain(Model model) {
        model.addAttribute("title", "Главная страница");
        return "blogMain";
    }

}


