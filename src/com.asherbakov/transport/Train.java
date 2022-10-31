package com.asherbakov.transport;

import com.asherbakov.interfaces.Compating;

public class Train extends Transport implements Compating {

    public Train(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {

    }

    @Override
    protected void stopMoving() {

    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для грузовика - 5:09");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость грузовика: 108 км/ч");
    }
}
