package com.fke.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCronller {
    @RequestMapping("index")
    public String index(){
        return "spring 2.0 index 测试";
    }
}
