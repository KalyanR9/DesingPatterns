package com.designpattern.inventyfy.creational.prototype;

/**
 * Created by desaidr
 */

public class SamsungDevice implements Cloneable {

    private String deviceName;
    private String deviceScreenResolution;
    private String processorType;
    private int ramCount;

    public SamsungDevice() {
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceScreenResolution() {
        return deviceScreenResolution;
    }

    public void setDeviceScreenResolution(String deviceScreenResolution) {
        this.deviceScreenResolution = deviceScreenResolution;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getRamCount() {
        return ramCount;
    }

    public void setRamCount(int ramCount) {
        this.ramCount = ramCount;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
