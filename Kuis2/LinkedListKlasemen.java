package Kuis2;

public class LinkedListKlasemen {

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void printKlasemen() {
        if (!isEmpty()) {
            sortKlasemen();
            Node tmp = head;
            int klasemen = 1;
            int indexPoin = 0;
            System.out
                    .println(String.format("%-4s %-30s %-30s %-15s %-10s %-22s %-10s", "No", "Nama", "Tim",
                            "Konstruktor", "Posisi",
                            "Poin Pertandingan", "Poin total"));
            System.out.println(
                    "================================================================================================================================");
            while (tmp != null) {
                System.out
                        .println(String.format("%-4d %-30s %-30s %-15s %-10d %-22d %-10d", klasemen, tmp.pembalap.nama,
                                tmp.pembalap.tim, tmp.pembalap.konstruktor, tmp.pembalap.posisi,
                                tmp.pembalap.poin,
                                tmp.pembalap.poinTotal));
                tmp = tmp.next;
                klasemen++;
                indexPoin++;
            }
            System.out.println();
        } else {
            System.out.println("Belum ada pertandingan");
        }
    }

    void tambahPembalap(String nama, String tim, String konstruktor) {
        Node newNode = new Node();
        newNode.pembalap = new Pembalap(nama, tim, konstruktor, 0, 0);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void updatePoin(String nama, int posisi, int match) {
        Node temp = head;
        while (temp != null) {
            if (temp.pembalap.nama.equals(nama)) {
                temp.pembalap.posisi = posisi;
                temp.pembalap.match = match;
                temp.pembalap.hitungPoinTotal(temp.pembalap.addPoint());
                return;
            }
            temp = temp.next;
        }
        System.out.println("Pembalap " + nama + " tidak ditemukan.");
    }

    void sortKlasemen() {
        if (!isEmpty()) {
            Node current = head;
            Pembalap temp;
            while (current != null) {
                Node index = current.next;
                while (index != null) {
                    if (current.pembalap.poinTotal < index.pembalap.poinTotal) {
                        temp = current.pembalap;
                        current.pembalap = index.pembalap;
                        index.pembalap = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}
