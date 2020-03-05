package com.example.springclouddemobloomfilter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author created by hai on 2020/2/27
 */
@RestController
@Slf4j
public class BashController {

    /**
     *  数据库插入2w条数据，数据已有相同id的数据删除
     */
    @GetMapping("/batch")
    public void batch(){
        Random random = new Random();
        for (int i = 0; i < 20000; i++) {
            int num = random.nextInt(500000);

        }



    }


}
