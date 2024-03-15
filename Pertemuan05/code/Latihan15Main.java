package Pertemuan05.code;

public class Latihan15Main {
        public static void main(String[] args) {
                double top_acceleration[] = { 6816, 3921, 4320, 4058, 6255, 3700, 4180, 4180 },
                                top_power[] = { 728, 575, 657, 609, 703, 553, 609, 631 },
                                total = 0;

                Latihan15 objek = new Latihan15();
                System.out.println("Nilai tertinggi top acceleration : "
                                + objek.TinggiDC(top_acceleration, 0, top_acceleration.length - 1));
                System.out.println("Nilai terendah top acceleration : "
                                + objek.RendahDC(top_acceleration, 0, top_acceleration.length - 1));
                System.out.println("Nilai rata-rata top power : "
                                + objek.JumlahBF(top_power, total));
        }
}
