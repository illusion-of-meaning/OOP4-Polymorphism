package com.asherbakov.drivers;

import com.asherbakov.transport.Train;

public class DriverCategoryC<T extends Train> extends Driver {

    public DriverCategoryC(String fullName, int experience) {
        super(fullName, experience);
    }

}
