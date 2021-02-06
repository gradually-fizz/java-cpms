package tm.mes.cpms.controller.machine;

import tm.mes.cpms.annotation.SecurityParameter;
import tm.mes.cpms.dao.MachineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
