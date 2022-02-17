package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Function;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);
       FullTimeMentor ft = container.getBean(FullTimeMentor.class);
       ft.createAccount();

      String string =  container.getBean(String.class);
        System.out.println(string);


    }
}
