package com.designpattern.inventyfy.creational.facorypattern;

/**
 * Created by desaidr
 */

/**
 *  This pattern is used when we have a super class with multiple sub-classes and based on input,
 *  we need to return one of the sub-classes.
 *
 *  This pattern takes out the responsibility to instantiate of a class from client program to factory class.
 *
 *  Benefits :
 *  <li>provides approach to code for interface rather than implementation.</li>
 *  <li>Removes the instantiation of the actual implementation of a class from client.
 *      Making it more robust, less coupled and easy to extend.</li>
 *  <li>Factory Pattern provides abstraction between implementation and client classes through inheritance.</li>
 */
public class MobileFactory {

    public MobileFactory() {
    }

    public IMobileSpecification createMobileSpecification(final String type) {
        IMobileSpecification mobileSpecification = null;
        switch (type) {
            case "Motorola":
                mobileSpecification = new MotorolaMobilePhone();
                break;
            case "Samsung":
                mobileSpecification = new SamsungMobilePhone();
                break;
        }
        return mobileSpecification;
    }
}
