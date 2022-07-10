package guru.springframework.nish.di;

import guru.springframework.nish.di.controllers.ConstructorInjectedController;
import guru.springframework.nish.di.controllers.MyController;
import guru.springframework.nish.di.controllers.PropertyInjectedController;
import guru.springframework.nish.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NishDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(NishDiApplication.class, args);

		 MyController myController = (MyController)ctx.getBean("myController");

	     String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("---- property");

		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController)ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- setter");
		SetterInjectedController setterInjectedcontroller =
				(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedcontroller.getGreeting());

		System.out.println("----- constructor");

		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
