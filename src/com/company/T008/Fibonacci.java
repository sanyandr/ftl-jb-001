package com.company.T008;

public class Fibonacci {
    public static void run() {
        int f1 = 1, f2 = 1, fSum = 0;
        System.out.print(f1 + " ");
        while (f2 < 90) {
            System.out.print(f2 + " ");
            fSum = f1 + f2;
            f1 = f2;
            f2 = fSum;
        }
    }
}
