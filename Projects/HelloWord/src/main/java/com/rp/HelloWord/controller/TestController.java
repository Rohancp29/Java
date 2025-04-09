package com.rp.HelloWord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping()
    public String message() {
        return "Hello World";
    }
}
    