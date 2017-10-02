package com.designpattern.inventyfy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.designpattern.inventyfy.R;
import com.designpattern.inventyfy.dao.DesignPatternTypeEntity;

import java.util.List;

/**
 * Created by drupdesai
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.DesignPatternHolder> {

    public interface OnItemClick {
        void onItemClick(int itemId);
    }

    private List<DesignPatternTypeEntity> designPatternTypeEntities;
    private OnItemClick itemClick;

    public ItemAdapter(final List<DesignPatternTypeEntity> designPatternTypeEntities, OnItemClick onItemClick) {
        this.designPatternTypeEntities = designPatternTypeEntities;
        this.itemClick = onItemClick;
    }

    @Override
    public DesignPatternHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_item, parent, false);
        return new DesignPatternHolder(view);
    }

    @Override
    public void onBindViewHolder(DesignPatternHolder holder, int position) {
        DesignPatternTypeEntity designPatternTypeEntity = designPatternTypeEntities.get(position);
        holder.patternName.setText(designPatternTypeEntity.getDesignPatternName());
    }

    @Override
    public int getItemCount() {
        return designPatternTypeEntities != null ? designPatternTypeEntities.size() : 0;
    }

    public class DesignPatternHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView patternName;

        public DesignPatternHolder(View itemView) {
            super(itemView);

            patternName = itemView.findViewById(R.id.txt_item);
            patternName.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemClick != null) {
                itemClick.onItemClick(designPatternTypeEntities.get(getAdapterPosition()).getDesignPatternId());
            }
        }
    }
}
