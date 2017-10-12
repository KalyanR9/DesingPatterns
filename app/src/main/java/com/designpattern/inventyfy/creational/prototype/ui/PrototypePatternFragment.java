package com.designpattern.inventyfy.creational.prototype.ui;

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
import com.designpattern.inventyfy.creational.prototype.SamsungDevice;
import com.designpattern.inventyfy.utils.UiUtils;

import static com.designpattern.inventyfy.utils.LinkConstants.PROTOTYPE_PATTERN;

/**
 * Created by desaidr
 */

public class PrototypePatternFragment extends Fragment implements View.OnClickListener {

    private Button samsungs7;
    private Button samsungs7Edge;
    private TextView resultText;
    private TextView sourceCodeLink;

    private SamsungDevice samsungDevice;

    public static PrototypePatternFragment getInstance() {
        final PrototypePatternFragment prototypePatternFragment = new PrototypePatternFragment();
        return prototypePatternFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createSamsungs7Instance();
    }

    private void createSamsungs7Instance() {
        samsungDevice = new SamsungDevice();
        samsungDevice.setDeviceName("Galaxy S7");
        samsungDevice.setDeviceScreenResolution("1440 x 2560");
        samsungDevice.setProcessorType("Qualcomm");
        samsungDevice.setRamCount(4);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_prototype_pattern, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        samsungs7 = view.findViewById(R.id.btn_samsung_s7);
        samsungs7.setOnClickListener(this);
        samsungs7Edge = view.findViewById(R.id.btn_samsung_s7_edge);
        samsungs7Edge.setOnClickListener(this);

        resultText = view.findViewById(R.id.txt_final_result);

        sourceCodeLink = view.findViewById(R.id.txt_source_link);
        sourceCodeLink.setMovementMethod(LinkMovementMethod.getInstance());
        sourceCodeLink.setText(UiUtils.getLinkSpannableString(getString(R.string.lbl_source_code_link),
                PROTOTYPE_PATTERN));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_samsung_s7:
                displayResult(samsungDevice);
                break;
            case R.id.btn_samsung_s7_edge:
                try {
                    SamsungDevice s7Edge = (SamsungDevice) samsungDevice.clone();
                    s7Edge.setDeviceName("galaxy S7 Edge");
                    s7Edge.setProcessorType("Exynos");
                    displayResult(s7Edge);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }

                break;
        }
    }

    private void displayResult(final SamsungDevice samsungDevice) {
        resultText.setText(getString(R.string.lbl_prototype_result_text,
                samsungDevice.getDeviceName(),
                samsungDevice.getDeviceScreenResolution(),
                samsungDevice.getProcessorType(),
                samsungDevice.getRamCount()));
    }
}
