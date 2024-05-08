package Pertemuan11;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        MahasiswaQueue mhs = new MahasiswaQueue();
        int menu = 0;
        do {
            System.out.println("=================================");
            System.out.println("Layanan Unit Kemahasiswaan");
            System.out.println("=================================");
            System.out.println("1. Tambah antrean");
            System.out.println("2. Keluarkan antrean");
            System.out.println("3. Lihat seluruh antrean");
            System.out.println("4. Lihat antrean terdepan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : -> ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nim : ");
                    int nim = sc.nextInt();
                    System.out.print("Masukkan nama : ");
                    String nama = sa.nextLine();
                    mhs.enqueue(nim, nama);
                    break;
                case 2:
                    System.out.println("Data dengan nim " + mhs.front.nim + " dan nama " + mhs.front.nama
                            + " berhasil keluar antrean.");
                    mhs.dequeue();
                    break;
                case 3:
                    mhs.print();
                    break;
                case 4:
                    mhs.peek();
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
        } while (menu == 1 || menu == 2 || menu == 3 || menu == 4);
    }
}
