package Pertemuan14.Praktikum1;

public class Node {
    int data;
    Node left;
    Node right;

    public Node() {
    }

    Node(Node left, int data, Node right) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}