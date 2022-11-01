package com.asherbakov.drivers;

import com.asherbakov.transport.Bus;
import com.asherbakov.transport.enums.RightsCategory;

public class DriverCategoryD<T extends Bus> {
    final String NO_NAME = "Водитель пожелал остаться неизвестным";
    private String fullName;
    private RightsCategory rightsCategory;
    private int experience;

    public DriverCategoryD(String fullName, int experience) {
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

    public void race(T bus) {
        System.out.println(String.format("Водитель %s управляет автомобилем '%s' и будет участвовать в заезде.", getFullName(), bus.toString()));
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
