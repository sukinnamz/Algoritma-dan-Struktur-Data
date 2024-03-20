package Pertemuan06.code;

public class MainHotel15 {
    public static void main(String[] args) {
        HotelService15 list = new HotelService15();
        Hotel15 h1 = new Hotel15("Hotel Cindy", "Kota Pasuruan", 1000000, (byte) 4);
        Hotel15 h2 = new Hotel15("Hotel Reika", "Kota Malang", 750000, (byte) 3);
        Hotel15 h3 = new Hotel15("Hotel Innam", "Kota Batu", 900000, (byte) 5);
        Hotel15 h4 = new Hotel15("Hotel Vira", "Kota Blitar", 500000, (byte) 3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);

        System.out.println("Menampilkan semua hotel");
        list.tampilAll();

        System.out.println("Urutan daftar hotel dengan harga terendah :");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Urutan daftar hotel dengan rating tertinggi : ");
        list.selectionSort();
        list.tampilAll();
    }

}
