package com.vinickiy.DIexample.controllers;

import com.vinickiy.DIexample.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        System.out.println("Hello world!");
        return greetingService.sayGreeting();
    }
}
