package org.example.nivell_1.exercici1;

public class PercussionInstrument extends Instrument{

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
