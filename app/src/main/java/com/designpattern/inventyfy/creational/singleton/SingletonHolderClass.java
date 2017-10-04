package com.designpattern.inventyfy.creational.singleton;

/**
 * Created by desaidr
 */

/**
 * (Bill Pugh Method) He has come up with a different approach to create the singleton class using
 *  inner static helper class.
 */
public class SingletonHolderClass {

    private SingletonHolderClass() {
    }

    /**
     * Inner static class that contains instance of singleton class When singleton class is loaded
     * Holder class is not loaded into memory only when someone call {@link SingletonHolderClass#getInstance()}
     * this class get loaded and created the singleton instance.
     */
    static class Holder {
        static final SingletonHolderClass instance = new SingletonHolderClass();
    }

    public static SingletonHolderClass getInstance() {
        return Holder.instance;
    }
}
