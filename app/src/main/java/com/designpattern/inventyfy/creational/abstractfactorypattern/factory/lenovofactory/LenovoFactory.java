package com.designpattern.inventyfy.creational.abstractfactorypattern.factory.lenovofactory;

import com.designpattern.inventyfy.creational.abstractfactorypattern.AbstractMobileFactory;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.IMobileType;

/**
 * Created by desaidr
 */

/**
 * Lenovo Factory implementation.
 *
 * This class is responsible to create {@link DeviceName#LENOVO_K8} model.
 */
public class LenovoFactory extends AbstractMobileFactory {

    public enum DeviceName {
        LENOVO_K8
    }

    public IMobileType cereateMobile(DeviceName deviceType) {
        IMobileType mobileType = null;
        switch (deviceType) {
            case LENOVO_K8:
                mobileType = new LenvoK8();
        }
        return mobileType;
    }
}
