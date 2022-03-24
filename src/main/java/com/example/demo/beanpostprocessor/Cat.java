package com.example.demo.beanpostprocessor;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.util.ResourceBundle;

@Data
@AllArgsConstructor
public class Cat implements InitializingBean {

    private String name;

    public Cat() {
        System.out.println("Cat constructor run...");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("Cat PostConstruct run...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet run...");
    }
}
