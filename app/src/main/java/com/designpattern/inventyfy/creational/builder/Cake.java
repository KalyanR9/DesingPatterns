package com.designpattern.inventyfy.creational.builder;

import android.support.annotation.DrawableRes;
import android.text.TextUtils;

import com.designpattern.inventyfy.R;

/**
 * Created by desaidr
 *
 * This pattern is to separate the construction of complex object from its representation,
 * so same construction process can create different representation.
 *
 * Benefits :8
 * <li>This type of separation reduce the object size.</li>
 * <li>Adding new implementation becomes easier.</li>
 * <li>Object construction process becomes independent of the component that makes up the object.</li>
 * <li>You can have more control over the object construction process.</li>
 *
 * When to use this pattern?
 * <li>Algorithm for creating a complex object should be independent of the parts that make up the
 * object and how they are assembled.</li>
 * <li>Construction process must allow different representation for the object that is constructed.</li>
 */
public class Cake {

    private String cakeFlavour;
    private String cakeMessage;
    private String cakeTopping;
    private int cakeCandelCount;
    private String cakeColor;

    public Cake(final CakeBuilder builder) {
        this.cakeFlavour = builder.cakeFlavour;
        this.cakeMessage = builder.cakeMessage;
        this.cakeTopping = builder.cakeTopping;
        this.cakeCandelCount = builder.cakeCandleCount;
        this.cakeColor = builder.cakeColor;
    }

    /**
     * Currently we are checking only 3 option and returning specific cake image resource id.
     * <p>
     * But can have permutation and combination based on that we can decide which cake image needs
     * to be return.
     *
     * In static class setting property, we can use setter method as another options.
     * use case : Where client can provide mandatory fields to create object.
     * To create object with mandatory fields client need to invoke Builder constructor which takes
     * mandatory fields and then we need to call the set of required methods on it.
     */
    public static class CakeBuilder {

        private String cakeFlavour;
        private String cakeMessage;
        private String cakeTopping;
        private int cakeCandleCount;
        private String cakeColor;

        public CakeBuilder setCakeFlavour(String cakeFlavour) {
            this.cakeFlavour = cakeFlavour;
            return this;
        }

        public CakeBuilder setCakeMessage(String cakeMessage) {
            this.cakeMessage = cakeMessage;
            return this;
        }

        public CakeBuilder setCakeTopping(String cakeTopping) {
            this.cakeTopping = cakeTopping;
            return this;
        }

        public CakeBuilder setCakeCandleCount(int cakeCandleCount) {
            this.cakeCandleCount = cakeCandleCount;
            return this;
        }

        public CakeBuilder setCakeColor(String cakeColor) {
            this.cakeColor = cakeColor;
            return this;
        }

        public Cake buildCake() {
            return new Cake(this);
        }
    }

    public @DrawableRes
    int getCake() {
        if (!TextUtils.isEmpty(cakeTopping) && cakeTopping.equals("cherry")) {
            return R.drawable.cherry_cake;
        } else if (!TextUtils.isEmpty(cakeFlavour) && cakeFlavour.equals("chocolate")) {
            return R.drawable.choclate_cake_with_candel;
        } else if (!TextUtils.isEmpty(cakeMessage) && cakeMessage.equals("happy_birthday")) {
            return R.drawable.happy_birthday;
        } else {
            return R.drawable.choclate_cake_with_candel;
        }
    }
}
