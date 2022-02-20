package com.cydeo.streotype_annotation2;

import com.cydeo.stereotype_annotation.ConfigCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsiaStore {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigStore.class);
        context.getBean(BankOfAmerica.class).getPayment();
        context.getBean(ChaseBank.class).getPayment();
        context.getBean(CityBank.class).getPayment();




    }
}
