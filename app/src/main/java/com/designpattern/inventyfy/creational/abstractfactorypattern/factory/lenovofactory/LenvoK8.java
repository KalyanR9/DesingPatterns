package com.designpattern.inventyfy.creational.abstractfactorypattern.factory.lenovofactory;

import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.IMobileType;

/**
 * Created by desaidr
 */

public class LenvoK8 implements IMobileType {

    @Override
    public String screenResolution() {
        return "720 x 1080";
    }

    @Override
    public String getDeviceName() {
        return "Lenovo K8 Note";
    }
}
