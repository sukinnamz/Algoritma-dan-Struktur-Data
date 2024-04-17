package UTS.code;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = { 46, 25, 39, 23, 11, 37, 19, 31, 29, 20, 22, 33, 22, 32, 10, 23, 11 };
        // System.out.println(data.length); saya ngecek panjang datanya apa sudah sesuai

        Pengurutan15 innam = new Pengurutan15(data);
        System.out.println("Data yang tersedia : ");
        innam.tampilData();
        System.out.println("===========  Pencarian ===========");
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();
        System.out.println("Hasil pencarian index sebelum diurutkan : ");
        innam.tampilPosisiIndex(innam.BinarySearchAC(cari, 0, data.length - 1));
        System.out.println("Hasil pencarian index setelah pengurutan ascending :");
        innam.insertionSortAC();
        innam.tampilData();
        innam.tampilPosisiIndex(innam.BinarySearchAC(cari, 0, data.length - 1));
        System.out.println("Hasil pencarian index setelah pengurutan descending");
        innam.insertionSortDC();
        innam.tampilData();
        innam.tampilPosisiIndex(innam.BinarySearchDC(cari, 0, data.length - 1));
    }
}
