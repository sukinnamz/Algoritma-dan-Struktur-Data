package Pertemuan01.code;

import java.util.Scanner;

public class Tugas215 {
    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;

    public static void main(String[] args) {
        switch (menu()) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Invalid menu");
                break;
        }
    }

    public static int menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("==>");
        pilih = sc.nextInt();
        return pilih;
    }
}
