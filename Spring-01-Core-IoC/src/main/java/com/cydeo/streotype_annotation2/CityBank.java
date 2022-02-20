package com.cydeo.streotype_annotation2;

import org.springframework.stereotype.Component;

@Component
public class CityBank {
    public void getPayment(){
        System.out.println("Payment made from City Bank $"+200);
    }
}
