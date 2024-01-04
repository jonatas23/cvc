package com.teste.cvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                title = "CVC API",
                version = "1.0.0",
                description = "API para consultar hotéis disponíveis",
                contact = @io.swagger.v3.oas.annotations.info.Contact(
                        name = "Jonatas Edward Dias de Oliveira",
                        email = "jonataseduard23@gmail.com")))
@SpringBootApplication
public class CvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CvcApplication.class, args);
    }

}
