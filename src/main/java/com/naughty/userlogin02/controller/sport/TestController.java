package com.naughty.userlogin02.controller.sport;

import com.alibaba.fastjson.JSON;
import com.naughty.userlogin02.bean.User;
import com.naughty.userlogin02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserDao userDao;

    @CrossOrigin()
    @RequestMapping("/test")
    public String test() {
        String str = "error";
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");

        int count = userDao.getUserByMassage(user.getUsername(), user.getPassword());
//        int count = userDao.getUserByMassage("admin", "123456");
        if (count > 0) {
            str = "ok";
        }
        return str;
    }
}
