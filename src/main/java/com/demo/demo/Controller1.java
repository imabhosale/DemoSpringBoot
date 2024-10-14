package com.demo.demo;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping("/hello")
    public String demomethod(){
        return "HI....";
    }
    
}

