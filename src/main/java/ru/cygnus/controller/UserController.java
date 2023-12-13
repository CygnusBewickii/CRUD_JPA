package ru.cygnus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.cygnus.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String getAll(Model model) {
        model.addAttribute("users", userService.getAll());
        return "index";
    }
}
