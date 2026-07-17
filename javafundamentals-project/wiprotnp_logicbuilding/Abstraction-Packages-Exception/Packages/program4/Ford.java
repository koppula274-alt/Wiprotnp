package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39LG1234";
    }

    @Override
    public String getOwnerName() {
        return "Nagamani";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        System.out.println("GPS facility is available.");
        return 1;
    }
}