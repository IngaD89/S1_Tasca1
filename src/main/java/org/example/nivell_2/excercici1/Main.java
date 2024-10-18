package org.example.nivell_2.excercici1;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "A10");
        System.out.println(smartphone);
        smartphone.trucar("12345678");
        smartphone.fotografiar();
        smartphone.alarma();
    }
}
