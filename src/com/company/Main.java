package com.company;

//import com.company.L001.HelloWorld;
//import com.company.L002.POJO;
//import com.company.L003.Cat;

import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();
        Cat cat = new Cat("Barsik", 20);
        System.out.println(cat.jumpHeight());

        
        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereIsTheDog();
        dog.goToStick(20);
        dog.whereIsTheDog();
        dog.goToStick(5);
        dog.whereIsTheDog();

        dog.voice();

        Dog homelessDog = Dog.homeless(100 );
        homelessDog.voice();

        Duck duck = new Duck(); //Duck может вызывать методы isTheBirdFlying(), takeOff(), landing()
        duck.voice();           //поскольку наследуется от Bird с public спецификатором
        duck.takeOff();         //Bird в свою очередь наследуется от Animal, где есть public voice()
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();

        List<Dog> dogsHomeless = Arrays.asList(new Dog[]  {
                Dog.homeless(2),
                Dog.homeless(3),
                Dog.homeless(5)
        });
        System.out.println(dogsHomeless.size());
        System.out.println(dogsHomeless.get(0));
        System.out.println(dogsHomeless.get(1));
        System.out.println(dogsHomeless.get(2));

        List<Dog> dogs = Dog.randomArray();
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
        System.out.println(dogs.get(2));
    }
}