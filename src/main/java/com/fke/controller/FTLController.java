package com.fke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLController {
    @RequestMapping("ftlIndex")
    public String ftlIndex(){
        return "ftlindex";
    }
}
