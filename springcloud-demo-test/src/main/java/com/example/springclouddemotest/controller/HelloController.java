package com.example.springclouddemotest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by hai on 2020/2/25
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String test(){
        return "I am test server";
    }

}
