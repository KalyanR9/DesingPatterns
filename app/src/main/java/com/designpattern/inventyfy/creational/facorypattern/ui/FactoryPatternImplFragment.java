package com.designpattern.inventyfy.creational.facorypattern.ui;

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
import com.designpattern.inventyfy.creational.facorypattern.IMobileSpecification;
import com.designpattern.inventyfy.creational.facorypattern.MobileFactory;
import com.designpattern.inventyfy.utils.UiUtils;

import static com.designpattern.inventyfy.utils.LinkConstants.SINGLETON_ENUM_CLASS;

/**
 * Created by desaidr
 */

public class FactoryPatternImplFragment extends Fragment implements View.OnClickListener {

    public static FactoryPatternImplFragment getInstance() {
        final FactoryPatternImplFragment factoryPatternImplFragment = new FactoryPatternImplFragment();
        return factoryPatternImplFragment;
    }

    private Button motorola;
    private Button samsung;
    private TextView resultText;
    private TextView sourceCodeLink;

    private MobileFactory mobileFactory;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mobileFactory = new MobileFactory();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_factory_pattern, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        motorola = view.findViewById(R.id.btn_motorola);
        motorola.setOnClickListener(this);
        samsung = view.findViewById(R.id.btn_samsung);
        samsung.setOnClickListener(this);
        resultText = view.findViewById(R.id.txt_final_result);

        sourceCodeLink = view.findViewById(R.id.txt_source_link);
        sourceCodeLink.setMovementMethod(LinkMovementMethod.getInstance());
        sourceCodeLink.setText(UiUtils.getLinkSpannableString(getString(R.string.lbl_source_code_link),
                SINGLETON_ENUM_CLASS));
    }

    @Override
    public void onClick(View view) {
        IMobileSpecification mobileSpecification;
        if (R.id.btn_motorola == view.getId()) {
            mobileSpecification = mobileFactory.createMobileSpecification("Motorola");
            resultText.setText(getString(R.string.lbl_result_text, mobileSpecification.isGsm(),
                    mobileSpecification.isStereoSpeaker(), mobileSpecification.isAmoledDsiaplay()));
        } else if (R.id.btn_samsung == view.getId()) {
            mobileSpecification = mobileFactory.createMobileSpecification("Samsung");
            resultText.setText(getString(R.string.lbl_result_text, mobileSpecification.isGsm(),
                    mobileSpecification.isStereoSpeaker(), mobileSpecification.isAmoledDsiaplay()));
        }
    }
}
