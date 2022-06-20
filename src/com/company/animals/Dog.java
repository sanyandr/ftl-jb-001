package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(Dog.of("Sharik", 3));
        dogs.add(Dog.of("Bubble", 1));
        dogs.add(Dog.of("Tuzic", 5));

        return dogs;
    }
    /**
     * Идем до палки, определяем дельту между тек позицией и палкой, чтобы дойти до нее.
     * @param stickPosition - позиуия палки
     */
    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - this.CurrentPosition;
        this.runForward(delta);
    }

    public void whereIsTheDog() {
        System.out.println(this.CurrentPosition);
    }

    public static Dog of(String name, Integer weight) {
        return new Dog(name, weight);
    }

    public static Dog homeless(Integer weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("bork");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", CurrentPosition=" + CurrentPosition +
                '}';
    }
}
