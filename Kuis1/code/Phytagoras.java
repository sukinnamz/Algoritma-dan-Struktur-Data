package Kuis1.code;

public class Phytagoras {
    public int alas, tinggi;

    Phytagoras(int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungSisiMiring() {
        return Math.sqrt(Math.pow(alas, 2) + (Math.pow(tinggi, 2)));
    }

    double hitungKeliling() {
        return alas + tinggi + hitungSisiMiring();
    }

    double hitungLuas() {
        return alas * tinggi / 2;
    }
}
