package com.designpattern.inventyfy.creational.prototype;

/**
 * Created by desaidr
 */

/**
 * Prototype pattern is used when the Object creation is a costly affair and requires a lot of time
 * and resources and you have a similar object already existing.
 *
 * Pattern provides a mechanism to copy the original object to the new object and then modify it
 * accordingly.
 *
 * This design pattern mandates that the object which you are copying should provide the copying feature.
 * It should not be done by any other class. However whether to use <b>shallow</b> or <b>deep</b> copy
 * of the object properties depends on the requirements and its design decision.
 *
 * When to use?
 * <li>When the classes to instantiate are specified at run time. i.e by dynamic loading.</li>
 * <li>To avoid building a class hierarchy of factories that parallel the class hierarchy of products.</li>
 * <li>When instance of a class can have one of only a few different combination of state.
 * It may be more convenient to install a corresponding number of prototypes and clone them rather than
 * instantiating the class manually, each time with appropriate state.</li>
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
