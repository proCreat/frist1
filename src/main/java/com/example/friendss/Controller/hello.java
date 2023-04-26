package com.example.friendss.Controller;

import com.example.friendss.Mapper.UserMapper;
import com.example.friendss.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@ResponseBody
@RequestMapping("/")
public class hello {

    @Autowired
    UserMapper userMapper;
   @PostMapping("a")
    public void h(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("....");

       String a1=request.getParameter("username");
       String b1=request.getParameter("password");
        log.info(a1+"  "+b1);
       User user = userMapper.h();
       String a= user.getUsername();
        String b = user.getPassword();
        log.info(a1+"  "+b1);
        if(a.equals(a1)){
            if(b.equals(b1)){
                response.getWriter().write("true");
            }else {
                response.getWriter().write("false");
            }
        }

    }
}
