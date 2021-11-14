package com.example.count.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private StringRedisTemplate template;

    @GetMapping
    public Long getCounter() {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.increment("count");
    }
}
