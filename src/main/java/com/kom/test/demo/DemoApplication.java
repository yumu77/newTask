package com.kom.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.print("=========>>>>>>test----------->>>>>>");
        SpringApplication.run(DemoApplication.class, args);
    }

}
