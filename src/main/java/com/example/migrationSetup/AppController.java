package com.example.migrationSetup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mig")
public class AppController{

    @GetMapping("/test")
    public String testing(){
        return "running well";
    }
}