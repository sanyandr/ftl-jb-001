package com.company.animals;

import java.lang.reflect.Constructor;

abstract class Animal {
    protected MoveType moveType;
    protected String name;
    protected Integer weight;
    protected Integer CurrentPosition = 0;
    public Animal(String name, Integer weight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public abstract void voice();

    protected void runForward(Integer length) {
        this.CurrentPosition += length;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return CurrentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        CurrentPosition = currentPosition;
    }
}
