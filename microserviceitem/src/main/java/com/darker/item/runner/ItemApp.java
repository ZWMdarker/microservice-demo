package com.darker.item.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.darker.item.service","com.darker.item.controller"})
public class ItemApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class, args);
    }
}
