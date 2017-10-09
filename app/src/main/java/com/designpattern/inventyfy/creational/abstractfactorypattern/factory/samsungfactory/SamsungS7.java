package com.designpattern.inventyfy.creational.abstractfactorypattern.factory.samsungfactory;

import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.IMobileType;

/**
 * Created by desaidr
 */

public class SamsungS7 implements IMobileType {
    @Override
    public String screenResolution() {
        return "1440 x 2560";
    }

    @Override
    public String getDeviceName() {
        return "Galaxy S7";
    }
}
