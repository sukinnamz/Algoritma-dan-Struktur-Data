package Pertemuan11;

public class MahasiswaLinkedListed {
    Mahasiswa15 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa15 tmp = head;
            // System.out.print("Isi Linked List \t");
            while (tmp != null) {
                System.out.print("NIM : " + tmp.nim + " Nama : " + tmp.nama + " | ");
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama) {
        Mahasiswa15 ndInput = new Mahasiswa15(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        Mahasiswa15 ndInput = new Mahasiswa15();
        ndInput.nim = nim;
        ndInput.nama = nama;
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Mahasiswa15 ndInput = new Mahasiswa15(nim, nama, null);
        Mahasiswa15 temp = head;
        do {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int nim, String nama) {
        if (index == -1) {
            addFirst(nim, nama);
        } else {
            Mahasiswa15 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Mahasiswa15(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}
