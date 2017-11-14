package com.designpattern.inventyfy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.designpattern.inventyfy.creational.abstractfactorypattern.ui.AbstractFactoryPatternImplFragment;
import com.designpattern.inventyfy.creational.builder.ui.BuilderFactoryPatternFragment;
import com.designpattern.inventyfy.creational.facorypattern.ui.FactoryPatternImplFragment;
import com.designpattern.inventyfy.creational.prototype.ui.PrototypePatternFragment;
import com.designpattern.inventyfy.structural.adapter.ui.AdapterFactoryFragment;
import com.designpattern.inventyfy.utils.Constants;

/**
 * Created by desaidr
 */

public class ActivityFragmentHolder extends AppCompatActivity {

    private int screenType;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        screenType = getIntent().getIntExtra(Constants.EXTRA_FRAGMENT_TYPE, 0);

        decideWhichScreenToLaunch();
    }

    private void decideWhichScreenToLaunch() {
        if (screenType <= 0) {
            return;
        }

        switch (screenType) {
            /**
             * Creational Fragments
             */
            case Constants.CREATIONAL_FACTORY:
                launchFragment(FactoryPatternImplFragment.getInstance());
                break;
            case Constants.CREATIONAL_ABSTRACT_FACTORY:
                launchFragment(AbstractFactoryPatternImplFragment.getInstance());
                break;
            case Constants.CREATIONAL_BUILDER:
                launchFragment(BuilderFactoryPatternFragment.getInstance());
                break;
            case Constants.CREATIONAL_PROTOTYPE:
                launchFragment(PrototypePatternFragment.getInstance());
                break;
            /**
             * Structural Fragments
             */
            case Constants.STRUCTURAL_ADAPTER_PATTERN:
                launchFragment(AdapterFactoryFragment.getInstance());
                break;
        }
    }

    private void launchFragment(final Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment,
                fragment.getClass().getSimpleName()).commit();
    }
}
