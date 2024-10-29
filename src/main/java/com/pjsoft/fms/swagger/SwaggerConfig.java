package com.pjsoft.fms.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean  // Indicates that this method produces a bean to be managed by the Spring container
    public OpenAPI customOpenAPI() {  // Method that returns an OpenAPI bean
        return new OpenAPI()  // Creating a new OpenAPI instance
                .info(new Info()  // Setting up API information
                        .title("Flight Management System API")  // Title of the API
                        .version("1.0")  // Version of the API
                        .description("API documentation for the Flight Management System"));  // Description of the API
    }
}
