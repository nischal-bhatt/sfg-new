package guru.springframework.nish.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class i18nSpanishGreeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hola munda from spanish";
    }
}
