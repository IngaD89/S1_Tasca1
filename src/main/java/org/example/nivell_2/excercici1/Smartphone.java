package org.example.nivell_2.excercici1;

public class Smartphone extends Phone implements Camera, Watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void trucar(String phoneNumber) {
        System.out.println("S'està trucant al numero de telefon " + phoneNumber);
    }


    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarma() {

        System.out.println("Està sonant l’alarma");

    }
}
