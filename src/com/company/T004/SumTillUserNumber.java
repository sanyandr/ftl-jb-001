package com.company.T004;

import java.util.Scanner;

public class SumTillUserNumber {
    public static void run() {
        System.out.println("Enter a number PLS: ");
        Scanner reader = new Scanner(System.in);
        int userNumber = reader.nextInt();
        int sum = 0;
        for (int i = 0; i <= userNumber; i++) {
            sum += i;
        }
        System.out.println("sum of numbers till " + userNumber + " = " + sum);
    }
}
