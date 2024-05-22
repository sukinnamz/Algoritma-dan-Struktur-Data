package Kuis2;

//Credit : Innama Maesa Putri
// Don't use w/o permission

public class Pembalap {
    String nama, tim, konstruktor;
    int poinTotal = 0, posisi, match, poin;
    int[] kumpulanPoin = new int[20];

    Pembalap(String nama, String tim, String konstruktor, int posisi, int match) {
        this.nama = nama;
        this.tim = tim;
        this.konstruktor = konstruktor;
        this.posisi = posisi;
        this.match = match;
    }

    void addPoint() {
        switch (posisi) {
            case 1:
                poin = 25;
                break;
            case 2:
                poin = 20;
                break;
            case 3:
                poin = 16;
                break;
            case 4:
                poin = 13;
                break;
            case 5:
                poin = 11;
                break;
            case 6:
                poin = 10;
                break;
            case 7:
                poin = 9;
                break;
            case 8:
                poin = 8;
                break;
            case 9:
                poin = 7;
                break;
            case 10:
                poin = 6;
                break;
            case 11:
                poin = 5;
                break;
            case 12:
                poin = 4;
                break;
            case 13:
                poin = 3;
                break;
            case 14:
                poin = 2;
                break;
            case 15:
                poin = 1;
                break;
            default:
                poin = 0;
                break;
        }
        kumpulanPoin[match] = poin;
    }

    void hitungPoinTotal() {
        for (int i = 0; i < kumpulanPoin.length; i++) {
            poinTotal += kumpulanPoin[i];
        }
    }

}
