package com.Nacho.springapp.controllers;

import com.Nacho.springapp.repositories.NameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloWorld")
public class HelloWorldController {
    private final NameRepository nameRepository;

    public HelloWorldController(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    @GetMapping
    public String helloWorld() {
        return "Hello " + nameRepository.name() + "!";
    }
}
