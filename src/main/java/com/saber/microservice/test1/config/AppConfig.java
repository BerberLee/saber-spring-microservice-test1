package com.saber.microservice.test1.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public MyRestTemplateCustomizer restTemplateCustomizer(){
        return new MyRestTemplateCustomizer();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.customizers(restTemplateCustomizer()).build();
    }
}
