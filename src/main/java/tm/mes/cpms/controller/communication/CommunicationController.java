package tm.mes.cpms.controller.communication;

import com.alibaba.fastjson.JSON;
import tm.mes.cpms.bean.Machine;
import tm.mes.cpms.dao.MachineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommunicationController {
    @Autowired
    MachineDao machineDao;

    @CrossOrigin
    @RequestMapping("/communication")
    public String getAllCommunicationInfo() {
        List<Machine> allMachineInfo = machineDao.getAllMachineInfo();
        String users_json = JSON.toJSONString(allMachineInfo);
        return users_json;
    }
    @RequestMapping("/communication/ooo")
    public String getCommunicationInfoByMachineId() {
        List<Machine> allMachineInfo = machineDao.getAllMachineInfo();
        String users_json = JSON.toJSONString(allMachineInfo);
        return users_json;
    }
}
