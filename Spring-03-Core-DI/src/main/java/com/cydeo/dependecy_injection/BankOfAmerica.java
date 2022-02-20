package com.cydeo.dependecy_injection;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BankOfAmerica {
    // Field Injection
//    @Autowired
//    Deposit deposit;

    //constructor injection
    Deposit deposit;
  //  @Autowired
//    public BankOfAmerica(Deposit deposit){
//        this.deposit = deposit;
//    }

    public void getAccountInfo(){
        System.out.println("On your checking account :"+(200+deposit.getDeposit()));
    }
}
