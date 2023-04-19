package com.example.friendss.Controller;

import com.example.friendss.Mapper.UserMapper;
import com.example.friendss.pojo.User;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class hello {

    @Autowired
    UserMapper userMapper;
    @RequestMapping("hello")
    public User h(){
        log.info("....");
        User user = userMapper.g();
        return user;
    }
}
