package com.company.L019;

import java.util.stream.Stream;

public class StringExample {
    private static void runContentEquals() {
        System.out.println("\nrunContentEquals()");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = "Сайт для изучения Java";

        StringBuffer str3 = new StringBuffer("Добро пожаловать на FoodTech School");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4: " + result);
    }

    private static void runEqualsIgnoreCase() {
        System.out.println("\nrunEqualsIgnoreCase()");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = str1;
        String str3 = "Сайт для изучения Java";
        String str4 = "ДОбрО ПОжалоВАТь на FOODTech ScHool";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));

    }

    private static void runCompareTo() {
        System.out.println("\nrunCompareTo()");
        String str1 = "Я вызываю метод";
        String str2 = "Я вызываю метод";
        String str3 = "Я Вызываю класс";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }

    private static void runCompareToIgnoreCase() {
        System.out.println("\nrunCompareTo()");
        String str1 = "Я вызываю метод";
        String str2 = "Я Вызываю метод";
        String str3 = "Я Вызываю класс";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    private static void runToLowerCase() {
        System.out.println("\nrunToLowerCase()");
        String str1 = "Я вызываю метод";

        System.out.println(str1.toLowerCase());

    }

    private static void runToUpperCase() {
        System.out.println("\nrunToUpperCase()");
        String str1 = "Я вызываю метод";

        System.out.println(str1.toUpperCase());

    }

    private static void runConcat() {
        System.out.println("\nrunConcat()");

        String s = "Я вызываю метод";
        s = s.concat(" И я вызываю класс");

        System.out.println(s);
    }

    private static void runMatches() {
        System.out.println("\nrunMatches()");
        String s = "Добро пожаловать на FoodTech School";
        System.out.println(s.matches("(.*)FoodTech(.*)"));
        System.out.println(s.matches("FoodTech"));
        System.out.println(s.matches("Добро(.*)"));
    }

    private static void runContains() {
        System.out.println("\nrunContains()");
        String s = "Twinkle twinkle, little star";
        System.out.println(s.contains("little"));
        System.out.println(s.contains("45253"));
    }

    private static void runRegionMatches() {
        System.out.println("\nrunRegionMatches()");
        String s1 = "Добро пожаловать на FoodTech School", s2 = "FoodTech School", s3 = "Java";
        String s4 = "FOODTECH SCHOOL";

        System.out.println(s1.regionMatches(20, s2, 0, 8));
        System.out.println(s1.regionMatches(20, s3, 0, 8));
        System.out.println(s1.regionMatches(true,20, s4, 0, 8));
    }

    private static void runStartWith() {
        System.out.println("\nrunStartWith()");
        String s1 = "Добро пожаловать на FoodTech School", s2 = "Добро", s3 = "Java";
        String s4 = "FOODTECH SCHOOL";

        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));

    }
    private static void runEndWith() {
        System.out.println("\nrunStartWith()");
        String s1 = "Добро пожаловать на FoodTech School", s2 = "School", s3 = "Java";
        String s4 = "FOODTECH SCHOOL";

        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.endsWith(s4));

    }

    private static void runLines() {
        System.out.println("\nrunLines()");
        String s = "stadfa\n" + "dfsfds\n" + "fggdf\n" + "dsdssad\n" + "fgfsdasr\n";

        System.out.println(s);
        Stream<String> lines = s.lines();
        lines.forEach(System.out::println);
        System.out.println(lines);

    }

        public static void run() {
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
    }
}

