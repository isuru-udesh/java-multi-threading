package com.isuruudesh.java.multithreading.synchronizedkeyword.classlevel;

import com.isuruudesh.java.multithreading.synchronizedkeyword.instancelevel.InstanceSynchronized;

public class ClassLevelSynchronizedMain {
    public static void main(String[] args) {
        var thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // these operations are not atomic
                // int current = instanceSynchronized.getCount();
                // current++; // another thread (Thread 2) could update the value of count
                // instanceSynchronized.setCount(current);
                ClassSynchronized.incrementCount();
            }
            System.out.println("Count from thread 1 : " + ClassSynchronized.getCount());
        });

        var thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // these operations are not atomic
                // int current = instanceSynchronized.getCount();
                // current++; // another thread (Thread 1) could update the value of count
                // instanceSynchronized.setCount(current);
                ClassSynchronized.incrementCount();
            }
            System.out.println("Count from thread 2 : " + ClassSynchronized.getCount());
        });
        thread1.start();
        thread2.start();
    }
}
