package com.example.springclouddemosecurity.controller;

import com.example.springclouddemosecurity.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author created by hai on 2020/3/3
 */
@RestController
public class HelloController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/user")
    public ResponseEntity user(){
        return ResponseEntity.ok(Arrays.asList(applicationContext.getBeanDefinitionNames()));
    }

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok(helloService.hello());
    }

}
