package com.company.T011;

import com.company.T010.ArrayRandom;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void run() {
        int N = 7;
        Random r = new Random();
        Integer[] arrayForBubble = new Integer[N];
        for (int i = 0; i < N; i++) {
            arrayForBubble[i] = r.nextInt();
            System.out.print(arrayForBubble[i] + " ");
        }
        bubbleSort(arrayForBubble);
        System.out.println("\n");
        for (int i = 0; i < N; i++) {
            System.out.print(arrayForBubble[i] + " ");
        }
    }
}