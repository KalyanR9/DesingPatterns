package com.designpattern.inventyfy.utils;

import android.support.annotation.IntDef;

/**
 * Created by drupdesai
 */

public class Constants {

    public static final int CREATIONAL_SINGLETON_REFLACTION = 100;
    public static final int CREATIONAL_SINGLETON_CLONING = 101;
    public static final int CREATIONAL_SINGLETON_SERIALIZATION = 102;
    public static final int CREATIONAL_SINGLETON_MULTITHREADED = 103;
    public static final int CREATIONAL_SINGLETON_HOLDER = 104;
    public static final int CREATIONAL_SINGLETON_ENUM = 105;
    public static final int CREATIONAL_FACTORY = 106;
    public static final int CREATIONAL_ABSTRACT_FACTORY = 107;
    public static final int CREATIONAL_BUILDER = 108;
    public static final int CREATIONAL_PROTOTYPE = 109;

    @IntDef({
            CREATIONAL_SINGLETON_REFLACTION,
            CREATIONAL_SINGLETON_CLONING,
            CREATIONAL_SINGLETON_SERIALIZATION,
            CREATIONAL_SINGLETON_MULTITHREADED,
            CREATIONAL_SINGLETON_HOLDER,
            CREATIONAL_SINGLETON_ENUM,
            CREATIONAL_FACTORY,
            CREATIONAL_ABSTRACT_FACTORY,
            CREATIONAL_BUILDER,
            CREATIONAL_PROTOTYPE
    })
    public @interface CREATIONAL_PATTERN_TYPE {
    }

    /**
     * Activity/Fragment extra
     */
    public static final String EXTRA_DIALOG_TITLE = "dialog_title";
    public static final String EXTRA_FRAGMENT_TYPE = "fragment_type";
}
