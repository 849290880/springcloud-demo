package com.example.springclouddemosecondtest.service;

import org.springframework.stereotype.Component;

/**
 * @author created by hai on 2020/2/28
 */
@Component
public class HelloFeignHystrix implements HelloFeignClient{

    @Override
    public String hello(String name) {

        return "调用出错";
    }
}
