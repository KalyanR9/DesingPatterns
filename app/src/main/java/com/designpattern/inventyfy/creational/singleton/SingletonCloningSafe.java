package com.designpattern.inventyfy.creational.singleton;

/**
 * Created by desaidr
 */

public class SingletonCloningSafe implements Cloneable {

    private static final String TAG = SingletonCloningSafe.class.getSimpleName();

    private static SingletonCloningSafe instance = new SingletonCloningSafe();

    private SingletonCloningSafe() {
    }

    public static SingletonCloningSafe getInstance() {
        return instance;
    }

    /**
     * Throw {@link CloneNotSupportedException#CloneNotSupportedException()} exception from {@link CloneNotSupportedException#clone()}
     * method if someone tries to make other instance of it.
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        if (instance != null) {
            throw new CloneNotSupportedException("message");
        }
        return super.clone();
    }
}
