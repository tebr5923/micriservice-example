package com.example.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World!!!" ;
    }
//
//    @GetMapping("/hello/{name}")
//    public String getHelloWorld(@PathVariable String name) {
//        if (name == null) {
//            name = "user";
//        }
//        return "Hello World " + name;
//    }
}
