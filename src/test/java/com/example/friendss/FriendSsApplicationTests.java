package com.example.friendss;

import com.example.friendss.Mapper.UserMapper;
import com.example.friendss.pojo.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class FriendSsApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
       // User user=userMapper.g();
       // System.out.println(user);
        User user1=userMapper.h();
        System.out.println(user1);
    }

}
