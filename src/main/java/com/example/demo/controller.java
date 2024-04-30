package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class controller {
    @GetMapping("/Home")
    public String api() {
        return "hiiiiii";
    }
    



}
