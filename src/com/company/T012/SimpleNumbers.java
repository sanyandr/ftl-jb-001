package com.company.T012;

public class SimpleNumbers {
    public static void run() {
        int devs = 0;
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    devs++;
                    break;
                }
            }
            if (devs == 0) {
                System.out.print(i + "  ");
            }
            else devs = 0;
            }
    }
}
