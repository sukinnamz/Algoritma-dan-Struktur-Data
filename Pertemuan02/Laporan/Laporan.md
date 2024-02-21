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
    <img src="https://drive.google.com/file/d/1Hk4d6QoDTy9JmmCK-0Q6rsFQWmei6r9J/view?usp=sharing">
</p>
<p>Hasil Program : </p>
<p align="center">
    <img src="gambar/hasil_percobaan1">
</p>
<p>Pertanyaan</p>
<p>1. Sebutkan dua karakteristik class atau object!</p>
<p>Jawab : class merupakan konsep atau rancangan dari sutu objek dan bersifat umum, sedangkan objek merupakan reapsasi dari suatu class dan bersifat spesifik</p>
<p>2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimipki oleh class Buku? Sebutkan apa saja atributnya!</p>
<p>Jawab : 5 atribut, judul, pengarang, halaman, stok, harga</p>
<p>3. Ada berapa method yang dimipki oleh class tersebut? Sebutkan apa saja methodnya!</p>
<p>Jawab : 4 method, tampil, terjual, restock, dan gantiHarga</p>
<p>4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!</p>
Jawab : dengan menambahkan if dengan kondisi stok>0 seperti <p><img src="gambar/modifikasi_no4_percobaan1"></p>
<p>5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?</p>
Jawab : agar ada nilai yang bisa dijumlahkan dengan stom untuk memperbarui nilai stok awal
<p>6. Commit dan push kode program ke Github</p>
<hr>
<b>2.2 Percobaan 2</b>
<p>Kode Program : </p>
<p align="center">
    <img src="gambar/kode_percobaan2">
</p>
<p>Hasil Program : </p>
<p align="center">
    <img src="gambar/hasil_percobaan2">
</p>
<p>Pertanyaan<p>
<p>1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?</p>
<p>Jawab : Pada baris ke 3 dengan sintaks Buku15 bk1 = new Buku15(); instansiasi objek bk1 dari kelas Buku15</p>
<p>2. Bagaimana cara mengakses atribut dan method dari suatu objek?</p>
<p>Jawab : dengan menyebutkan namaObjek.atribut seperti pada bk1.judul kemudian mengisikan nilai yang sesuai dengan atribut</p>
<p>3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?</p>
<p>Jawab : karena pada pemanggilan method tampilInformasi() pertama yang ditampilkan adalah data yang sudah di tambahkan nilainya dengan mengakses atribut objek. Namun pada method tampilInformasi() yang kedua, telah dilakukan pemanggilan fungsi terjual() yang mana akan mengurangi stok dan gantiharga() yang mengubah nilai harga</p>