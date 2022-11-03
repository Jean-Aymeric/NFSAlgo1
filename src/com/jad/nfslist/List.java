package com.jad.nfslist;

public class List<E> {
    private Cell<E> head;

    public List() {
        this.head = null;
    }

    public void add(final E value) {
        if (this.head == null) {
            this.head = new Cell<E>(value);
        } else {
            Cell temporaryCell = this.head;
            while (temporaryCell.getNext() != null) {
                temporaryCell = temporaryCell.getNext();
            }
            temporaryCell.setNext(new Cell<E>(value));
        }
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return "";
        } else {
            return this.head.toString();
        }
    }

    public void push(final E value) {
        if (this.head == null) {
            this.head = new Cell<E>(value);
        } else {
            Cell temporaryCell = new Cell<E>(value);
            temporaryCell.setNext(this.head);
            this.head = temporaryCell;
        }
    }

    public E pop() {
        return null;
    }
}
