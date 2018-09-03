package com.fke.app;

import com.fke.controller.HelloCronller;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = "com.fke.*")
@EnableAsync
@MapperScan(basePackages = "com.fke.*")
public class App {
    public static void main(String[] args) {
            SpringApplication.run(App.class,args);
    }
}
