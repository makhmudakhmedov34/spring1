package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Toyota");
        return c;
    }
}
