package com.example.m5apirestpostgresql.config;

//URL: http://localhost:8080/swagger-ui/index.html

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    public static final String AUTHORIZATION_HEADER = "Authorization";
    

    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(new Info()
                .title("Spring OpenAPI")
                .version("1.0")
                .description("Spring doc para tema 15 Aplicando JWT"));
    }
}