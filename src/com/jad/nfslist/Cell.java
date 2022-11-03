package com.jad.nfslist;

class Cell<E> {
    private final E data;
    private Cell next;

    public Cell(final E data) {
        this.data = data;
        this.next = null;
    }
    public E getData() {
        return this.data;
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

    public int count() {
        return (this.getNext() == null) ? 1 : (1 + this.getNext().count());
    }
}
