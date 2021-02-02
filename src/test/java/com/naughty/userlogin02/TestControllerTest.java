package com.naughty.userlogin02;

import com.naughty.userlogin02.bean.MainMenu;
import com.naughty.userlogin02.bean.User;
//import com.naughty.userlogin02.dao.MenuDao;
import com.naughty.userlogin02.dao.MenuDao;
import com.naughty.userlogin02.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestControllerTest {

    @Autowired
    UserDao userDao;
    @Autowired
    MenuDao menuDao;

    @Test
    void run() {
        int count = userDao.getUserByMassage("admin","123456");
        if(count>0)
            System.out.println("ok");
        else
            System.out.println("error");
    }

}
