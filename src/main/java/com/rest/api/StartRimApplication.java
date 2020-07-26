package com.rest.api;

import com.rest.api.repository.RimRepository_alt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class StartRimApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartRimApplication.class, args);
    }

    // run this only on profile 'demo', avoid run this in test
    @Profile("demo")
    @Bean
    CommandLineRunner initDatabase(RimRepository_alt repository) {
        return args -> {
            //repository.save(new RimDetails(1L, "Tata", 1231223123L));
            //repository.save(new RimDetails(2L, "Suzuki", 1234422123L));
            //repository.save(new RimDetails(3L, "Martin Fowler", 123123223L));
        };
    }
}