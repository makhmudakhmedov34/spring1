package com.cydeo.auto_direct_wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BillingPayments {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigBilling.class);
        BankOfAmerica bof = container.getBean(BankOfAmerica.class);
        PersonInfo personInfo = container.getBean(PersonInfo.class);
        System.out.println("bof.getPaymentMethod() = " + bof.getPaymentMethod());
        System.out.println("personInfo.getName() = " + personInfo.getName());
        System.out.println("personInfo.getBankOfAmerica().getPaymentMethod() = " + personInfo.getBankOfAmerica().getPaymentMethod());

    }
}