package com.designpattern.inventyfy.creational.facorypattern;

/**
 * Created by desaidr
 */

/**
 * Actual implementation of sub classes
 *
 * In this case we have implemented motorola type handsets behaviours.
 */
public class MotorolaMobilePhone implements IMobileSpecification {

    @Override
    public boolean isGsm() {
        return true;
    }

    @Override
    public boolean isStereoSpeaker() {
        return true;
    }

    @Override
    public boolean isAmoledDsiaplay() {
        return false;
    }
}
