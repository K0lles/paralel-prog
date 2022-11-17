package org.example;

public class Main extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Main.taskFifth();
    }

    public static void taskSecond() throws InterruptedException {
        Counter counter = new Counter();
        ProgramOne programOne = new ProgramOne(counter);
        ProgramOne programTwo = new ProgramOne(counter);
        System.out.println("PROGRAM STARTED");
        programOne.start();
        programTwo.start();
        programOne.join();
        programTwo.join();
        System.out.println("PROGRAM FINISHED");
    }

    public static void taskThird() throws InterruptedException {
        Counter counter = new Counter();
        ProgramTwo programOne = new ProgramTwo(counter);
        ProgramTwo programTwo = new ProgramTwo(counter);
        System.out.println("PROGRAM STARTED");
        programOne.start();
        programTwo.start();
        programOne.join();
        programTwo.join();
        System.out.println("PROGRAM FINISHED");
    }

    public static void taskFourth() throws InterruptedException {
        CounterSynchronizedMethods counter = new CounterSynchronizedMethods();
        ProgramTwo programOne = new ProgramTwo(counter);
        ProgramTwo programTwo = new ProgramTwo(counter);
        System.out.println("PROGRAM STARTED");
        programOne.start();
        programTwo.start();
        programOne.join();
        programTwo.join();
        System.out.println("PROGRAM FINISHED");
    }

    public static void taskFifth() throws InterruptedException {
        CounterSynchronizedExpression counter = new CounterSynchronizedExpression();
        ProgramThird programOne = new ProgramThird(counter);
        ProgramThird programTwo = new ProgramThird(counter);
        System.out.println("PROGRAM STARTED");
        programOne.start();
        programTwo.start();
        programOne.join();
        programTwo.join();
        System.out.println("PROGRAM FINISHED");
    }
}