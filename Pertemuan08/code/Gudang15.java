package Pertemuan08.code;

public class Gudang15 {
    Barang15 tumpukan[];
    int size, top;

    Gudang15(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang15[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(Barang15 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang15 ambilBarang() {
        if (!cekKosong()) {
            Barang15 delete = tumpukan[top];
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner : " + KonversiDesimalKeBiner(delete.kode));
            top--;
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang15 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang15 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang15 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang15 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String KonversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang15 cariKode(int kode) {
        if (!cekKosong()) {
            int pos = -1;
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].kode == kode) {
                    pos = i;
                    break;
                } else {
                    System.out.println("Barang dengan kode " + kode + " tidak ditemukan");
                    return null;
                }
            }
            System.out.println("Barang yang anda cari dengan kode " + kode + " adalah " + tumpukan[pos].nama
                    + " dengan kategori " + tumpukan[pos].kategori);
            return tumpukan[pos];
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang15 cariNama(String nama) {
        if (!cekKosong()) {
            int pos = -1;
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].nama.equals(nama)) {
                    pos = i;
                    break;
                } else {
                    System.out.println("Barang dengan nama " + nama + " tidak ditemukan");
                    return null;
                }
            }
            System.out.println("Barang yang anda cari dengan nama " + nama + " dengan kode " + tumpukan[pos].kode
                    + " dengan kategori " + tumpukan[pos].kategori);
            return tumpukan[pos];
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
}
