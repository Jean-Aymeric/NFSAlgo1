package com.jad.nfslist;

public class List<E> {
    private Cell<E> head;

    public List() {
        this.head = null;
    }

    public void add(final E value) {
        if (this.head == null) {
            this.head = new Cell<>(value);
        } else {
            Cell<E> temporaryCell = this.head;
            while (temporaryCell.getNext() != null) {
                temporaryCell = temporaryCell.getNext();
            }
            temporaryCell.setNext(new Cell<>(value));
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
            this.head = new Cell<>(value);
        } else {
            Cell<E> temporaryCell = new Cell<>(value);
            temporaryCell.setNext(this.head);
            this.head = temporaryCell;
        }
    }

    public E pop() {
        if (this.head == null) {
            return null;
        } else {
            Cell<E> temporaryCell = this.head;
            this.head = this.head.getNext();
            return temporaryCell.getData();
        }
    }

    public int count() {
        if (this.head == null) {
            return 0;
        } else {
            return this.head.count();
        }
    }
}
