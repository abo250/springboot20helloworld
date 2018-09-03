package com.fke.controller;

import com.fke.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionCronller {
    private Logger logger = LoggerFactory.getLogger(ExceptionCronller.class);
    @RequestMapping("/getUser")
    public String getUser(int i) throws MyException {
        logger.info(String.valueOf(i));
        throw new MyException("error");
    }

    @RequestMapping("/getMemberExcetption")
    public String getMember(String name,Integer age){
        return "success";
    }
}
