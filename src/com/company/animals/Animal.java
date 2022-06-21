package com.company.animals;

import java.lang.reflect.Constructor;

class Animal {
    protected boolean canFly = false;
    protected String name;
    protected Integer weight;
    protected Integer CurrentPosition = 0;
    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        this.canFly = false;
    }

    public Animal() {
        this.canFly = false;
    }

    public void voice() {
        System.out.println("Voice");
    }

    protected void runForward(Integer length) {
        this.CurrentPosition += length;
    }


}
