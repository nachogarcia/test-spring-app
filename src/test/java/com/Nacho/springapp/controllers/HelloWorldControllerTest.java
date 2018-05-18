package com.Nacho.springapp.controllers;

import com.Nacho.springapp.repositories.NameRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldControllerTest {

    @Mock
    private NameRepository nameRepository;

    @Test
    public void shouldGetHelloWorld() {
        given(nameRepository.name()).willReturn("Nacho");
        HelloWorldController controller = new HelloWorldController(nameRepository);

        String helloWorld = controller.helloWorld();

        assertThat(helloWorld).isEqualTo("Hello Nacho!");
    }
}