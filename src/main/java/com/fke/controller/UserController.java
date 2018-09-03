package com.fke.controller;

import com.alibaba.fastjson.JSON;
import com.fke.pojo.User;
import com.fke.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class UserController {

    @Autowired
    @Qualifier(value = "userServiceImpl")
    IUserService iUserServiceImpl;
    @RequestMapping("getAllUser")
    public String getAllUser(){
        List<User> users = iUserServiceImpl.getAllUser();
        return JSON.toJSONString(users);
    }
}
