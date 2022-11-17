package org.example;

public class ProgramTwo extends Thread{
    private Counter firstCounter;

    public ProgramTwo(Counter firstCounter) {
        this.firstCounter = firstCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                this.firstCounter.increment();
                System.out.println("Counter: " + this.firstCounter.value());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 6; i++) {
            try {
                this.firstCounter.decrement();
                System.out.println("Counter: " + this.firstCounter.value());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
