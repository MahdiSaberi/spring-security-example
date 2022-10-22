package com.example.springsecurityexample.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @GetMapping("/")
    public ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView("home");
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        modelAndView.addObject("currentUsername",username);
        return modelAndView;
    }
}
