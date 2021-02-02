package com.naughty.userlogin02.dao;

import com.alibaba.fastjson.JSON;
import com.naughty.userlogin02.bean.Machine;
import com.naughty.userlogin02.bean.MainMenu;
//import com.naughty.userlogin02.dao.MenuDao;
import com.naughty.userlogin02.dao.MenuDao;
import com.naughty.userlogin02.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MachineDaoTest {

    @Autowired
    MachineDao machineDao;

    @Test
    void getMachineInfo() {
        List<Machine> Machines = machineDao.getMachineInfo("","1",1,10);
        System.out.println(JSON.toJSONString(Machines));
    }
    @Test
    void getMachineInfoNumTest() {
        int number = machineDao.getMachineInfoNum("","");
        System.out.println(number);
    }
}
