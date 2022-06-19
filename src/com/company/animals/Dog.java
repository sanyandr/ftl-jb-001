package com.company.animals;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
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
}
