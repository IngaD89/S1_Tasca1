package org.example.nivell_1.excercici1;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}
