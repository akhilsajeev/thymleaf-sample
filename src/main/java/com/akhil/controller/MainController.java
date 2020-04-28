package com.akhil.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;
    private List<String> tasks = Arrays.asList("Titanic", "Transformers", "300", "Avengers");

    @GetMapping("/")
    public String main(Model model) {


        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        return "welcome";
    }


}
