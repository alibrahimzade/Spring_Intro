package com.example.lesson33.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public OpenAPI usersMicserviceOpenAPI(){
        return  new OpenAPI()
                .info(new Info().title("Person Crud")
                        .description("Person Api-crud")
                        .version("1.0"));
    }
}
