package com.example.clipmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//consumer
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.clipmaker")
public class ClipmakerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClipmakerServiceApplication.class, args);
    }

}
