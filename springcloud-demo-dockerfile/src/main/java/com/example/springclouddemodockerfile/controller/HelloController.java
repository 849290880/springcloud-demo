package com.example.springclouddemodockerfile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * @author created by hai on 2020/3/9
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello, I am docker file";
    }

    @GetMapping("/compiler")
    public String compiler(){

        return "";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam String name){
        if("hai".equals(name)){
            throw new RuntimeException("has problem!!!");
        }
        return "hello, My name is " + name;
    }


    @GetMapping("/exception")
    public String exception(){
        throw new RuntimeException("has problem!!!");
    }

}
