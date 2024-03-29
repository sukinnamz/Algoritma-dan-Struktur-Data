# Laporan Jobsheet II Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>
<b>2.1 Percobaan 1</b>
<p>Kode Program : </p>
<p align="center">
    <img src="gambar/kode_percobaan1.jpg">
</p>
<p>Hasil Program : </p>
<p align="center">
    <img src="gambar/hasil_percobaan1.jpg">
</p>
<p>Pertanyaan</p>
<p>1. Sebutkan dua karakteristik class atau object!</p>
<p>Jawab : class merupakan konsep atau rancangan dari suatu objek dan bersifat umum, sedangkan objek merupakan reapsasi dari suatu class dan bersifat spesifik</p>
<p>2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimipki oleh class Buku? Sebutkan apa saja atributnya!</p>
<p>Jawab : 5 atribut, judul, pengarang, halaman, stok, harga</p>
<p>3. Ada berapa method yang dimipki oleh class tersebut? Sebutkan apa saja methodnya!</p>
<p>Jawab : 4 method, tampil, terjual, restock, dan gantiHarga</p>
<p>4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!</p>
Jawab : dengan menambahkan if dengan kondisi stok>0 dan jml kurang dari 0 seperti <p><img src="gambar/modifikasi_no4_percobaan1.jpg"></p>
<p>5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?</p>
Jawab : agar ada nilai yang bisa dijumlahkan dengan stom untuk memperbarui nilai stok awal
<p>6. Commit dan push kode program ke Github</p>
<hr>
<b>2.2 Percobaan 2</b>
<p>Kode Program : </p>
<p align="center">
    <img src="gambar/kode_percobaan2.jpg">
</p>
<p>Hasil Program : </p>
<p align="center">
    <img src="gambar/hasil_percobaan2.jpg">
</p>
<p>Pertanyaan<p>
<p>1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?</p>
<p>Jawab : Pada baris ke 3 dengan sintaks Buku15 bk1 = new Buku15(); instansiasi objek bk1 dari kelas Buku15</p>
<p>2. Bagaimana cara mengakses atribut dan method dari suatu objek?</p>
<p>Jawab : dengan menyebutkan namaObjek.atribut seperti pada bk1.judul kemudian mengisikan nilai yang sesuai dengan atribut</p>
<p>3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?</p>
<p>Jawab : karena pada pemanggilan method tampilInformasi() pertama yang ditampilkan adalah data yang sudah di tambahkan nilainya dengan mengakses atribut objek. Namun pada method tampilInformasi() yang kedua, telah dilakukan pemanggilan fungsi terjual() yang mana akan mengurangi stok dan gantiharga() yang mengubah nilai harga</p>
<hr>
<b>2.3 Percobaan 3</b>
<p>Kode Program : </p>
<p align="center">
    <img src="gambar/kode1_percobaan3.jpg">
    <img src="gambar/kode2_percobaan3.jpg">
</p>
<p>Hasil Program : </p>
<p align="center">
    <img src="gambar/hasil_percobaan3.jpg">
</p>
<p>Pertanyaan</p>
<p>1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!</p>
<p>Jawab : public Buku15(String jud, String pg, int hal, int stok, int har) {}</p>
<p>2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?</p>
<p>Jawab : instansiasi objek dengan mengakses atribut objek melalui konstruktor berparameter dan memberi nilai atribut pada konstruktor berparameter</p>
<p>3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!</p>
<p>Jawab : Akan terjadi error pada instansiasi objek yang menggunakan konstruktor default, dikarenakan saat instansiasi tersebut, tidak ada parameter dalam konstruktor buku yang sesuai pada class buku</p>
<p>4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!</p>
<p>Tidak, karena method adalah hal hal yang bisa dilakukan oleh objek dan pemrogrmanan berbasis objek tidak bersifat struktural jadi pemanggilan method bebas seperti pada contoh pemanggilan informasi buku setelah merubah harga</p>
<p>5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku! </p>
<p>Buku15 bkInnama = new Buku15("Biografi Innama Maesa", "Innama Maesa", 100, 50, 73000);</p>
<p>dan jika ingin menampilkan objek tersebut bisa dipanggil dengan menggunakan bkInnama.tampilInformasi();</p>
<hr>
<b>Latihan</b>
<p>1. Membuat method baru pada class Buku</p>
<p>Kode Program : </p>
<p><img src="gambar/latihan1.jpg"></p>
<p>Hasil Program : </p>
<p><img src="gambar/hasil_latihan1.jpg"></p>
<p>2. Membuat game dragon dengan konsep OOP</p>
<p>Kode Program : </p>
<p><img src="gambar/kode_latihan2.png"></p>
<p><img src="gambar/kode_main_latihan2.jpg"></p>
<p>Hasil Program : </p>
<p><img src="gambar/hasil_latihan2.jpg"></p>