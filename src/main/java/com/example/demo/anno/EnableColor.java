package com.example.demo.anno;

import com.example.demo.config.ColorImportBeanDefinitionRegistrar;
import com.example.demo.config.ColorImportSelector;
import com.example.demo.config.ColorRegisterConfiguration;
import com.example.demo.po.Red;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Red.class, ColorRegisterConfiguration.class, ColorImportSelector.class, ColorImportBeanDefinitionRegistrar.class})
public @interface EnableColor {
}
