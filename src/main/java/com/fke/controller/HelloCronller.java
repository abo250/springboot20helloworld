package com.fke.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCronller {
    @Value("${star_name}")
    private String name;
    @RequestMapping("hello")
    public String sayHello(){
        return "SpringBoot say hello to " +name;
    }
}
