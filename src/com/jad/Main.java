package com.jad;

import com.jad.nfslist.List;

public class Main {

    public static void main(String[] args) {
        List<Character> myList = new List<>();
        myList.add('A');
        myList.add('B');
        myList.add('C');
        System.out.println(myList);
        myList.push('I');
        System.out.println(myList);
        System.out.println(myList.pop()); // -> I
    }
}