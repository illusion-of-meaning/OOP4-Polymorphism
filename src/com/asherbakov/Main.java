package com.asherbakov;

import com.asherbakov.drivers.Driver;
import com.asherbakov.drivers.DriverCategoryB;
import com.asherbakov.drivers.DriverCategoryC;
import com.asherbakov.drivers.DriverCategoryD;
import com.asherbakov.transport.Bus;
import com.asherbakov.transport.Car;
import com.asherbakov.transport.Train;
import com.asherbakov.transport.Transport;

public class Main {
    public static void main(String[] args) {
        // === ДЗ 1 ===
        Car car1 = new Car("Lada", "Vesta Sport", 1.8);
        Transport car2 = new Car("Lada", "Granta Drive Active", 1.6);
        Transport car3 = new Car("Nissan", "Skyline GT-R", 2.6);

        Transport bus1 = new Bus("ПАЗ", "320530/40-02", 4.6);
        Transport bus2 = new Bus("ПАЗ", "320530/40-04", 4.4);
        Transport bus3 = new Bus("ПАЗ", "320425-04 Vector NEXT", 4.4);

        Transport train1 = new Train("КАМАЗ", "5490", 11.7);
        Transport train2 = new Train("УРАЛ", "4320", 10.8);
        Transport train3 = new Train("УРАЛ", "NEXT", 11.7);

        // === ДЗ 4 ===
        System.out.println("Группа категории B:");
        DriverCategoryB<Car> anton = new DriverCategoryB<Car>("Антон", 5);
        anton.race(car1);
        DriverCategoryB<Car> nikolay = new DriverCategoryB<Car>("Николай", 8);
        nikolay.race(car2);
        DriverCategoryB<Car> vladislav = new DriverCategoryB<Car>("Владислав", 6);
        vladislav.race(car3);

        System.out.println("\nГруппа категории C:");
        Driver<Train> maxim = new DriverCategoryC<Train>("Максим", 7);
        maxim.race((Train) train1);
        Driver<Train> oxana = new DriverCategoryC<Train>("Оксана", 8);
        oxana.race(null);
        Driver<Train> ilya = new DriverCategoryC<Train>("Илья", 9);
        ilya.race((Train) train3);

        System.out.println("\nГруппа категории D:");
        Driver<Bus> semen = new DriverCategoryD<Bus>("Семен", 7);
        semen.race((Bus) bus1);
        Driver<Bus> irina = new DriverCategoryD<Bus>("Ирина", 8);
        irina.race((Bus) bus2);
        Driver<Bus> alexandr = new DriverCategoryD<Bus>("Александр", 9);
        alexandr.race((Bus) bus3);

    }
}
