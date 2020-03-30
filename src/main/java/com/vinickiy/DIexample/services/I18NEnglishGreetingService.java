package com.vinickiy.DIexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nController")
public class I18NEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "English Greeting";
    }
}
