package com.jad;

import com.jad.nfslist.Cell;
import com.jad.nfslist.Data;

public class Main {

    public static void main(String[] args) {
        Cell c1 = new Cell(new Data('A'));
        Cell c2 = new Cell(new Data('B'));
        Cell c3 = new Cell(new Data('C'));
        Cell c4 = new Cell(new Data('I'));
        c1.setNext(c2);
        c2.setNext(c3);
        c1.insertNext(c4);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
