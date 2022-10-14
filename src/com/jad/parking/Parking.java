package com.jad.parking;

import java.util.ArrayList;

public class Parking {
    private final ArrayList<Parkingable> vehicles;

    public Parking() {
        this.vehicles = new ArrayList<>();
    }

    public void add(Parkingable vehicle) {
        this.vehicles.add(vehicle);
        vehicle.park(this);
    }
}
