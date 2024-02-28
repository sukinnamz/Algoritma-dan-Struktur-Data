package Pertemuan03.code;

import java.lang.Math;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}
