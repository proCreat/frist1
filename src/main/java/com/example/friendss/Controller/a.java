package com.example.friendss.Controller;


import com.example.friendss.Mapper.UserMapper;
import com.example.friendss.pojo.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class a {

    @Autowired
    UserMapper userMapper;
    @RequestMapping("/h")
    public List<User> h(){
        List<User> user = userMapper.g();
        log.info("....");
        log.info(user.toString());
       return user;
    }
}
