package Kuis1.code;

import java.util.Scanner;

public class MainPhytagoras {
    public static void main(String[] args) {
        Phytagoras[] list = new Phytagoras[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print("Masukkan alas : ");
            int alas = sc.nextInt();
            System.out.print("Masukkan tinggi : ");
            int tinggi = sc.nextInt();
            list[i] = new Phytagoras(alas, tinggi);
        }
        System.out.println("=======================");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Sisi miring : " + list[i].hitungSisiMiring());
            System.out.println("Keliling : " + list[i].hitungKeliling());
            System.out.println("Luas : " + list[i].hitungLuas());
        }
    }
}
