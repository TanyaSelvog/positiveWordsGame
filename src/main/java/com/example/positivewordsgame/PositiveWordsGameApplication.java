package com.example.positivewordsgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController


@SpringBootApplication
public class PositiveWordsGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(PositiveWordsGameApplication.class, args);
    }

    //Below is from SpringBoot tutorial - just for use as reference
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }


}
