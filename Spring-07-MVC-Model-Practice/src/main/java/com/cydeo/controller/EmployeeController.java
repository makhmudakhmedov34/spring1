package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
                            //localhost:9092/employee/new?firsName=Joe

    @RequestMapping("/new")
    public String getInfo(@RequestParam (required = false,defaultValue = "TEST") String firstName, Model model){

        System.out.println(firstName);
        model.addAttribute("fName",firstName);
        return "emp-register";
    }

    @RequestMapping("/add/{firstName}/{lastName}")
    public String getInfo2(@PathVariable String firstName,@PathVariable String lastName,Model model){
        model.addAttribute("fName",firstName);
        model.addAttribute("lName",lastName);
        return "emp-register.html";
    }

}
