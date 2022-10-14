package com.jad.vehicle;

import com.jad.parking.Parking;
import com.jad.parking.Parkingable;

public class Car extends Vehicle implements Parkingable {
    public Car() {
        super("Voiture");
    }

    @Override
    public void park(final Parking parking) {
        System.out.println("je me gare");
    }

    @Override
    public void unPark() {
        System.out.println("je me dégare");
    }
}
