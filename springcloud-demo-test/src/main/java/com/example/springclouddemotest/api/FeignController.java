package com.example.springclouddemotest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by hai on 2020/2/28
 */
@RestController
public class FeignController {

    @GetMapping("/hello")
    public String hello(String name){

        throw new RuntimeException();
    }

}
