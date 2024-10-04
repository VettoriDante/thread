package com.example;

public class Persona extends Thread{
    //dichiarazione variabili
    private Cestino cestino;
    private int monete;

    //Costruttore
    public Persona(Cestino cestino, int monete) {
        this.cestino = cestino;
        this.monete = monete;
    }

    //Lancio delle monete
    @Override
    public void run() {
        for(int i = 0; i < monete; i++){
            cestino.addMoneta();
        }
    }
    
    
}
