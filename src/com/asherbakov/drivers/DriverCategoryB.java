package com.asherbakov.drivers;

import com.asherbakov.transport.Car;

public class DriverCategoryB<T extends Car> extends Driver {

    public DriverCategoryB(String fullName, int experience) {
        super(fullName, experience);
    }

    public void race(T transport) {
        System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), transport.toString()));
    }

}
