package org.example.nivell_1.exercici2;

public class Car {
    private static final String brand = "Car Brand";
    private static String model;
    private final double power;

    public Car(double power) {
        Car.model = "Modelo de coche";
        this.power = power;
    }

    public Car(String model, double power) {
        Car.model = model;
        this.power = power;
    }

    public static String getBrand(){
        return Car.brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public double getPower() {
        return power;
    }

    public static void frenar(){
        System.out.println("El vehicle està accelerant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }
}
