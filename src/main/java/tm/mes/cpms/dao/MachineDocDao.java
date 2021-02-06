package tm.mes.cpms.dao;

import tm.mes.cpms.bean.Machine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineDocDao {

    public List<Machine> getAllMachineInfo();
}
