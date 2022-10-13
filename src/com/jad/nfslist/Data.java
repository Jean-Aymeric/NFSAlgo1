package com.jad.nfslist;

public class Data {
    private final char value;

    public Data(final char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
