package com.example.springclouddemotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudDemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemoTestApplication.class, args);
    }

}
