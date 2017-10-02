package com.designpattern.inventyfy.dao;

/**
 * Created by drupdesai
 */

public class DesignPatternTypeEntity {

    private int designPatternId;
    private String designPatternName;

    public DesignPatternTypeEntity(int designPatternId, String designPatternName) {
        this.designPatternId = designPatternId;
        this.designPatternName = designPatternName;
    }

    public int getDesignPatternId() {
        return designPatternId;
    }

    public String getDesignPatternName() {
        return designPatternName;
    }
}
