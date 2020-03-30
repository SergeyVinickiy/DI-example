package com.vinickiy.DIexample;

import com.vinickiy.DIexample.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DiExampleApplication.class, args);


		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("______________Primary been");
		System.out.println(myController.sayHello());

		System.out.println("___________________Property injector");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("___________________Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("my try: " + constructorInjectedController.getGreeting());

		System.out.println("___________________Setter Injector");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("Setter injector " + setterInjectedController.getGreeting());

		System.out.println("____________I18N controller");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());




	}

}
