package com.example.demo.config;

import com.example.demo.po.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ColorRegisterConfiguration {

    @Bean
    public Yellow yellow() {
        return new Yellow();
    }
}
