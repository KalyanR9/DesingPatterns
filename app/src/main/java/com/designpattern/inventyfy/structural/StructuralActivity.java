package com.designpattern.inventyfy.structural;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.designpattern.inventyfy.ActivityFragmentHolder;
import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.adapter.ItemAdapter;
import com.designpattern.inventyfy.creational.CreationalActivity;
import com.designpattern.inventyfy.dao.DesignPatternTypeEntity;
import com.designpattern.inventyfy.utils.Constants;
import com.designpattern.inventyfy.utils.widget.CustomDialogFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by desaidr
 */

public class StructuralActivity extends AppCompatActivity implements ItemAdapter.OnItemClick {

    private RecyclerView structuralItemView;
    final List<DesignPatternTypeEntity> designPatternEntities = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creational);

        fillData();

        structuralItemView = findViewById(R.id.rv_creational_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        structuralItemView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,
                layoutManager.getOrientation());
        structuralItemView.addItemDecoration(dividerItemDecoration);
        ItemAdapter itemAdapter = new ItemAdapter(designPatternEntities, this);
        structuralItemView.setAdapter(itemAdapter);
    }

    private void fillData() {
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_ADAPTER_PATTERN,
                getString(R.string.lbl_structural_adapter)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_COMPOSITE_PATTERN,
                getString(R.string.lbl_structural_composite)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_PROXY_PATTERN,
                getString(R.string.lbl_structural_proxy)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_FLYWEIGHT_PATTERN,
                getString(R.string.lbl_structural_flyweight)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_FACADE_PATTERN,
                getString(R.string.lbl_structural_facade)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_BRIDGE_PATTERN,
                getString(R.string.lbl_structural_bridge)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.STRUCTURAL_DECORATOR_PATTERN,
                getString(R.string.lbl_structural_decorator)));
    }

    @Override
    public void onItemClick(int itemId) {
        final FragmentManager fm = getSupportFragmentManager();
        switch (itemId) {
            case Constants.STRUCTURAL_ADAPTER_PATTERN:
                Intent factoryIntent = new Intent(StructuralActivity.this, ActivityFragmentHolder.class);
                factoryIntent.putExtra(Constants.EXTRA_FRAGMENT_TYPE, Constants.STRUCTURAL_ADAPTER_PATTERN);
                startActivity(factoryIntent );
                break;
        }
    }
}
