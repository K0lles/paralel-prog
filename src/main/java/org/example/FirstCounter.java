package org.example;

public class FirstCounter{
    private final Object locker1 = new Object();
    private final Object locker2 = new Object();
    public int counterA = 0;
    public int counterB = 0;

    public void incrementCounterA() throws InterruptedException {

            int helperA;
            Thread.sleep(2000);
            helperA = counterA;
            helperA++;
            counterA = helperA;

    }

    public void incrementCounterB() throws InterruptedException {
        synchronized (locker2) {
            int helperB;
            Thread.sleep(500);
            helperB = counterB;
            helperB++;
            counterB = helperB;
        }
    }

    public void decrementCounterA() throws InterruptedException {

            int helperA;
            Thread.sleep(2000);
            helperA = counterA;
            helperA--;
            counterA = helperA;

    }

    public void decrementCounterB() throws InterruptedException {
        synchronized (locker2) {
            int helperB;
            Thread.sleep(500);
            helperB = counterB;
            helperB--;
            counterB = helperB;
        }
    }

    public int valueA() {
        return this.counterA;
    }

    public int valueB() {
        return this.counterB;
    }

}
