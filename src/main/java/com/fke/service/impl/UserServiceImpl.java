package com.fke.service.impl;

import com.fke.mapper.UserMapper;
import com.fke.pojo.User;
import com.fke.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void inserUser(User user) {
        userMapper.insertUser();
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
