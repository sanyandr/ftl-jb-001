package com.company.T013;

import com.company.T012.SimpleNumbers;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class DeleteExemplars {
    public static void DeleteNumber(Integer[] arr, Integer numberToDelete) {
        int equalsWithNumber = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Objects.equals(arr[i-1], numberToDelete)) {
                equalsWithNumber++;
                for (int j = i-1; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                i--;
                System.out.println("\nDELETING " + arr[arr.length-1]);
                arr[arr.length-1] = null;
            }
        }
        Integer[] newArray = new Integer[arr.length-equalsWithNumber];
        for (int i = 0; i < arr.length-equalsWithNumber; i++) {
            newArray[i] = arr[i];
        }
        System.out.print("RESULT: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
    public static void run() {
        int N = 10;
        int numberToDelete = 2;
        Random r = new Random();
        Integer[] taskArray = {2, 9, 7, 9, 9, 90, 1234, 9, 324, 12435};
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter a number to delete: "); //example 9
        numberToDelete = inputNumber.nextInt();
        DeleteNumber(taskArray, numberToDelete);
    }
}
