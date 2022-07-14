package com.company;

import com.company.T001.OutputNumbers;
import com.company.T002.OutputAnotherNumbers;
import com.company.L020.TypeConversion;
import com.company.L026.FileExample;
import com.company.L028.House;
import com.company.T003.TableOfMultiplication;
import com.company.T004.SumTillUserNumber;
import com.company.T005.SequenceOutput;
import com.company.T006.PowerOfTwo;
import com.company.T007.StarsMatrix;
import com.company.T008.Fibonacci;
import com.company.T009.Mystery;
import com.company.animals.*;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();
//        Cat cat = new Cat("Barsik", new Animal.AnimalWeight(20, Animal.AnimalWeight.weightType.KG));
//        System.out.println(cat.jumpHeight());


        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereIsTheDog();
        dog.goToStick(20);
        dog.whereIsTheDog();
        dog.goToStick(5);
        dog.whereIsTheDog();

        dog.voice();

        Dog homelessDog = Dog.homeless(new Animal.AnimalWeight(100, Animal.AnimalWeight.weightType.KG));
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

        List<Dog> dogsHomeless = Arrays.asList(new Dog[]{
                Dog.homeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.weightType.KG)),
                Dog.homeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.weightType.KG)),
                Dog.homeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.weightType.KG))
        });
        System.out.println(dogsHomeless.size());
        for (Dog dogItem : dogsHomeless) {
            System.out.println(dogItem);
            dogItem.setName(String.valueOf((new Random()).nextLong()));
            System.out.println(dogItem.getName());
        }

        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.homeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.weightType.KG)));
        dogsLinkedList.add(Dog.homeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.weightType.KG)));
        dogsLinkedList.add(Dog.homeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.weightType.KG)));
        dogsLinkedList.add(Dog.homeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.weightType.KG)));
        dogsLinkedList.add(Dog.homeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.weightType.KG)));

        int IndexLinkedList = 0;
        while (IndexLinkedList < dogsLinkedList.size()) {
            System.out.println(dogsLinkedList.get(IndexLinkedList));
            IndexLinkedList++;
        }
        for (int i = 0; i < 100; i++) {
            //SwitchExample.run();
        }

        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if (dog.getMoveType() == MoveType.WALK) {
            System.out.println("Ножки имеются");
        }

        TypeConversion.run();

        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.weightType.KG));
        try {
            dog.getWeight().setValue(-10);
        } catch (Animal.WeightException ignore) {
        }

        FileExample.run();

        House house = new House.Builder()
                .optHasSwimmingPool(true)
                .build();
        System.out.println(house.toString());

        House houseFull = new House.Builder()
                .optHasGarage(true)
                .optHasGarden(true)
                .optHasSwimmingPool(true)
                .optHasFancyStatues(true)
                .build();
        System.out.println(houseFull.toString());
        
        System.out.println("========TASKS========");
        System.out.println("TASK001");
        OutputNumbers.run();
        System.out.println("\n ");
        System.out.println("TASK002");
        OutputAnotherNumbers.run();
        System.out.println("\n ");
        System.out.println("TASK003");
        TableOfMultiplication.run();
        System.out.println("\n ");
        System.out.println("TASK004");
        //SumTillUserNumber.run();
        System.out.println("\n ");
        System.out.println("TASK005");
        SequenceOutput.run();
        System.out.println("\n ");
        System.out.println("TASK006");
        PowerOfTwo.run();
        System.out.println("\n ");
        System.out.println("TASK007");
        StarsMatrix.run();
        System.out.println("\n ");
        System.out.println("TASK008");
        Fibonacci.run();
        System.out.println("\n ");
        System.out.println("TASK009");
        Mystery.run();
        System.out.println("\n ");
    }
}