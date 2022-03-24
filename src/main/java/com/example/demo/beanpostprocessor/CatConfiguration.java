package com.example.demo.beanpostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("com.example.demo.beanpostprocessor")
public class CatConfiguration {

    @Bean
    public Cat cat() {
        return new Cat();
    }
}
