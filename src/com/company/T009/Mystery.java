package com.company.T009;

import java.util.Scanner;

public class Mystery {
    public static void run() {
        String answer = "trolleybus";
        int triesCount = 1;
        Scanner reader = new Scanner(System.in);
        String userAnswer = "";
        System.out.println("What is it: blue, big, with a mustache and completely stuffed with hares?");
        while (!answer.equalsIgnoreCase(userAnswer)) {
            userAnswer = reader.nextLine();
            if (triesCount!=3) {
                switch (userAnswer) {
                    case "give up", "surrender" -> {
                        System.out.println("The correct answer is trolleybus, booby :(");
                        break;
                    }
                    case "trolleybus", "Trolleybus" -> {
                        System.out.println("Correct!");
                        break;
                    }
                    default -> {
                        System.out.println("Try again.");
                        triesCount++;
                    }
                }
            }
            else System.out.println("Attempts are over, good bye!");
        }
    }
}
