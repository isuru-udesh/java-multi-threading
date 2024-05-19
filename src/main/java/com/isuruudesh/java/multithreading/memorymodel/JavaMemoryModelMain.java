package com.isuruudesh.java.multithreading.memorymodel;

public class JavaMemoryModelMain {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable(); // create new object in the heap
        MyRunnable myRunnable2 = new MyRunnable(); // create new object in the heap
        Thread thread1 = new Thread(myRunnable1, "Thread 1");
        Thread thread2 = new Thread(myRunnable2, "Thread 2");
        thread1.start();
        thread2.start();

        // creates only one object in the heap and two references in each thread stack
        // may end up in both raise condition and invisible write
        MyRunnable mySharedRunnable = new MyRunnable();
        Thread thread3 = new Thread(mySharedRunnable, "Thread 3");
        Thread thread4 = new Thread(mySharedRunnable, "Thread 4");
        thread3.start();
        thread4.start();
    }
}
