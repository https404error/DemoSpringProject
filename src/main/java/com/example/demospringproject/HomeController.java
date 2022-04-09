package com.example.demospringproject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Value returned";
    }

    @RequestMapping("/barsik")
    public String barsik() {
        return "Barsik is alive! We got him!";
    }

}