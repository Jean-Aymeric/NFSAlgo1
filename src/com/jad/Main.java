package com.jad;

import com.jad.nfslist.Cell;

public class Main {

    public static void main(String[] args) {
        Cell c1 = new Cell<Character>('A');
        Cell c2 = new Cell<Character>('B');
        Cell c3 = new Cell<Character>('C');

        Cell c4 = new Cell<Character>('I');
        c1.setNext(c2);
        c2.setNext(c3);
        c1.push(c4);

        System.out.println(c1.toString());
        // A, I, B, C

        // A, I, C
    }
}