package com.asherbakov.drivers;

import com.asherbakov.transport.Car;
import com.asherbakov.transport.enums.RightsCategory;

public class DriverCategoryB<T extends Car> {
    final String NO_NAME = "Водитель пожелал остаться неизвестным";
    private String fullName;
    private RightsCategory rightsCategory;
    private int experience;

    public DriverCategoryB(String fullName, int experience) {
        if (fullName != null && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            this.fullName = NO_NAME;
        }
        setExperience(experience);
    }

    public void start() {
        System.out.println("Начало движения");
    }

    public void stop() {
        System.out.println("Остановка");
    }

    public void fuel() {
        System.out.println("Заправить автомобиль");
    }

    public void race(T car) {
        System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), car.toString()));
    }

    public String getFullName() {
        return fullName;
    }

    public RightsCategory getRightsCategory() {
        return rightsCategory;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = 1;
        }
    }
}
