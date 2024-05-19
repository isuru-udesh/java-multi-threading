package com.isuruudesh.java.multithreading;

public class ThreadJoinExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Started runnable implemented thread");
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); // since this is a daemon thread will immediately terminate
        thread.start();
        try {
            thread.join(); // since join() method called now main thread has wait until joined thread terminates
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
