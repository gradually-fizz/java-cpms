package com.naughty.userlogin02.controller.sport;

import com.alibaba.fastjson.JSON;
import com.naughty.userlogin02.annotation.SecurityParameter;
import com.naughty.userlogin02.bean.User;
import com.naughty.userlogin02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    UserDao userDao;


    @CrossOrigin
    @RequestMapping("/login")
    @SecurityParameter

    /*
    这个是针对前端请求是post，协带的contentType为application/x-www-form-urlencoded 而非 application/json 的

    具体信息请参考：
    https://blog.csdn.net/weixin_30907935/article/details/98812331
    @RequestBody
    public String userLogin(@RequestBody User user) {
    */
    public String userLogin(User user) {
        System.out.println("User : " + user);
        String str = "error";
        int count = userDao.getUserByMassage(user.getUsername(), user.getPassword());
        if (count > 0) {
            str = "ok";
        }
        return str;
    }
}
