package com.designpattern.inventyfy.creational.builder.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.creational.builder.Cake;
import com.designpattern.inventyfy.utils.UiUtils;

import static com.designpattern.inventyfy.utils.LinkConstants.BUILDER_PATTERN;

/**
 * Created by desaidr
 */

public class BuilderFactoryPatternFragment extends Fragment implements View.OnClickListener {

    private Button cherryCake;
    private Button chocolateCake;
    private Button messageCake;
    private ImageView cakeImage;
    private TextView sourceCodeLink;

    public static BuilderFactoryPatternFragment getInstance() {
        final BuilderFactoryPatternFragment builderFactorypatternFragment = new BuilderFactoryPatternFragment();
        return builderFactorypatternFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_builder_pattern, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cherryCake = view.findViewById(R.id.btn_cake_cherry);
        cherryCake.setOnClickListener(this);
        chocolateCake = view.findViewById(R.id.btn_cake_chocolate);
        chocolateCake.setOnClickListener(this);
        messageCake = view.findViewById(R.id.btn_cake_message);
        messageCake.setOnClickListener(this);

        cakeImage = view.findViewById(R.id.img_cake);

        sourceCodeLink = view.findViewById(R.id.txt_source_link);
        sourceCodeLink.setMovementMethod(LinkMovementMethod.getInstance());
        sourceCodeLink.setText(UiUtils.getLinkSpannableString(getString(R.string.lbl_source_code_link),
                BUILDER_PATTERN));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_cake_cherry:
                final Cake cherry = new Cake.CakeBuilder()
                        .setCakeTopping("cherry")
                        .buildCake();
                cakeImage.setImageResource(cherry.getCake());
                break;
            case R.id.btn_cake_chocolate:
                final Cake chocolate = new Cake.CakeBuilder()
                        .setCakeFlavour("chocolate")
                        .buildCake();
                cakeImage.setImageResource(chocolate.getCake());
                break;
            case R.id.btn_cake_message:
                final Cake message = new Cake.CakeBuilder()
                        .setCakeMessage("happy_birthday")
                        .buildCake();
                cakeImage.setImageResource(message.getCake());
                break;
        }
    }
}
