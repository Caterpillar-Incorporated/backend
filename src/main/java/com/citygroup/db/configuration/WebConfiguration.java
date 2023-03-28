package com.citygroup.db.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Value("${app.requesting-services}")
    String frontendCors;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/tracking-data").allowedOrigins(frontendCors.split(","));
    }
}
