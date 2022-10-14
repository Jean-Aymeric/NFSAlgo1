package com.jad.vehicle;

import com.jad.parking.Parking;
import com.jad.parking.Parkingable;

public class Motorbike extends Vehicle implements Parkingable {
    public Motorbike() {
        super("Moto");
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
