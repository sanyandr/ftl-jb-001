package com.company.animals;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    public static Dog[] randomArray() {
        Dog[] dogs = new Dog[3];
        dogs[0] = Dog.of("Sharik", 3);
        dogs[1] = Dog.of("Bubble", 1);
        dogs[2] = Dog.of("Tuzic", 5);

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
