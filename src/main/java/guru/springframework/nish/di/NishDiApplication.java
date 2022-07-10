package guru.springframework.nish.di;

import guru.springframework.nish.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NishDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(NishDiApplication.class, args);

		I18nController controller = (I18nController)ctx.getBean("i18nController");
		System.out.println(controller.sayHello());


		 MyController myController = (MyController)ctx.getBean("myController");


		System.out.println("---- primary bean");
		System.out.println(myController.sayHello());

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
