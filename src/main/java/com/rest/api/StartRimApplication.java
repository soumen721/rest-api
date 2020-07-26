package com.rest.api;

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

}