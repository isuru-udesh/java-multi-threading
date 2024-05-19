package com.isuruudesh.java.multithreading.memorymodel;

public class MyRunnable implements Runnable{
    private int count = 0; // this is member variable -> one for one object

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) { // i is a local variable
            synchronized (this) {
                count = count + 1;
            }
        }
        System.out.println("Count value of " + Thread.currentThread().getName() + " is : " + count);
    }
}
