package com.designpattern.inventyfy.structural.adapter.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.utils.UiUtils;

import static com.designpattern.inventyfy.utils.LinkConstants.ADAPTER_PATTERN;

/**
 * Created by desaidr
 */

public class AdapterFactoryFragment extends Fragment {

    public static AdapterFactoryFragment getInstance() {
        AdapterFactoryFragment adapterFactoryFragment = new AdapterFactoryFragment();
        return adapterFactoryFragment;
    }

    private TextView sourceCodeLink;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_adapter_pattern, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sourceCodeLink = view.findViewById(R.id.txt_source_link);
        sourceCodeLink.setMovementMethod(LinkMovementMethod.getInstance());
        sourceCodeLink.setText(UiUtils.getLinkSpannableString(getString(R.string.lbl_source_code_link),
                ADAPTER_PATTERN));
    }
}
