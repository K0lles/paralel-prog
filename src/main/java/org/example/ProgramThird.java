package org.example;

public class ProgramThird extends Thread {
    public CounterSynchronizedExpression firstCounter;

    public ProgramThird(CounterSynchronizedExpression firstCounter) {
        this.firstCounter = firstCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                this.firstCounter.incrementCounterA();
                this.firstCounter.incrementCounterB();
                System.out.println("Counter A: " + this.firstCounter.counterA);
                System.out.println("Counter B: " + this.firstCounter.counterB);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
