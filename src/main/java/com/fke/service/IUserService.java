package com.fke.service;

import com.fke.pojo.User;

import java.util.List;

public interface IUserService {
     void inserUser(User user);
     List<User> getAllUser();
}
