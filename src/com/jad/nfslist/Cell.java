package com.jad.nfslist;

public class Cell {
    private final Data data;
    private Cell next;

    public Cell(final Data data) {
        this.data = data;
        this.next = null;
    }

    public Data getData() {
        return data;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(final Cell next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data.toString() + ((this.getNext() == null) ? "" : "->" + this.getNext().toString());
    }

    public void insertNext(final Cell next) {
        // To do
    }

    public void deleteByRank(int rank) {
        // To do
    }
}
