package com.designpattern.inventyfy.creational.singleton;

/**
 * Created by desaidr
 */

/**
 * Singleton will work properly in multithreaded environment only if eager instantiation has been done in this case instance
 * creation will happen at the time of class loading only.
 *
 * But for lazy instantiation will have to take care for multiple things.
 */
public class SingletonMultithreaded {

    /**
     * Value of volatile variable will ber published only when the changed completes.
     * Change to write operation happens before read operation in volatile variable.
     *
     * In short all thread will see the same value of variable.
     */
    private static volatile SingletonMultithreaded instance;

    /**
     *  Single check instantiation
     *
     *  For multithreading below code might give uou different hashcode for instance.
     */
    public static SingletonMultithreaded getInstamceSimple() {
        if (instance == null) {
            instance = new SingletonMultithreaded();
        }
        return instance;
    }

    /**
     *  After applying synchronized keyword to method program will execute properly without any issue.
     *  But in JAVA instead of synchronized whole method we can synchronize only block of code which is affected
     *  while creating instance.
     *
     *  Disadvantage : If you synchronize the method and try to call it twice at the same time,
     *  one thread will have to wait first to complete return of callable thread.
     */
    public static synchronized SingletonMultithreaded getInstanceSyncronized() {
        if (instance == null) {
            instance = new SingletonMultithreaded();
        }
        return instance;
    }

    /**
     *  Below code is narrowed down the scope for synchronized for performance reason.
     *
     *  Disadvantage : If first thread at line #56 see the instance is null and then it gets the lock of object at line #57.
     *  At the same time if another thread already has the lock it will create an instance.
     */
    public static SingletonMultithreaded getInstanceSingleCheck() {
        if (instance == null) {
            synchronized (SingletonMultithreaded.class) {
                instance = new SingletonMultithreaded();
            }
        }
        return instance;
    }

    /**
     *  Below code is used to overcome above instantiation issue.
     *  Java runtime published half initialized variable.
     *
     *  Disadvantage : Suppose 2 thread thread1 and thread2 are entering into the code and it goes
     *  to the line #73 to #76 and created instance. At the same time thread2 enters and it knows that
     *  there is something in variable named as 'instance' (since it is at half initialized state) and it
     *  returns the same from line #83.
     *
     *  Prevention : Value of volatile variable will ber published only when the changed completes.
     *  Change to write operation happens before read operation in volatile variable.
     * @return
     */
    public static SingletonMultithreaded getInstanceDoubleCheck() {
        if (instance == null) {
            synchronized (SingletonMultithreaded.class) {
                if (instance == null) {
                    instance = new SingletonMultithreaded();
                }
            }
        }
        return instance;
    }
}
