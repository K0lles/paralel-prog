package org.example;

public class Main extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Main.firstTask();
    }

    public static void firstTask() throws InterruptedException {
        FirstCounter firstCounter = new FirstCounter();
        ProgramOne programOne = new ProgramOne(firstCounter);
        ProgramTwo programTwo = new ProgramTwo(firstCounter);

        programOne.start();
        programTwo.start();
        programOne.join();
        programTwo.join();
    }
}