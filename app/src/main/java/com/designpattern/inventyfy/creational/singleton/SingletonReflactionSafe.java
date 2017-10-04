package com.designpattern.inventyfy.creational.singleton;

import android.util.Log;

/**
 * Created by drupdesai
 */

public class SingletonReflactionSafe {

    private static final String TAG = SingletonReflactionSafe.class.getSimpleName();

    private static SingletonReflactionSafe instance = new SingletonReflactionSafe();

    /**
     * If someone tries to make an instance already exist.
     * <p>
     * Below code is to use create instance from private constructor.
     * <p>
     * Class classSingleton = Class.forName("com.designpattern.inventyfy.creational.singleton.SingletonReflactionSafe");
     * Constructor<SingletonReflactionSafe> constructor = classSingleton.getDeclaredConstructors();
     * constructor.setAccessible(true);
     * SingletonReflactionSafe singleton = constructor.newInstance();
     */
    private SingletonReflactionSafe() {
        Log.d(TAG, "Constructor Creation");
        if (instance != null) {
            throw new RuntimeException("Can not create a new instance please call getInstance()");
        }
    }

    public static SingletonReflactionSafe getInstance() {
        return instance;
    }
}
