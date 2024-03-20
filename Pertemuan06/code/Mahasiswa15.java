package Pertemuan06.code;

public class Mahasiswa15 {
    String nama;
    int tahunMasuk, umur;
    double ipk;

    Mahasiswa15(String n, int t, int u, double i){
        nama = n;
        tahunMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Umur : " + umur);
        System.out.println("IPK : " + ipk);
    }
}
