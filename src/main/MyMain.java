package main;
import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(11);
        tree.insert(2);
        tree.insert(7);
        tree.insert(15);
        tree.inOrder(tree.getRoot());
        tree.insert(35);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(20));
        System.out.println(tree.search(52));



    }
}
