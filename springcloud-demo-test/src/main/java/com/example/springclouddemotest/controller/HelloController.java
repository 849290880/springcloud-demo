package com.example.springclouddemotest.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author created by hai on 2020/2/25
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${env}")
    private String env;

    @GetMapping("env")
    public String env(){
        return env;
    }

    @GetMapping("/getHostMessage/{id}")
    @HystrixCommand(fallbackMethod = "getHostMessageFallback")
    public Map<String, Object> getHostMessage(@PathVariable String id) {

        if ("error".equals(id)) {
            throw new RuntimeException("测试异常演习！");
        }

        Map<String, Object> map = new HashMap<>();
        try {
            InetAddress serverHost = InetAddress.getLocalHost();
            map.put("hostname", serverHost.getHostName());
            map.put("hostAddress", serverHost.getHostAddress());
            map.put("id", id);

            return map;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }

    }

    public Map<String, Object> getHostMessageFallback(@PathVariable String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("description", "异常演习Fallback！");
        return map;

    }

    @GetMapping("/printCookie")
    public String cookie(@CookieValue(value="JSESSIONID",required = false)String sessionId){
        return sessionId;
    }

    @GetMapping("/setCookie")
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("sessionId", "CookieTestInfo");
        response.addCookie(cookie);

        return "添加cookie成功";
    }


//    @GetMapping("/hello")
//    public String test(){
//        return "I am test server";
//    }

}
