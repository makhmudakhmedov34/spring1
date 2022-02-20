package com.cydeo.streotype_annotation2;

import org.springframework.stereotype.Component;

@Component
public class BankOfAmerica {
    public void getPayment(){
        System.out.println("Payment made from Bank of America $"+250);
    }
}
