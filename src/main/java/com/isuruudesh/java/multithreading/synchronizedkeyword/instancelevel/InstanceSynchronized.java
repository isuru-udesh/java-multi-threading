package com.isuruudesh.java.multithreading.synchronizedkeyword.instancelevel;

public class InstanceSynchronized {
    private int count = 0;

    public synchronized int getCount() {
        return count;
    }

    public synchronized void incrementCount() {
        count++;
    }
}
