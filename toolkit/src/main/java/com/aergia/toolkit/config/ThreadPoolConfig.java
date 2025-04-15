package com.aergia.toolkit.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "threadpool")
public class ThreadPoolConfig {
    @Value("size")
    private String size;

    @Bean
    public Executor executor(){
        Executor executor = Executors.newFixedThreadPool(Integer.parseInt(size));
        return executor;
    }
}
