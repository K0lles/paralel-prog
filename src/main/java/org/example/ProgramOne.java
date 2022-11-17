package org.example;

public class ProgramOne extends Thread{
    public Counter firstCounter;

    public ProgramOne(Counter firstCounter) {
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
    }
}
