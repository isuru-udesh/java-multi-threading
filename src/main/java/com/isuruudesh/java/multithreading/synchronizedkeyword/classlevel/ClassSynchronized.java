package com.isuruudesh.java.multithreading.synchronizedkeyword.classlevel;

public class ClassSynchronized {
    private static int count = 0;

    public static int getCount() {
        synchronized (ClassSynchronized.class) { // monitory object is class not a instance
            return count;
        }
    }

    public synchronized static void incrementCount() {
        count++;
    }
}
