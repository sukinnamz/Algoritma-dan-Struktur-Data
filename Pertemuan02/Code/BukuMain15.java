public class BukuMain15 {
    public static void main(String[] args) {
        Buku15 bk1 = new Buku15();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku15 bkInnama = new Buku15("Biografi Innama Maesa", "Innama Maesa", 100, 50, 73000);
        bkInnama.tampilInformasi();
        bkInnama.terjual(10);
        System.out.println("Harga total : " + bkInnama.hitungHargaTotal());
        System.out.println("Harga diskon : " + bkInnama.hitungDiskon());
        System.out.println("Harga bayar : " + bkInnama.hitungHargaBayar());
    }
}
