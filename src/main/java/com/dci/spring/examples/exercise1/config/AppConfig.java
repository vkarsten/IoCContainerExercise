package com.dci.spring.examples.exercise1.config;

import com.dci.spring.examples.exercise1.dog.factory.DogFactory;
import com.dci.spring.examples.exercise1.dog.factory.impl.DogFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DogFactory dogFactory() { return new DogFactoryImpl(); }

}
