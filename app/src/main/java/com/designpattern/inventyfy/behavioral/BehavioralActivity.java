package com.designpattern.inventyfy.behavioral;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.adapter.ItemAdapter;
import com.designpattern.inventyfy.dao.DesignPatternTypeEntity;
import com.designpattern.inventyfy.utils.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by desaidr
 */

public class BehavioralActivity extends AppCompatActivity implements ItemAdapter.OnItemClick {

    private RecyclerView behavioralItemView;
    final List<DesignPatternTypeEntity> designPatternEntities = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creational);

        fillData();

        behavioralItemView = findViewById(R.id.rv_creational_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        behavioralItemView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,
                layoutManager.getOrientation());
        behavioralItemView.addItemDecoration(dividerItemDecoration);
        ItemAdapter itemAdapter = new ItemAdapter(designPatternEntities, this);
        behavioralItemView.setAdapter(itemAdapter);
    }

    private void fillData() {
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_TEMPLATE_METHOD_PATTERN,
                getString(R.string.lbl_behavioral_template)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_MEDIATOR_PATTERN,
                getString(R.string.lbl_behavioral_mediator)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_CHAIN_OF_RESPONSIBILITY_PATTERN,
                getString(R.string.lbl_behavioral_chain_of_responsibility)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_OBSERVER_PATTERN,
                getString(R.string.lbl_behavioral_observer)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_STRATEGY_PATTERN,
                getString(R.string.lbl_behavioral_strategy)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_COMMAND_PATTERN,
                getString(R.string.lbl_behavioral_command)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_STATE_PATTERN,
                getString(R.string.lbl_behavioral_state)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_VISITOR_PATTERN,
                getString(R.string.lbl_behavioral_visitor)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_ITERATOR_PATTERN,
                getString(R.string.lbl_behavioral_iterator)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_INTERPRETER_PATTERN,
                getString(R.string.lbl_behavioral_interpreter)));
        designPatternEntities.add(new DesignPatternTypeEntity(Constants.BEHAVIORAL_MEMENTO_PATTERN,
                getString(R.string.lbl_behavioral_memento)));
    }

    @Override
    public void onItemClick(int itemId) {

    }
}
