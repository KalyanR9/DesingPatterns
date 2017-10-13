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

    public static final int STRUCTURAL_ADAPTER_PATTERN = 200;
    public static final int STRUCTURAL_COMPOSITE_PATTERN = 201;
    public static final int STRUCTURAL_PROXY_PATTERN = 202;
    public static final int STRUCTURAL_FLYWEIGHT_PATTERN = 203;
    public static final int STRUCTURAL_FACADE_PATTERN = 204;
    public static final int STRUCTURAL_BRIDGE_PATTERN = 205;
    public static final int STRUCTURAL_DECORATOR_PATTERN = 206;

    @IntDef({
            STRUCTURAL_ADAPTER_PATTERN,
            STRUCTURAL_COMPOSITE_PATTERN,
            STRUCTURAL_PROXY_PATTERN,
            STRUCTURAL_FLYWEIGHT_PATTERN,
            STRUCTURAL_FACADE_PATTERN,
            STRUCTURAL_BRIDGE_PATTERN,
            STRUCTURAL_DECORATOR_PATTERN
    })
    public @interface STRUCTURAL_DESIGN_PATTERN {
    }

    public static final int BEHAVIORAL_TEMPLATE_METHOD_PATTERN = 300;
    public static final int BEHAVIORAL_MEDIATOR_PATTERN = 301;
    public static final int BEHAVIORAL_CHAIN_OF_RESPONSIBILITY_PATTERN = 302;
    public static final int BEHAVIORAL_OBSERVER_PATTERN = 303;
    public static final int BEHAVIORAL_STRATEGY_PATTERN = 304;
    public static final int BEHAVIORAL_COMMAND_PATTERN = 305;
    public static final int BEHAVIORAL_STATE_PATTERN = 306;
    public static final int BEHAVIORAL_VISITOR_PATTERN = 307;
    public static final int BEHAVIORAL_INTERATOR_PATTERN = 308;
    public static final int BEHAVIORAL_INTERPRETER_PATTERN = 309;
    public static final int BEHAVIORAL_MEMENTO_PATTERN = 310;

    @IntDef({
            BEHAVIORAL_TEMPLATE_METHOD_PATTERN,
            BEHAVIORAL_MEDIATOR_PATTERN,
            BEHAVIORAL_CHAIN_OF_RESPONSIBILITY_PATTERN,
            BEHAVIORAL_OBSERVER_PATTERN,
            BEHAVIORAL_STRATEGY_PATTERN,
            BEHAVIORAL_COMMAND_PATTERN,
            BEHAVIORAL_STATE_PATTERN,
            BEHAVIORAL_VISITOR_PATTERN,
            BEHAVIORAL_INTERATOR_PATTERN,
            BEHAVIORAL_INTERPRETER_PATTERN,
            BEHAVIORAL_MEMENTO_PATTERN
    })
    public @interface BEHAVIORAL_DESIGN_PATTERN {
    }
    /**
     * Activity/Fragment extra
     */
    public static final String EXTRA_DIALOG_TITLE = "dialog_title";
    public static final String EXTRA_FRAGMENT_TYPE = "fragment_type";
}
