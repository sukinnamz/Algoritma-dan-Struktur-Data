package Pertemuan01.code;

import java.util.Scanner;

public class pemilihan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = sc.nextInt();
        Boolean isValid = true;
        if (tugas < 0 || tugas > 100) {
            isValid = false;
        }
        System.out.print("Masukkan Nilai Kuis : ");
        double kuis = sc.nextInt();
        if (kuis < 0 || kuis > 100) {
            isValid = false;
        }
        System.out.print("Masukkan Nilai UTS : ");
        double uts = sc.nextInt();
        if (uts < 0 || uts > 100) {
            isValid = false;
        }
        System.out.print("Masukkan Nilai UAS : ");
        double uas = sc.nextInt();
        if (uas < 0 || uas > 100) {
            isValid = false;
        }
        System.out.println("==============================");
        System.out.println("==============================");
        if (isValid) {
            double total = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            System.out.println("Nilai akhir : " + total);
            Boolean isLulus = true;
            if (total <= 100 && total > 80) {
                System.out.println("Nilai huruf : A");
            } else if (total <= 80 && total > 73) {
                System.out.println("Nilai huruf : B+");
            } else if (total <= 73 && total > 65) {
                System.out.println("Nilai huruf : B");
            } else if (total <= 65 && total > 60) {
                System.out.println("Nilai huruf : C+");
            } else if (total <= 60 && total > 50) {
                System.out.println("Nilai huruf : C");
            } else if (total <= 50 && total > 39) {
                isLulus = false;
                System.out.println("Nilai huruf : D");
            } else {
                isLulus = false;
                System.out.println("Nilai huruf : E");
            }
            System.out.println("==============================");
            System.out.println("==============================");
            if (isLulus) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
