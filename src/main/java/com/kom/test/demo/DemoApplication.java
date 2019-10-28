package com.kom.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        System.out.print("=========>>>>>>test----------->>>>>>");
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value = "test")
    public String getResponse(){
        return "this is a test demo!";
    }


}
