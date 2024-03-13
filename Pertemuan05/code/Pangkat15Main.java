package Pertemuan05.code;

import java.util.Scanner;

public class Pangkat15Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih menu : ");
        System.out.println("1. Brute Force");
        System.out.println("2. Devide Conquer");
        System.out.print("==> ");
        int menu = sc.nextInt();

        System.out.println("===========================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat15[] png = new Pangkat15[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat15(nilai, pangkat);
        }

        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUITE FORCE");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Menu Invalid!");
                break;
        }
        // System.out.println("HASIL PANGKAT - BRUITE FORCE");
        // for (int i = 0; i < png.length; i++) {
        // System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
        // png[i].pangkat + " adalah "
        // + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        // }
        // System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        // for (int i = 0; i < png.length; i++) {
        // System.out.println("Hasil dari " + png[i].nilai + " pangkat " +
        // png[i].pangkat + " adalah "
        // + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        // }
    }
}
