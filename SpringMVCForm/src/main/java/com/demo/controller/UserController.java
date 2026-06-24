package com.demo.controller;

import javax.validation.Valid;

import com.demo.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    // Load Form Page

    @GetMapping("/")
    public String showForm(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    // Handle Form Submit

    @PostMapping("/register")
    public String registerUser(
            @Valid @ModelAttribute("user") User user,
            BindingResult result,
            Model model) {

        // Validation Errors

        if (result.hasErrors()) {
            return "register";
        }

        // Success Message

        model.addAttribute("message",
                "Registration Successful!");

        return "success";
    }
}