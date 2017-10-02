package com.designpattern.inventyfy.creational.singleton;

import android.util.Log;

/**
 * Created by drupdesai
 */

public class SingletonReflaction {

    private static final String TAG = SingletonReflaction.class.getSimpleName();

    private static SingletonReflaction instance = new SingletonReflaction();

    /**
     * If someone tries to make an instance already exist.
     * <p>
     * Below code is to use create instance from private constructor.
     * <p>
     * Class classSingleton = Class.forName("com.designpattern.inventyfy.creational.singleton.SingletonReflaction");
     * Constructor<SingletonReflaction> constructor = classSingleton.getDeclaredConstructors();
     * constructor.setAccessible(true);
     * SingletonReflaction singleton = constructor.newInstance();
     */
    private SingletonReflaction() {
        Log.d(TAG, "Constructor Creation");
        if (instance != null) {
            throw new RuntimeException("Can not create a new instance please call getInstance()");
        }
    }

    public static SingletonReflaction getInstance() {
        return instance;
    }
}
