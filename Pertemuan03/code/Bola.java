package Pertemuan03.code;

public class Bola {
    int jariJari;

    Bola(int j) {
        jariJari = j;
    }

    double hitungLuas() {
        return 4 * 3.14 * jariJari * jariJari;
    }

    double hitungVolume() {
        return 4 / 3 * 3.14 * jariJari * jariJari * jariJari;
    }
}
