package com.designpattern.inventyfy.creational.abstractfactorypattern.factory.samsungfactory;

import com.designpattern.inventyfy.creational.abstractfactorypattern.AbstractMobileFactory;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.IMobileType;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.lenovofactory.LenovoFactory;

/**
 * Created by desaidr
 */

/**
 * Samsung factory implementation.
 *
 * This class is responsible to create {@link DeviceName#SMASUNG_S7} model.
 */
public class SamsungFactory extends AbstractMobileFactory {

    public enum DeviceName {
        SMASUNG_S7
    }

    public IMobileType cereateMobile(DeviceName deviceType) {
        IMobileType mobileType = null;
        switch (deviceType) {
            case SMASUNG_S7:
                mobileType = new SamsungS7();
        }
        return mobileType;
    }
}
