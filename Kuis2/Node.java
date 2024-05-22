package Kuis2;

//Credit : Innama Maesa Putri
// Don't use w/o permission

public class Node {
    Pembalap pembalap;
    Node next;

    Node() {

    }

    Node(String nama, String tim, String konstruktor, int posisi, int match, Node berikutnya) {
        pembalap = new Pembalap(nama, tim, konstruktor, posisi, match);
        next = berikutnya;
    }
}
