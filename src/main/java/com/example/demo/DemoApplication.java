package com.example.demo;

import com.example.demo.beanpostprocessor.Cat;
import com.example.demo.beanpostprocessor.CatConfiguration;
import com.example.demo.config.ColorConfiguration;
import com.example.demo.spi.SPIDemoInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ServiceLoader;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ColorConfiguration.class);
//		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
//		ServiceLoader<SPIDemoInterface> load = ServiceLoader.load(SPIDemoInterface.class);
//		load.forEach(SPIDemoInterface::test);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CatConfiguration.class);
//		System.out.println(context.getBean(Cat.class).getName());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.demo.component");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
