package ru.netology.sequrity_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/hi")
    public String hi(){
        return "HHi";
    }
    @GetMapping("/read")
    public String read(){
        return "Read";
    }
    @GetMapping("/write")
    public String write(){
        return "Write";
    }

}
