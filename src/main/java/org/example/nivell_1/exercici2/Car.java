package org.example.nivell_1.exercici2;

public class Car {
    private static final String BRAND = "Car Brand";
    private static String model = "Modelo de coche";
    private final double power;

    public Car(double power) {
        this.power = power;
    }

    public static String getBrand(){
        return Car.BRAND;
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

    public static void brakeCar(){
        System.out.println("El vehicle està accelerant");
    }

    public void accelerate(){
        System.out.println("El vehicle està accelerant");
    }
}
