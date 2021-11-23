package com.project.novepus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class NovepusApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovepusApplication.class, args);
    }

}
