package com.cydeo.dependecy_injection;

import com.cydeo.ConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepositInfo {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCalculation.class);
       BankOfAmerica bof = container.getBean(BankOfAmerica.class);
        bof.getAccountInfo();

    }
}
