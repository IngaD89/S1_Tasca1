package org.example.nivell_1.exercici2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esto es un metodo estatico");
        Car.frenar();
        System.out.println("----------------------------");

        System.out.println("Esto es un metodo no estatico");
        Car car = new Car(16.8);
        car.accelerar();
    }
}
