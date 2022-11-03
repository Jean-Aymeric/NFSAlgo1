package com.jad;

import com.jad.nfslist.List;
import com.jad.nfstree.AVLTree;
import com.jad.nfstree.BinaryTree;
import com.jad.nfstree.SenseOfRotation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AVLTree<String> t2 = new AVLTree<>();
        t2.add("A");
        t2.add("B");
        t2.add("C");
        t2.add("D");
        System.out.println(t2 + " hauteur : " + t2.getHeight() + " nb : " + t2.count());
        t2.rotate("B", SenseOfRotation.Left);
        System.out.println(t2 + " hauteur : " + t2.getHeight() + " nb : " + t2.count());
    }
}