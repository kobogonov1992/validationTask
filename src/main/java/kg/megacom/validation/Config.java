package kg.megacom.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    @Size(max = 2)
    public List<PersonForm> getPersons(){
        return new  ArrayList<>();
    }
}