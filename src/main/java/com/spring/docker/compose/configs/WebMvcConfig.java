package com.spring.docker.compose.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.spring.docker.compose"})
public class WebMvcConfig implements WebMvcConfigurer {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/resources/static", "classpath:/resources/", "classpath:/resources/upload/",
            "classpath:/static/", "classpath:/public/", "classpath:/uploads/"
    };

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**", "/upload/**")
                .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }
}
