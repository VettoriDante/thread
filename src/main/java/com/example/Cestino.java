package com.example;

public class Cestino {
    //dichiarazione variabili
    private int contatore;

    //costruttore
    public Cestino(int contatore) {
        this.contatore = contatore;
    }

    //metodo per aumentare di 1 il valore di ontatore
    public void addMoneta(){
        contatore++;
    }

    //get
    public int getContatore() {
        return contatore;
    }
    
}
