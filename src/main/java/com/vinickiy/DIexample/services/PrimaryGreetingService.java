package com.vinickiy.DIexample.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Primary
@Controller
public class PrimaryGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello world Primary been";
    }
}
