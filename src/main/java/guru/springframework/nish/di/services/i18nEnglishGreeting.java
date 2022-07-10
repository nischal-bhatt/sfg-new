package guru.springframework.nish.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world from english";
    }
}
