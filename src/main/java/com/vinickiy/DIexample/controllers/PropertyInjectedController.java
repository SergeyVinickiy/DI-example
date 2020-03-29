package com.vinickiy.DIexample.controllers;

import com.vinickiy.DIexample.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
