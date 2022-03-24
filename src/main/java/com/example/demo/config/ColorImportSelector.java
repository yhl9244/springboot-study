package com.example.demo.config;

import com.example.demo.po.Blue;
import com.example.demo.po.Green;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ColorImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Blue.class.getName(), Green.class.getName()};
    }
}
