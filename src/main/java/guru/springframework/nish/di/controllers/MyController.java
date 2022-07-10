package guru.springframework.nish.di.controllers;

import guru.springframework.nish.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {


        return this.greetingService.sayGreeting();
    }
}
