package com.vinickiy.DIexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES" , "default"})
@Service("I18nController")
public class I18NSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Spanish greeting";
    }
}
