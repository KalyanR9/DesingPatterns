package com.designpattern.inventyfy.creational;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.adapter.ItemAdapter;
import com.designpattern.inventyfy.dao.DesignPatternTypeEntity;
import com.designpattern.inventyfy.utils.Constants;
import com.designpattern.inventyfy.utils.widget.CustomDialogFragment;

import java.util.ArrayList;
import java.util.List;

import static com.designpattern.inventyfy.utils.widget.LinkConstants.SINGLETON_REFLACTION_SAFE;

/**
 * Created by drupdesai
 */

public class CreationalActivity extends AppCompatActivity implements ItemAdapter.OnItemClick {

    private RecyclerView creationalItemView;
    final List<DesignPatternTypeEntity> designPatternEntities = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creational);

        fillList();

        creationalItemView = findViewById(R.id.rv_creational_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        creationalItemView.setLayoutManager(layoutManager);
        ItemAdapter itemAdapter = new ItemAdapter(designPatternEntities, this);
        creationalItemView.setAdapter(itemAdapter);
    }


    private void fillList() {
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_SINGLETON_REFLACTION,
                getString(R.string.lbl_creation_singleton_reflaction)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_SINGLETON_CLONING,
                getString(R.string.lbl_creation_singleton_cloning)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_SINGLETON_SERIALIZATION,
                getString(R.string.lbl_creation_singleton_serialization)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_SINGLETON_MULTITHREADED,
                getString(R.string.lbl_creation_singleton_multithreaded)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_SINGLETON_HOLDER,
                getString(R.string.lbl_creation_singleton_holder)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_SINGLETON_ENUM,
                getString(R.string.lbl_creation_singleton_enum)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_FACTORY,
                getString(R.string.lbl_creation_factory)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_ABSTRACT_FACTORY,
                getString(R.string.lbl_creation_abstract_factory)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_BUILDER,
                getString(R.string.lbl_creation_builder)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.CREATIONAL_PROTOTYPE,
                getString(R.string.lbl_creation_prototype)));

    }

    @Override
    public void onItemClick(int itemId) {
        final FragmentManager fm = getSupportFragmentManager();
        CustomDialogFragment customDialogFragment;
        switch (itemId) {
            case Constants.CREATIONAL_SINGLETON_REFLACTION:
                customDialogFragment = CustomDialogFragment.getInstance(getString(R.string.lbl_creation_singleton_reflaction),
                        createMessageText(R.string.msg_singleton_reflaction, SINGLETON_REFLACTION_SAFE));
                customDialogFragment.show(fm, CustomDialogFragment.class.getSimpleName());
                break;
            case Constants.CREATIONAL_SINGLETON_CLONING:
                customDialogFragment = CustomDialogFragment.getInstance(getString(R.string.lbl_creation_singleton_cloning),
                        createMessageText(R.string.msg_singleton_clone, ""));
                customDialogFragment.show(fm, CustomDialogFragment.class.getSimpleName());
                break;
        }
    }

    private SpannableString createMessageText(final int stringResId, final String pageUrl) {
        final String messageText = getString(stringResId);
        final SpannableString spannableString = new SpannableString(messageText);
        spannableString.setSpan(new BackgroundColorSpan(Color.CYAN), messageText.indexOf("\n\n"),
                messageText.lastIndexOf("\n\n"), 0);
        spannableString.setSpan(new RelativeSizeSpan(0.9f), messageText.indexOf("\n\n"),
                messageText.lastIndexOf("\n\n"), 0);
        spannableString.setSpan(new URLSpan(pageUrl), messageText.lastIndexOf("\n\n"),
                messageText.length(), 0);
        return spannableString;
    }
}
