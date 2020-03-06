package com.example.springclouddemotest.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by hai on 2020/2/28
 */
@RestController
@Slf4j
public class FeignController {

    @GetMapping("/hello")
    public String hello(String name){
        log.debug("被调用/hello接口");
        return "hello i am test server";
    }

}
