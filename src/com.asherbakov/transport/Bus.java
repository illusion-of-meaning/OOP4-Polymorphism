package com.asherbakov.transport;

public class Bus extends Transport{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {

    }

    @Override
    protected void stopMoving() {

    }
}
