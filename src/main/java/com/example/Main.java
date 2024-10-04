package com.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        //inizializzazione
        Cestino c1 = new Cestino(0);
        Persona p1 = new Persona(c1,1000);
        Persona p2 = new Persona(c1,1000);

        //lancio i thread
        p1.start();
        p2.start();

        //Join dei due thread
        p1.join();
        p2.join();

        //visualizzaione a schermo delle monete "Lanciate"
        System.out.println(c1.getContatore());
    }
}