package com.company.OOPS.vehicle;

public abstract class Vehicle{

    public int wheels;
    public int seater;
    public int weight;

    public Vehicle(int wheels, int seater, int weight) {
        this.wheels = wheels;
        this.seater = seater;
        this.weight = weight;
    }

    public void start(){
        System.out.println("Vehicle is going to start......");
    }

    public abstract void stop();

    public int getWheel(){
        return this.wheels;
    }

}
