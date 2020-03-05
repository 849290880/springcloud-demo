package com.example.springclouddemosecondtest.controller;

import com.example.springclouddemosecondtest.service.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by hai on 2020/2/28
 */
@RestController
public class HelloController {


    @Autowired
    private HelloFeignClient helloFeignService;


    @GetMapping("/hello")
    public String hello(String name){
        return helloFeignService.hello(name);
    }

}
