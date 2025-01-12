package com.usermanagement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.usermanagement.mapper") // asking for it not scan the mapper class
public class ZagSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZagSystemApplication.class, args);

    }
}
