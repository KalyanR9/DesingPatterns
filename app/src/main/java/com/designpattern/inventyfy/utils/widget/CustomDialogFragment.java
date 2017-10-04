package com.designpattern.inventyfy.utils.widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.utils.Constants;

/**
 * Created by drupdesai
 */

public class CustomDialogFragment extends DialogFragment {

    private TextView popupTitle;
    private TextView popupMessage;

    private SpannableString spannableMessage;

    public static CustomDialogFragment getInstance(final String title, final SpannableString message) {
        final CustomDialogFragment customDialogFragment = new CustomDialogFragment();
        final Bundle bundle = new Bundle();
        bundle.putString(Constants.EXTRA_DIALOG_TITLE, title);
        customDialogFragment.spannableMessage = message;
        customDialogFragment.setArguments(bundle);
        return customDialogFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NO_TITLE, 0);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_description, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        popupTitle = view.findViewById(R.id.txt_title);
        popupMessage = view.findViewById(R.id.txt_message);

        String title = getArguments().getString(Constants.EXTRA_DIALOG_TITLE);

        if (!TextUtils.isEmpty(title)) {
            popupTitle.setText(title);
        }

        if (!TextUtils.isEmpty(spannableMessage)) {
            popupMessage.setMovementMethod(LinkMovementMethod.getInstance());
            popupMessage.setText(spannableMessage);
        }
    }
}
