package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09FD5678";
    }

    @Override
    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 150;
    }

    public int tempControl() {
        System.out.println("Air Conditioning facility is available.");
        return 1;
    }
}