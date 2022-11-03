package com.asherbakov.drivers;

import com.asherbakov.transport.Car;

public class DriverCategoryB<T extends Car> extends Driver {
    public DriverCategoryB(String fullName, int experience) {
        super(fullName, experience);
    }
}
