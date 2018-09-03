package com.fke.mapper;

import com.fke.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserMapper {
    int insertUser();
    List<User> getAllUser();
}
