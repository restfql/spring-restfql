package com.restfql.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestFQLConfiguration {

    public RestFQLConfiguration(){
        System.out.println("Loading the configuration RestFQLConfiguration");
    }

    @Bean
    public RestFQLAdvice RestFQLAdvice() { return new RestFQLAdvice(); }


}

