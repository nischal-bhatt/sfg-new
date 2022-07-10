package guru.springframework.nish.di.controllers;

import guru.springframework.nish.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();


    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}