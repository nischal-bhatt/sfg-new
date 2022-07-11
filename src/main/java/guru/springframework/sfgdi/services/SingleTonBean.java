package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingleTonBean {

    public SingleTonBean()
    {
        System.out.println("creating a singleton bean");
    }

     public String getMyScope()
     {
         return "Im a singleton";
     }
}
