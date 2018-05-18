package com.Nacho.springapp;

import com.Nacho.springapp.repositories.NameRepository;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class SpringConfiguration {

    @Bean
    public NameRepository nameRepository() {
        return new NameRepository();
    }
}
