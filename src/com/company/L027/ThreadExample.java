package com.company.L027;

public class ThreadExample {
    private static void runAnotherThread(String message) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i + "  " + message);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
    public static void run() {
        runAnotherThread("Thread1");
        runAnotherThread("Thread2");
        runAnotherThread("Thread3");
        runAnotherThread("Thread4");
        runAnotherThread("Thread5");
    }
}
