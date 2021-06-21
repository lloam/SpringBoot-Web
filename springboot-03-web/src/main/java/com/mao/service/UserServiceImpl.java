package com.mao.service;

import com.mao.mapper.UserMapper;
import com.mao.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUser(String username, String password) {
        return userMapper.queryUser(username,password);
    }
}
