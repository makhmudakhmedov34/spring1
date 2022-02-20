package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Function;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,
                ConfigAny.class,CarConfig.class);
       FullTimeMentor ft = container.getBean(FullTimeMentor.class);
       ft.createAccount();

      // PartTimeMentor pt = container.getBean("p2",PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);


      String string =  container.getBean(String.class);
        System.out.println(string);
      // Car newCar1 = container.getBean("toyota",Car.class);
        Car newCar1 = container.getBean(Car.class);

        System.out.println("newCar.getMake() = " + newCar1.getMake());

        //Car newCar2 = container.getBean("honda",Car.class);

        Car newCar2 = container.getBean(Car.class);

        System.out.println("newCar2.getMake() = " + newCar2.getMake());

    }
}
