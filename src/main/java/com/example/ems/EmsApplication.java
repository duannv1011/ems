package com.example.ems;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class EmsApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(EmsApplication.class, args);
    }

}
