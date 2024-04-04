package Pertemuan08.code;

import java.util.Scanner;

public class Utama15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang : ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();
        Gudang15 gudang = new Gudang15(kapasitas);
        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Tampilkan barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang15 barangBaru = new Barang15(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Pilih tipe pencarian : ");
                    System.out.println("1. Cari dengan kode");
                    System.out.println("2. Cari dengan nama");
                    System.out.print("Pilihan : ");
                    int pilih2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Masukkan kode barang : ");
                            int cariKode = scanner.nextInt();
                            scanner.nextLine();
                            gudang.cariKode(cariKode);
                            break;
                        case 2:
                            System.out.print("Masukkan nama barang : ");
                            String cariNama = scanner.nextLine();
                            gudang.cariNama(cariNama);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
