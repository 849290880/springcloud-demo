package com.example.springclouddemosecondtest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author created by hai on 2020/2/28
 */
@FeignClient(name = "test",fallback = HelloFeignHystrix.class)
public interface HelloFeignClient {


    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

}
