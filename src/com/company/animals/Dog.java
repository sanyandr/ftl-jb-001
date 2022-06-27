package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
        this.moveType = MoveType.WALK;
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();
        try {
            dogs.add(Dog.of("Sharik", new AnimalWeight(-1, AnimalWeight.weightType.KG)));
            dogs.add(Dog.of("Bubble", new AnimalWeight(3, AnimalWeight.weightType.KG)));
            dogs.add(Dog.of("Tuzic", new AnimalWeight(5, AnimalWeight.weightType.KG)));
        }
        catch (WeightException e) {
            e.printStackTrace();
        }
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

    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);
    }

    public static Dog homeless(AnimalWeight weight) {
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
