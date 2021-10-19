package com.example.count.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private int counter = 0;

    @GetMapping
    public int getCounter() {
        counter++;
        return counter;
    }
}
