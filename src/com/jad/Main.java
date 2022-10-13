package com.jad;

import com.jad.nfstree.Node;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Node<String> n1 = new Node("A", new Node("B", new Node("D"), new Node("E")), new Node("C", new Node("F"), new Node("G")));
        System.out.println(n1);
    }
}
