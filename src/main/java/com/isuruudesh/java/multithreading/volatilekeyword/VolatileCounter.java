package com.isuruudesh.java.multithreading.volatilekeyword;

public class VolatileCounter {
    private volatile int count = 0;

    public boolean increment() { // no guarantee that only one thread operate at a given time
        if (count == 10) {
            return false;
        }
        count++; // non atomic operation
        return true;
    }
}
