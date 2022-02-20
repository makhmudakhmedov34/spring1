package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {
   // @Bean(name = "toyota")
    @Bean
    @Primary
    Car car(){
        Car c = new Car();
        c.setMake("Camry");
        return c;
    }

   // @Bean(name = "honda")
   @Bean
    Car car2(){
        Car c = new Car();
        c.setMake("Accord");
        return c;
    }
}
