package com.cydeo.streotype_annotation2;

import org.springframework.stereotype.Component;

@Component
public class ChaseBank {
    public void getPayment(){
        System.out.println("Payment made from Chase Bank $"+200);
    }
}
