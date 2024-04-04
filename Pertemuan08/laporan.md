# Laporan Jobsheet VII Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>
## Percobaan 1
<p>Kode Program : </p>

```
Barang15.java

package Pertemuan08.code;

public class Barang15 {
    int kode;
    String nama, kategori;

    Barang15(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}
```
```
Gudang15.java

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
}

```
```
Utama15.java

package Pertemuan08.code;

import java.util.Scanner;

public class Utama15 {
    public static void main(String[] args) {
        Gudang15 gudang = new Gudang15(7);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
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
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}

```
<p>Hasil Program : </p>

``` 
Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi : 1
Masukkan kode barang : 21
Masukkan nama barang : Majalah 
Masukkan nama kategori : Buku
Barang Majalah berhasil ditambahkan ke gudang

Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi : 1
Masukkan kode barang : 26
Masukkan nama barang : Jaket
Masukkan nama kategori : Pakaian
Barang Jaket berhasil ditambahkan ke gudang

Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi : 2
Barang Jaket diambil dari gudang

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi : 1
Masukkan kode barang : 33
Masukkan nama barang : Pizza
Masukkan nama kategori : Makanan
Barang Pizza berhasil ditambahkan ke gudang

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Keluar
Pilih operasi : 3
Rincian tumpukan barang di Gudang
Kode 33 : Pizza (Kategori Makanan)
Kode 21 : Majalah (Kategori Buku)
 ```

<p>Pertanyaan</p>
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasihasil percobaan! Bagian mana saja yang perlu diperbaiki?<br>
Jawab : Pada bagian looping saat menampilkan barang diubah menjadi 

```
for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
```

dan pada kode Buku15.java ditambahkan aksi untuk menambahkan nilai parameter dari konstrktor menjadi nilai atribut

```
Barang15(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
```

<br> 
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya! <br>
Jawab : Maksimal 7 data, sesuai dengan size yang di-instansiasi pada konstruktpr berparameter dari Gudang15

```
Gudang15 gudang = new Gudang15(7);
```

<br>
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya? <br>
Jawab : Tidak akan dilakukan proses pengecekan stack sehingga tidak akan ada barang yang ditampilkan sehingga menampilkan barang menjadi sia sia.<br>
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!<br>

```
Utama15.java

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
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
```

```
Hasil program
Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 1
Masukkan nama barang : Laptop
Masukkan nama kategori : Elektronik
Barang Laptop berhasil ditambahkan ke gudang

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 2
Masukkan nama barang : Radio
Masukkan nama kategori : Elektronik
Barang Radio berhasil ditambahkan ke gudang

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 3
Masukkan nama barang : Yoyo
Masukkan nama kategori : Mainan
Gagal! Tumpukan barang di Gudang sudah penuh

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Keluar
Pilih operasi : 4
Barang teratas : Radio
```

<br>
5. Commit dan push kode program ke Github
<hr>
## Percobaan 2
<p>Kode program : </p>

```
Gudang15.java

public String KonversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode > 0) {
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
```

```
StackKonversi.java

package Pertemuan08.code;

public class StackKonversi {
    int size;
    int[] tumpukanBiner;
    int top;

    StackKonversi(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push(int data){
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}

```

<p>Hasil program : </p>

```
Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas 
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 13
Masukkan nama barang : Setrika
Masukkan nama kategori : Elektronik
Barang Setrika berhasil ditambahkan ke gudang

Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas 
5. Keluar
Pilih operasi : 2
Barang Setrika diambil dari gudang
Kode unik dalam biner : 1101

```

<p>Pertanyaan</p>
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya! <br>
Jawab : Output program tetap sama dikarenakan kode != 0 sama dengan kode > 0 yang berarti semua kode diperbolehkan asal tidak 0 <br>
2. Jelaskan alur kerja dari method konversiDesimalKeBiner!<br>
Jawab : Method KonversiDesimalKeBiner dimulai dengan menerima bilangan bulat (desimal) sebagai parameter dan mengembalikan hasil konversinya dalam bentuk string yang merepresentasikan bilangan tersebut dalam sistem biner. Sebuah stack dideklarasikan untuk menyimpan sisa pembagian bilangan desimal selama proses konversi. Program melakukan pembagian berturut-turut dari bilangan desimal dengan 2, dengan menyimpan sisa pembagian sebagai digit biner dalam stack. Setelah itu, digit-diginya dikeluarkan dari stack dan disusun dalam bentuk string biner. Hasil konversi tersebut dikembalikan sebagai hasil dari method.
<hr>
## Percobaan 3
<p>Kode Program : </p>

