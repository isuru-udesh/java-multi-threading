package com.isuruudesh.java.multithreading;

public class ThreadCreation {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup());
        // start new thread extending Thread class
        new TestThread().start();

        // start new thread of class implementing Runnable interface
        new Thread(new TestRunnable()).start();

        // start a new thread using anonymous
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Doing test with thread of anonymous implementation");
                System.out.println(Thread.currentThread());
            }
        };
        new Thread(runnable).start();

        // start new thread using Lambda expression
        new Thread(() -> {
            System.out.println("Doing test in Lambda expression");
            System.out.println(Thread.currentThread());
        }).start();
    }
}

class TestThread extends Thread {
    public void run() {
        System.out.println("Doing test thread stuff");
        System.out.println(Thread.currentThread());
    }
}

class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Doing test thread stuff in runnable");
        System.out.println(Thread.currentThread());
    }
}