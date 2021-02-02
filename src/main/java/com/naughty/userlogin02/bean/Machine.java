package com.naughty.userlogin02.bean;

public class Machine {
    private String machineId;
    private String lineId;
    private String operation;
    private String state;
    private String capability;
    private String upMachineId;
    private String downMachineId;

    public Machine() {
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public void setUpMachineId(String upMachineId) {
        this.upMachineId = upMachineId;
    }

    public void setDownMachineId(String downMachineId) {
        this.downMachineId = downMachineId;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getLineId() {
        return lineId;
    }

    public String getOperation() {
        return operation;
    }

    public String getState() {
        return state;
    }

    public String getCapability() {
        return capability;
    }

    public String getUpMachineId() {
        return upMachineId;
    }

    public String getDownMachineId() {
        return downMachineId;
    }
}