```
Postfix15.java

package Pertemuan08.code;

public class Postfix15 {
    int n, top;
    char stack[];

    Postfix15(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < stack.length; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
```

```
PostfixMain15.java

package Pertemuan08.code;
import java.util.Scanner;
public class PostfikMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix15 post = new Postfix15(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}
```
<p>Hasil Program : </p>

```
Masukkan ekspresi matematika (infix) : 
a+b*(c+d-e)/f  
Postfix : abcd+e-*f/+
```

<p>Pertanyaan</p>
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?<br>
Jawab : Dikarenakan return value yang sama menunjukkan derajat dan prioritas operator yang sama. Jika diganti maka pada saat konversi hasilnya akan berubah.<br>
2. Jelaskan alur kerja method konversi!<br>
Jawab : Method ini melakukan iterasi pada setiap karakter dalam string input Q. Jika karakter adalah operand (huruf, angka, dll.), maka karakter tersebut langsung ditambahkan ke string output P. Jika karakter adalah tanda kurung buka '(', maka karakter tersebut dimasukkan ke dalam stack. Jika karakter adalah tanda kurung tutup ')', maka karakter-karakter dalam stack akan dikeluarkan satu per satu sampai bertemu tanda kurung buka '(' yang sesuai. Jika karakter adalah operator (+, -, *, /, dll.), maka karakter-karakter dalam stack akan dikeluarkan satu per satu hingga derajat operator di stack lebih rendah dari derajat operator saat ini, kemudian karakter saat ini akan dimasukkan ke dalam stack. Setelah iterasi selesai, string hasil konversi postfix P akan dikembalikan.<br>
3. Pada method konversi, apa fungsi dari potongan kode berikut?<br>
Jawab : memasukkan setiap karakter(c) dari String Q pada variabel c yang akan di passing ke method lainnya sebelum di konversi. <br>
<hr>
## Latihan
Perhatikan dan gunakan kembali kode program pada Percobaan 1. Tambahkan dua method berikut pada class Gudang: <br>
• Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah <br>
• Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode barangnya atau nama barangnya <br>
<p>Kode program : </p>

```
Gudang15.java method lihat barang terbawah

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
```

```
Gudang15,java method cari barang dengan kode dan nama

public Barang15 cariKode(int kode) {
        if (!cekKosong()) {
            int pos = -1;
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].kode == kode) {
                    pos = i;
                    System.out.println("Barang yang anda cari dengan kode " + kode + " adalah " + tumpukan[i].nama
                            + " dengan kategori " + tumpukan[i].kategori);
                    break;
                } else {
                    System.out.println("Barang dengan kode " + kode + " tidak ditemukan");
                    return null;
                }
            }
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
                    System.out.println("Barang yang anda cari dengan nama " + nama + " dengan kode " + tumpukan[i].kode
                            + " dengan kategori " + tumpukan[i].kategori);
                    break;
                } else {
                    System.out.println("Barang dengan nama " + nama + " tidak ditemukan");
                    return null;
                }
            }
            return tumpukan[pos];
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
```

<p>Hasil Program : </p>

```
Masukkan kapasitas gudang : 3

Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas 
5. Tampilkan barang terbawah
6. Cari barang
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 1
Masukkan nama barang : Penguin
Masukkan nama kategori : Boneka
Barang Penguin berhasil ditambahkan ke gudang

Menu : 
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas 
5. Tampilkan barang terbawah
6. Cari barang
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 2
Masukkan nama barang : Laptop
Masukkan nama kategori : Elektronik
Barang Laptop berhasil ditambahkan ke gudang

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Tampilkan barang terbawah
6. Cari barang
5. Keluar
Pilih operasi : 1
Masukkan kode barang : 3
Masukkan nama barang : Lotion
Masukkan nama kategori : Skincare
Barang Lotion berhasil ditambahkan ke gudang

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Tampilkan barang terbawah
6. Cari barang
5. Keluar
Pilih operasi : 5
Barang terbawah : Penguin

Menu :
1. Tambah barang
2. Ambil barang
3. Tampilkan tumpukan barang
4. Tampilkan barang teratas
5. Tampilkan barang terbawah
6. Cari barang
5. Keluar
Pilih operasi : 6
Pilih tipe pencarian : 
1. Cari dengan kode
2. Cari dengan nama
Pilihan : 1
Masukkan kode barang : 1
Barang yang anda cari dengan kode 1 adalah Penguin dengan kategori Boneka

```
