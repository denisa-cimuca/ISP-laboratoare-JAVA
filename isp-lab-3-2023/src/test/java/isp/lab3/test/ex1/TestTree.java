package isp.lab3.test.ex1;

import isp.lab3.exercise1.Tree;

public class TestTree {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.grow(5);
        tree.grow(1);
        tree.grow(7);
        System.out.println(tree.toString());
    }
}
