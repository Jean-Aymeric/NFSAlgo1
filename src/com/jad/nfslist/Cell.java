package com.jad.nfslist;

public class Cell {
    private final Data data;
    private Cell next;
    private static final String bidule = "Un Truc En dur Dans la classe";

    public Cell(final Data data) {
        this.data = data;
        this.next = null;
    }

    public Cell(final char value) {
        this.data = new Data(value);
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
        next.setNext(this.getNext());
        this.setNext(next);
    }

    public void deleteByRank(int rank) {
        Cell temporaryCell = this;
        int i;
        for (i = 0; i < (rank-1) && temporaryCell.getNext() != null; i++) {
            temporaryCell = temporaryCell.getNext();
        }
        if ((i == rank-1) && (temporaryCell.getNext() != null)) {
            Cell cellToDelete = temporaryCell.getNext();
            temporaryCell.setNext(temporaryCell.getNext().getNext());
            cellToDelete.setNext(null);
        }
    }

    public void push(final Cell cellToPush) {
        // To do
    }

    public void pop(final Cell cellToPush) {
        // To do
    }

}
