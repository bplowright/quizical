package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
    @Controller
    public class HomeController {
        @GetMapping("/movie")
        public String loadTvForm(Model model){
            model.addAttribute("movie", new Movie());
            return "movie";
        }

        @PostMapping("/movie")
        public String processTvForm(@Valid Movie Movie, BindingResult result){
            if (result.hasErrors()){
                return "movie";
            }
            return "movieconfirm";
        }
    }
