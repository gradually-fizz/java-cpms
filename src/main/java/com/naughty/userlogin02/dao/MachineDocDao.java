package com.naughty.userlogin02.dao;

import com.naughty.userlogin02.bean.Machine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineDocDao {

    public List<Machine> getAllMachineInfo();
}
