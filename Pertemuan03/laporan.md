# Laporan Jobsheet III Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>
<b>Percobaan 1 : Membuat Array dari Object, Mengisi dan Menampilkan</b>
<p>Kode Program Persegi panjang : </p>
<p><img src = "gambar/hasil_PersegiPanjangPercobaan1.jpg"></p>
<p>Kode Program Main : </p>
<p><img src = "gambar/hasil_MainPercobaan1.jpg"></p>
<p>Hasil Program : </p>
<p><img src = "gambar/hasil_percobaan1.jpg"></p>
<p>Pertanyaan</p>
<p>1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!</p>
<p>Jawab : Tidak, jika suatu class akan dibuat array of object namun tidak memiliki atribut dan sekaligus method ia hanya akan bisa meng-instansiasi array of objects dan atribut objek di dalam class tersebut.</p>
<p>2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut</p>
<p>Jawab : Dalam kasus ini, konstruktor tidak didefinisikan di dalam class. Namun setiap instansiaso objek selalu dibutuhkan konstruktor dari kelas yang diwujudkan ke dalam objek</p>
<p>3. Apa yang dimaksud dengan kode berikut ini</p>
<p>Jawab : Instansiasi array of object dengan nama ppArray dari class persegi panjang yang akan berisi 3 elemen</p>
<p>4. Apa yang dimaksud dengan kode berikut ini</p>
<p>Jawab : Instansiasi objek pada indeks ke-0 atau pada elemen pertama dari array of objects ppArray dengan atribut objek berupa panjang dan lebar yang bernilai 80 dan 40 </p>
<p>5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2</p>
<p>Jawab : Karena class PersegiPanjang merupakan konsep persegi panjang yang perlu diwujudkan dalam sebuah objek. Perwujudan tersebut dilakukan di class main dengan proses instansiasi</p>
<hr>
<b>Percobaan 2 : Menerima Input Isian Array Menggunakan Looping</b>
<p>Kode Program : </p>
<p><img src = "gambar/kode_percobaan2.jpg"></p>
<p>Hasil Program : </p>
<p><img src = "gambar/hasil_percobaan2.jpg"></p>
<p>Pertanyaan</p>
<p>1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?</p>
<p>Jawab : Iya, array of object dapat diimplementasikan pada array 2 Dimensi</p>
<p>2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!</p>
<p>Jawab : Contohnya bisa ditemukan pada kasus penyimpanan barang toko swalayan yang tiap barisnya dipisahkan sesuai kategori barang</p>
<p>3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?</p>
<p>Jawab : Error dikarenakan belum dilakukan instansiasi secara terpisah pada objek pgArray[5] hanya ada instansiasi array pgArray</p>
<p>4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!</p>
<p><img src="gambar/modifikasi_percobaan2.jpg"></p>
<p>5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !
</p>
<p>Jawab : Boleh, tidak terjadi error <b>namun</b> nilai panjang lebar pada objek dengan indeks 0 nilainya akan digantikan dengan instansiasi dengan pengisian nilai atribut saat looping</p>
<hr>
<b>Percobaan 3 : Penambahan Operasi Matematika di Dalam Method</b>
<p>Kode Program Balok : </p>
<p><img src = "gambar/kode_classBalok.jpg"></p>
<p>Kode Program Main : </p>
<p><img src = "gambar/kode_mainBalok.jpg"></p>
<p>Hasil Program : </p>
<p><img src = "gambar/hasil_percobaan3.jpg"></p>
<p>Pertanyaan</p>
<p>1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!</p>
<p>Jawab : Konstruktor bisa berjumlah dua dalam satu kelas. Konstruktor sendiri merupakan method yang memiliki nama sama dengan nama class. Konstruktor pertama merupakan konstruktor default tanpa parameter. Konstruktor kedua merupakan konstruktor dengan parameter</p>
<p>2. Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.</p>
<p><img src="gambar/pertanyaan2_segitiga.jpg"></p>
<p>3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)</p>
<p><img src="gambar/pertanyaan3_segitiga.jpg"></p>
<p>4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut</p>
<p><img src="gambar/pertanyaan4_segitiga.jpg"></p>
<p>5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling()</p>
<p><img src="gambar/pertanyaan5_segitiga.jpg"></p>
<hr>
<b>Latihan Praktikum</b>
<p>1. Menghitung Luas Permukaan dan Volume Bangun ruang</p>
<p>Kode class kerucut : </p>
<p><img src="gambar/kode_kerucut.jpg"></p>
<p>Kode class limas : </p>
<p><img src="gambar/kode_limas.jpg"></p>
<p>Kode class bola : </p>
<p><img src="gambar/kode_bola.jpg"></p>
<p>Kode class main (sebelum modifikasi) : </p>
<p><img src="gambar/kode_main.png"></p>
<p>Kode class main (setelah modifikasi) : </p>
<p><img src="gambar/kode_main_modifikasi.png"></p>
<p>Hasil program (setelah modifikasi) : </p>
<p><img src="gambar/hasil_bangunRuang.jpg"></p>
<p>2. Mendata Informasi Mahasiswa</p>
<p>Kode program : </p>
<p><img src="gambar/kode_tugas2.png"></p>
<p>Hasil Program : </p>
<p><img src="gambar/hasil_tugas2.jpg"></p>