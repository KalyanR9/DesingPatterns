package com.designpattern.inventyfy.creational.facorypattern;

/**
 * Created by desaidr
 */

/**
 * Actual implementation of sub classes
 *
 * In this case we have implemented samsung type handsets behaviours.
 */
public class SamsungMobilePhone implements IMobileSpecification {

    @Override
    public boolean isGsm() {
        return true;
    }

    @Override
    public boolean isStereoSpeaker() {
        return false;
    }

    @Override
    public boolean isAmoledDsiaplay() {
        return true;
    }
}
