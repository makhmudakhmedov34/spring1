package com.cydeo.auto_direct_wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBilling {

    @Bean
    BankOfAmerica bankOfAmerica(){
        BankOfAmerica bof = new BankOfAmerica();
        bof.setPaymentMethod(PaymentMethod.CHECKING_ACCOUNT);
    return bof;
    }

    //Direct Wiring
//    @Bean
//    PersonInfo personInfo(){
//        PersonInfo personInfo = new PersonInfo();
//        personInfo.setName("Makhmud Akhmedov");
//        personInfo.setBankOfAmerica(bankOfAmerica());
//        return personInfo;
//    }

    //Auto Wiring
    @Bean
    PersonInfo personInfo(BankOfAmerica bof){
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("Makhmud Akhmedov");
        personInfo.setBankOfAmerica(bof);
        return personInfo;
    }



}
