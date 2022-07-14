package com.company.animals;

import java.lang.reflect.Constructor;

public abstract class Animal {
    public static class WeightException extends RuntimeException{
    }
    public static class AnimalWeight{
        public enum weightType {
            KG, GR
        }
        private Integer value;
        private weightType weightType;

        public AnimalWeight(Integer value, AnimalWeight.weightType weightType) throws WeightException{
            if (value < 0) throw new WeightException();
            this.value = value;
            this.weightType = weightType;
        }

        @Override
        public String toString() {
            return "AnimalWeight{" +
                    "value=" + value +
                    ", weightType=" + weightType +
                    '}';
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            if (value < 0) throw new WeightException();
            this.value = value;
        }

        public AnimalWeight.weightType getWeightType() {
            return weightType;
        }

        public void setWeightType(AnimalWeight.weightType weightType) {
            this.weightType = weightType;
        }
    }
    protected MoveType moveType;
    protected String name;
    protected AnimalWeight weight;
    protected Integer CurrentPosition = 0;
    public Animal(String name, AnimalWeight weight, MoveType moveType) {
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

    public AnimalWeight getWeight() {
        return weight;
    }

    public void setWeight(AnimalWeight weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return CurrentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        CurrentPosition = currentPosition;
    }
}
