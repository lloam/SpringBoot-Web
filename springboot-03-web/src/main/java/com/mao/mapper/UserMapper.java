package com.mao.mapper;

import com.mao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    //查询用户
    User queryUser(String username,String password);

}
