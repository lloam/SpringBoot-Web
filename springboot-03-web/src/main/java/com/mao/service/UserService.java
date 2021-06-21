package com.mao.service;

import com.mao.pojo.User;

public interface UserService {

    //查询用户
    User queryUser(String username,String password);
}
