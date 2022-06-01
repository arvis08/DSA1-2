package com.company.OOPS.vehicle;

public class Cycle extends Vehicle{

    boolean hasGears;
    boolean mudguard;

    public Cycle(int wheels, int seater, int weight,
                 boolean hasGears,boolean mudguard) {
        super(wheels, seater, weight);
        this.hasGears=hasGears;
        this.mudguard=mudguard;
    }

    public void start(){
        System.out.println("Paddling the paddles.");
        super.start();
    }

    public void stop(){
        System.out.println("Cycle is stopping");
    }
}
