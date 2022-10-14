package com.jad.vehicle;

public abstract class Vehicle {
    private final String name;

    protected Vehicle(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
