package Pertemuan11;

public class MahasiswaQueue {
    Mahasiswa15 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int nim, String nama) {
        Mahasiswa15 mhs = new Mahasiswa15(nim, nama, null);
        if (isEmpty()) {
            front = mhs;
            rear = mhs;
        } else {
            rear.next = mhs;
            rear = mhs;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean masih kosong, tidak dapat dihapus");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa15 tmp = front;
            System.out.println("Daftar Antrean : ");
            while (tmp != null) {
                System.out.println("NIM : " + tmp.nim + " Nama : " + tmp.nama);
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Antrean Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa yang paling depan: ");
            System.out.println("NIM: " + front.nim + " | Nama: " + front.nama);
        } else {
            System.out.println("Antrian kosong");
        }
    }
}
