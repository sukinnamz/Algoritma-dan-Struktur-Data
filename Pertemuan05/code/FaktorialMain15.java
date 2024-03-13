package Pertemuan05.code;

import java.util.Scanner;

public class FaktorialMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int iJml = sc.nextInt();
        Faktorial15[] fk = new Faktorial15[iJml];

        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial15();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < fk.length; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Bruce Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < fk.length; i++) {
            System.out.println(
                    "Hasil penghitungan menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
