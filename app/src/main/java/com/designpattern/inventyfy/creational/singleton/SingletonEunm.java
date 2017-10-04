package com.designpattern.inventyfy.creational.singleton;

/**
 * Created by desaidr
 */

/**
 * In enum java ensure that any enum value instantiated only ones. And enum values are globally
 * accessible so is the singleton.
 *
 * Enum singleton doesn't violate principle of singleton in any case.
 *
 * Disadvantage : Enum type is somewhat inflexible. It does not allow lazy initialization.
 */
public enum SingletonEunm {

    INSTANCE;

    public void doSomethong() {
        //Do Something
    }
}
