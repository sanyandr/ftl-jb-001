package com.company.T010;

import javax.management.openmbean.ArrayType;
import java.sql.Array;
import java.util.Random;

public class ArrayRandom {
    public static void run() {
        int N = 5;
        Double[] taskArray = new Double[N];
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            taskArray[i] = r.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            System.out.print(taskArray[i] + " ");
        }
        Double max = -1.0;
        Double min = 10000.0;
        Double avg = 0.0;
        for (int i = 0; i < N-1; i++) {
            if (taskArray[i] > max) {
                max = taskArray[i];
            }
            if (taskArray[i] < min) {
                min = taskArray[i];
            }
            avg += taskArray[i];
        }
        System.out.println("\n");
        System.out.println("maximum: " + max);
        System.out.println("minimum: " + min);
        System.out.println("average: " + avg/N);
    }
}
