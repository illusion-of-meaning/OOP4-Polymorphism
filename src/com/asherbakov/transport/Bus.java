package com.asherbakov.transport;

import com.asherbakov.interfaces.Compating;

public class Bus extends Transport implements Compating {

    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("Автобус на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для автобуса - 5:20");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автобуса: 105 км/ч");
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getBrand(), super.getModel());
    }
}
