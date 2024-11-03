package org.example.nivell_1.exercici1;


public class Main {
    public static void main(String[] args) {

        WindInstrument windInstrument = new WindInstrument("wind", 32.89);
        System.out.println(windInstrument);
        windInstrument.play();

        StringInstrument stringInstrument = new StringInstrument("string instrument", 180.90);
        System.out.println(stringInstrument);
        stringInstrument.play();

        PercussionInstrument percussionInstrument = new PercussionInstrument("percussion", 120.65);
        System.out.println(percussionInstrument);
        percussionInstrument.play();
    }
}