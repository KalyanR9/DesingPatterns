package com.designpattern.inventyfy.creational.abstractfactorypattern;

import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.lenovofactory.LenovoFactory;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.samsungfactory.SamsungFactory;

/**
 * Created by desaidr
 */

/**
 * Abstract factory is like factory of factories.
 *
 * In Abstract factory pattern we get rid of if-else block like we have in
 * {@link com.designpattern.inventyfy.creational.facorypattern.MobileFactory}factory pattern and for each sub class
 * and then an abstract factory class that will return the sub-classes based on input factory class.
 *
 * IMPORTANT QUESTION : Why is this layer of abstract is useful?
 * -> Normal factory is used to create set of related objects. An abstract factory return factories.
 * Thus ans abstract factory is used to return factories that can be used to create set of related objects.
 *
 * Benefits :
 * <li>Provides approach to code for interface rather than implementation.</li>
 * <li>This is "factory of factories" and can be easily extended to accommodate more products.</li>
 * <li>Abstract factory pattern is robust and avoid conditional logic of factory pattern .</li>
 *
 * When to use this pattern?
 * Family of related product object is designed to be used together, and you need to enforce this
 * constraint.
 */
public class AbstractMobileFactory implements IAbstractMobileFactory {

    @Override
    public IAbstractMobileFactory createMobileFactory(final MobileFactoryConstant mobileType) {
        switch (mobileType) {
            case SAMSUNG:
                return new SamsungFactory();
            case LENOVO:
                return new LenovoFactory();
        }
        return null;
    }
}
