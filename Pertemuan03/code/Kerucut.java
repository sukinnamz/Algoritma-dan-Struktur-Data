package Pertemuan03.code;

public class Kerucut {
    int jariJari;
    int sisiMiring;

    Kerucut(int j, int s) {
        jariJari = j;
        sisiMiring = s;
    }

    double hitungLuas() {
        return (3.14 * jariJari * sisiMiring) + (3.14 * jariJari * jariJari);
    }

    double hitungVolume() {
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
        System.out.println(tinggi);
        return (3.14 * jariJari * jariJari * tinggi) / 3;
    }
}
