package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/info")// http://localhost:9090/car/info?make=Camry&year=2015
    public String sarInfo(@RequestParam String make,@RequestParam Integer year, Model model){

        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }

    @RequestMapping("/info2")// http://localhost:9090/car/info?make=Camry&year=2015
    public String sarInfo2(@RequestParam(value = "make",required = false,defaultValue = "Tesla") String make, Model model){

        model.addAttribute("make",make);


        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}") //http://localhost:9090/car/info/honda/2015
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year,Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }
}
