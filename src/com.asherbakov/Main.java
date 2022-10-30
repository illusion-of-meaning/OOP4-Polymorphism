package com.asherbakov;

import com.asherbakov.transport.Bus;
import com.asherbakov.transport.Car;
import com.asherbakov.transport.Train;
import com.asherbakov.transport.Transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЗ 1, задание 1 ===");
        Transport car1 = new Car("Lada", "Vesta Sport", 1.8);
        Transport car2 = new Car("Lada", "Granta Drive Active", 1.6);
        Transport car3 = new Car("Nissan", "Skyline GT-R", 2.6);

        Transport bus1 = new Bus("ПАЗ", "320530/40-02", 4.6);
        Transport bus2 = new Bus("ПАЗ", "320530/40-04", 4.4);
        Transport bus3 = new Bus("ПАЗ", "320425-04 Vector NEXT", 4.4);

        Transport train1 = new Train("КАМАЗ", "5490", 11.7);
        Transport train2 = new Train("УРАЛ", "4320", 10.8);
        Transport train3 = new Train("УРАЛ", "NEXT", 11.7);
    }
}
