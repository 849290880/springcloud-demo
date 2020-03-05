package com.example.springclouddemosecondtest.config;

import feign.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author created by hai on 2020/2/28
 */
@Configurable
public class FeignConfig {

    @Bean
    Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }

}
