package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {


    // Field Injection
//    @Autowired
//    OfficeHours OfficeHours;


    //constructor Injection
   //@Autowired
//    public Java(com.cydeo.OfficeHours officeHours) {
//        OfficeHours = officeHours;
//    }

    OfficeHours OfficeHours;

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : "+(20 +OfficeHours.getHours()));
    }
}
