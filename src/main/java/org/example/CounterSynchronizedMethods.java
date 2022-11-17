package org.example;

import static java.lang.Thread.sleep;

public class CounterSynchronizedMethods extends Counter {
    private int c = 0;

    public synchronized void increment() throws InterruptedException {
        int a;
        sleep(2000);
        a = c;
        a++;
        c = a;
    }

    public synchronized void decrement() throws InterruptedException {
        int a;
        sleep(2000);
        a = c;
        a--;
        c = a;
    }

    public int value() {
        return c;
    }
}
