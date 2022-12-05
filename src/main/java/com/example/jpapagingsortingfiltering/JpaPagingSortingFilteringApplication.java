package com.example.jpapagingsortingfiltering;

import jakarta.persistence.EntityManager;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaPagingSortingFilteringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaPagingSortingFilteringApplication.class, args);
    }

    @Bean
    public EntityManager entityManager() {
        return null;

    };

}
