package com.example;

public class MioThread implements Runnable {
    private int l; 

    public MioThread(int lenght){
        this.l = lenght;
    }

    @Override
    public void run() {
        for(int i = 0; i<= this.l; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
