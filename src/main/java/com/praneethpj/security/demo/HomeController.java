package com.praneethpj.security.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "This is dashboard Page";
    }

    @GetMapping("/adminpage")
    public String adminpage(){
        return "This is Admin Page";
    }
}
