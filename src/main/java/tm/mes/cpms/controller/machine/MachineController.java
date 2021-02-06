package tm.mes.cpms.controller.machine;

import com.alibaba.fastjson.JSON;
import tm.mes.cpms.annotation.SecurityParameter;
import tm.mes.cpms.bean.Machine;
import tm.mes.cpms.bean.QueryMachineInfo;
import tm.mes.cpms.dao.MachineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MachineController {
    @Autowired
    MachineDao machineDao;

    @CrossOrigin
    @RequestMapping("/machineinfo")
    @SecurityParameter
    public String getMachineInfo(QueryMachineInfo queryMachineInfo) {
        List<Machine> MachineInfoList = machineDao.getMachineInfo(
                queryMachineInfo.getMachineId(),
                queryMachineInfo.getLineId(),
                (queryMachineInfo.getPageNum()-1) * queryMachineInfo.getPageSize(),
                queryMachineInfo.getPageSize());
        int numbers = machineDao.getMachineInfoNum(
                queryMachineInfo.getMachineId(),
                queryMachineInfo.getLineId());

        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",MachineInfoList);
        String res_JSON = JSON.toJSONString(res);
        return res_JSON;
    }
    @RequestMapping("/machine")
    @SecurityParameter
    public String getAllMachineInfo() {
        List<Machine> allMachineInfo = machineDao.getAllMachineInfo();
        String users_json = JSON.toJSONString(allMachineInfo);
        return users_json;
    }
    @RequestMapping("/machine/machineid")
    @SecurityParameter
    public String getMachineInfoByMachineId(String MachineId) {
        Machine machine = machineDao.getMachineInfoByMachineId(MachineId);
        String users_json = JSON.toJSONString(machine);
        return users_json;
    }
}
