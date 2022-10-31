package com.asherbakov.transport;

import com.asherbakov.interfaces.Compating;

public class Car extends Transport implements Compating {

    public Car(String brand, String model, double engineVolume) {
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
        System.out.println("Легковой автомобиль на пит-стопе");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для легкового автомобиля - 3:59");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля: 180 км/ч");
    }
}
