package org.example;

public class ProgramTwo extends Thread{
    private FirstCounter firstCounter;

    public ProgramTwo(FirstCounter firstCounter) {
        this.firstCounter = firstCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                this.firstCounter.incrementCounterA();
                System.out.println("Counter: " + this.firstCounter.counterA);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 6; i++) {
            try {
                this.firstCounter.decrementCounterA();
                System.out.println("Counter: " + this.firstCounter.counterA);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
