package com.naughty.userlogin02.controller.machine;

import com.alibaba.fastjson.JSON;
import com.naughty.userlogin02.annotation.SecurityParameter;
import com.naughty.userlogin02.bean.Machine;
import com.naughty.userlogin02.dao.MachineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MachineDocController {
    @Autowired
    MachineDao machineDao;

    @CrossOrigin
    @RequestMapping("/machineDoc/upload")
    @SecurityParameter
    public String uploadDoc() {
        return "";
    }
    @RequestMapping("/machineDoc/delete")
    @SecurityParameter
    public String deleteDoc() {
        return "";
    }
}
