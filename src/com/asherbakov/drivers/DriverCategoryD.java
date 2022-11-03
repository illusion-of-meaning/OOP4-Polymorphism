package com.asherbakov.drivers;

import com.asherbakov.transport.Bus;

public class DriverCategoryD<T extends Bus> extends Driver {

    public DriverCategoryD(String fullName, int experience) {
        super(fullName, experience);
    }


}
