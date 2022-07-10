package guru.springframework.nish.di.controllers;

import guru.springframework.nish.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingservice;

    public ConstructorInjectedController(GreetingService greetingservice) {
        this.greetingservice = greetingservice;
    }

    public String getGreeting()
    {
        return greetingservice.sayGreeting();
    }
}
