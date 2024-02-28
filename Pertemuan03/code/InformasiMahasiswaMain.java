package Pertemuan03.code;

import java.util.Scanner;

public class InformasiMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        InformasiMahasiswa[] mhs = new InformasiMahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new InformasiMahasiswa();
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama : ");
            mhs[i].nama = sa.nextLine();
            System.out.print("Masukkan nim : ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            mhs[i].jenis_kelamin = sa.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs[i].ipk = sc.nextDouble();
        }
        System.out.println();
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mhs[i].nama);
            System.out.println("Nim : " + mhs[i].nim);
            System.out.println("Jenis Kelamin : " + mhs[i].jenis_kelamin);
            System.out.println("Nilai IPK : " + mhs[i].ipk);
        }

    }
}
