package com.Nacho.springapp.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class NameRepositoryTest {

    @Test
    public void shouldGetName(){
        NameRepository repository = new NameRepository();

        String name = repository.name();

        assertThat(name).isEqualTo("Nacho");
    }
}
