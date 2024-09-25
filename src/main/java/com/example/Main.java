package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        MioThread t1 = new MioThread(10);
        MioThread t2 = new MioThread(10);
        new Thread(t1).start();
        new Thread(t2).start();

    }
}