package Pertemuan03.code;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int panjangArray = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];

        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 14;
        ppArray[0].lebar = 12;

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
}
