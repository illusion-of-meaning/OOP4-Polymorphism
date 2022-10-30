package com.asherbakov.transport;

public class Train extends Transport{

    public Train(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {

    }

    @Override
    protected void stopMoving() {

    }
}
