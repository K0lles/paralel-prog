package org.example;

import static java.lang.Thread.sleep;

public class Counter {
    private int c = 0;

    public void increment() throws InterruptedException {
        int a;
        sleep(2000);
        a = c;
        a++;
        c = a;
    }

    public void decrement() throws InterruptedException {
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
