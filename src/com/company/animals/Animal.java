package com.company.animals;

import java.lang.reflect.Constructor;

public class Animal {
    protected String name;
    protected Integer weight;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public void voice() {
        System.out.println("Voice");
    }
}
