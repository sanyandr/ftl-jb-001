package com.company;

//import com.company.L001.HelloWorld;
//import com.company.L002.POJO;
//import com.company.L003.Cat;

import com.company.L013.SwitchExample;
import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;

import java.util.*;

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

        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }

        List<Dog> dogsHomeless = Arrays.asList(new Dog[]  {
                Dog.homeless(2),
                Dog.homeless(3),
                Dog.homeless(5)
        });
        System.out.println(dogsHomeless.size());
        for (Dog dogItem : dogsHomeless){
            System.out.println(dogItem);
            dogItem.setName(String.valueOf((new Random()).nextLong()));
            System.out.println(dogItem.getName());
        }

        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.homeless(10));
        dogsLinkedList.add(Dog.homeless(10));
        dogsLinkedList.add(Dog.homeless(10));
        dogsLinkedList.add(Dog.homeless(10));
        dogsLinkedList.add(Dog.homeless(10));

        int IndexLinkedList = 0;
        while (IndexLinkedList < dogsLinkedList.size()) {
            System.out.println(dogsLinkedList.get(IndexLinkedList));
            IndexLinkedList++;
        }
        for (int i = 0; i < 100; i++) {
            //SwitchExample.run();
        }
    }
}