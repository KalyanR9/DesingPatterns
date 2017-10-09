package com.designpattern.inventyfy.creational.abstractfactorypattern;

/**
 * Created by desaidr
 */

/**
 * Common interface that can be used to create final product object based on received factory.
 */
public interface IAbstractMobileFactory {
    IAbstractMobileFactory createMobileFactory(final MobileFactoryConstant factoryType);
}
