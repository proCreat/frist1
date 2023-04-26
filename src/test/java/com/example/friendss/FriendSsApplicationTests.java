package com.example.friendss;

import com.example.friendss.Mapper.LearnMapper;
import com.example.friendss.Mapper.UserMapper;
import com.example.friendss.pojo.Learn;
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
    @Autowired
    LearnMapper learnMapper;
    @Test
    void contextLoads() {
        User user=userMapper.h();
        System.out.println(user);
        Learn user1=learnMapper.all();
        System.out.println(user1);
    }

}
