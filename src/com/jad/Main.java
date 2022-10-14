package com.jad;

import com.jad.nfstree.Node;
import com.jad.parking.Parking;
import com.jad.vehicle.Bike;
import com.jad.vehicle.Car;
import com.jad.vehicle.Tank;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Parking myParking = new Parking();
        Car twingo = new Car();
        Bike titine = new Bike();
        Tank leclerc = new Tank();

        myParking.add(twingo);
        myParking.add(titine);
        //myParking.add(leclerc);
    }
}
