package org.example;

public class SecondCounter {
    private final Object locker3 = new Object();
    private final Object locker4 = new Object();
    public int counterC = 0;
    public int counterD = 0;

    public void incrementCounterC() throws InterruptedException {
        synchronized (locker3) {
            int helperC;
            Thread.sleep(500);
            helperC = counterC;
            helperC++;
            counterC = helperC;
        }
    }

    public void incrementCounterD() throws InterruptedException {
        synchronized (locker4) {
            int helperD;
            Thread.sleep(500);
            helperD = counterD;
            helperD++;
            counterD = helperD;
        }
    }

    public void decrementCounterC() throws InterruptedException {
        synchronized (locker3) {
            int helperC;
            Thread.sleep(500);
            helperC = counterC;
            helperC--;
            counterC = helperC;
        }
    }

    public void decrementCounterD() throws InterruptedException {
        synchronized (locker4) {
            int helperD;
            Thread.sleep(500);
            helperD = counterD;
            helperD--;
            counterD = helperD;
        }
    }

    public int valueC() {
        return this.counterC;
    }

    public int valueD() {
        return this.counterD;
    }
}
