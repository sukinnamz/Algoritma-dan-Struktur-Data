package Pertemuan01.code;

import java.util.Scanner;

public class perulangan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        String lastTwoDigits = nim.substring(nim.length() - 2);
        int digitTerakhir = Integer.parseInt(lastTwoDigits);
        if (digitTerakhir < 10) {
            digitTerakhir += 10;
        }
        System.out.println("n = " + digitTerakhir);
        for (int i = 1; i <= digitTerakhir; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                if (i == 6 || i == 10) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}
