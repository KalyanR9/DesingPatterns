package com.designpattern.inventyfy.creational.abstractfactorypattern.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.creational.abstractfactorypattern.AbstractMobileFactory;
import com.designpattern.inventyfy.creational.abstractfactorypattern.IAbstractMobileFactory;
import com.designpattern.inventyfy.creational.abstractfactorypattern.MobileFactoryConstant;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.IMobileType;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.lenovofactory.LenovoFactory;
import com.designpattern.inventyfy.creational.abstractfactorypattern.factory.samsungfactory.SamsungFactory;
import com.designpattern.inventyfy.utils.UiUtils;

import static com.designpattern.inventyfy.utils.LinkConstants.ABSTRACT_FACTORY_PATTERN;
import static com.designpattern.inventyfy.utils.LinkConstants.SINGLETON_ENUM_CLASS;

/**
 * Created by desaidr
 */

public class AbstractFactoryPatternImplFragment extends Fragment implements View.OnClickListener {

    private IAbstractMobileFactory abstractMobileFactory;
    private Button lenovo;
    private Button samsung;
    private TextView resultText;
    private TextView sourceCodeLink;

    public static AbstractFactoryPatternImplFragment getInstance() {
        final AbstractFactoryPatternImplFragment abstractFactoryPatternImplFragment = new AbstractFactoryPatternImplFragment();
        return abstractFactoryPatternImplFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        abstractMobileFactory = new AbstractMobileFactory();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_abstract_factory_pattern, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lenovo = view.findViewById(R.id.btn_lenovo);
        lenovo.setOnClickListener(this);
        samsung = view.findViewById(R.id.btn_samsung);
        samsung.setOnClickListener(this);

        resultText = view.findViewById(R.id.txt_final_result);

        sourceCodeLink = view.findViewById(R.id.txt_source_link);
        sourceCodeLink.setMovementMethod(LinkMovementMethod.getInstance());
        sourceCodeLink.setText(UiUtils.getLinkSpannableString(getString(R.string.lbl_source_code_link),
                ABSTRACT_FACTORY_PATTERN));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_samsung:
                final SamsungFactory samsungFactory = (SamsungFactory) abstractMobileFactory
                        .createMobileFactory(MobileFactoryConstant.SAMSUNG);
                updateDeviceInformation(samsungFactory.cereateMobile(SamsungFactory.DeviceName.SMASUNG_S7));
                break;
            case R.id.btn_lenovo:
                final LenovoFactory lenovoFactory = (LenovoFactory) abstractMobileFactory
                        .createMobileFactory(MobileFactoryConstant.LENOVO);
                updateDeviceInformation(lenovoFactory.cereateMobile(LenovoFactory.DeviceName.LENOVO_K8));
                break;
        }
    }

    private void updateDeviceInformation(final IMobileType mobileType) {
        resultText.setText(getString(R.string.lbl_screen_resolution_text, mobileType.getDeviceName(), mobileType.screenResolution()));
    }
}
