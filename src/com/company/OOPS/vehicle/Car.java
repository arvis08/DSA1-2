package com.company.OOPS.vehicle;

public class Car extends Vehicle{

    String type;
    boolean hasABS;
    boolean hasAirbags;


    public Car(int wheels, int seater, int weight,
               String type, boolean hasABS, boolean hasAirbags) {
        super(wheels, seater, weight);
        this.type=type;
        this.hasABS=hasABS;
        this.hasAirbags=hasAirbags;
    }
    public void start(){
        System.out.println("Ignition of the engine.");
        super.start();
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
}
