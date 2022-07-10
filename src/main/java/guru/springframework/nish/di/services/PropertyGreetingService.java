package guru.springframework.nish.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "hello world - property";
    }
}
