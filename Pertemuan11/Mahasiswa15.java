package Pertemuan11;

public class Mahasiswa15 {
    int nim;
    String nama;
    Mahasiswa15 next;

    Mahasiswa15() {

    }

    Mahasiswa15(int nim, String nama, Mahasiswa15 berikutnya) {
        this.nim = nim;
        this.nama = nama;
        next = berikutnya;
    }
}
