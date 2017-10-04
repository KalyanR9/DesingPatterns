package com.designpattern.inventyfy.creational.singleton;

import java.io.Serializable;

/**
 * Created by desaidr
 */

public class SingletonSerializeSafe implements Serializable {
    private static final String TAG = SingletonSerializeSafe.class.getSimpleName();

    private static SingletonSerializeSafe instance = new SingletonSerializeSafe();

    private SingletonSerializeSafe() {
    }

    public static SingletonSerializeSafe getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
