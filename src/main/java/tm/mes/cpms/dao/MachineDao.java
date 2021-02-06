package tm.mes.cpms.dao;

import tm.mes.cpms.bean.Machine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineDao {

    public List<Machine> getAllMachineInfo();
    public List<Machine> getMachineInfo(String machineId,String lineId,int pageStart,int pageSize);
    public Machine getMachineInfoByMachineId(String machineId);
    public int getMachineInfoNum(String machineId,String lineId);
    public int addMachineInfo(Machine machine);
    public int deleteMachineInfoByMachineId(String machineId);
    public int updateState(String machineId,String State);
}
