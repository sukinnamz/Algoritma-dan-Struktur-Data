# Laporan Jobsheet IV Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>
<b>Percobaan 1 : Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer</b>
<p>Kode Program : </p>
<p><img src = "gambar/codePercobaan1.jpg"></p>
<p>Kode Program Main : </p>
<p><img src = "gambar/mainPercobaan1.jpg"></p>
<p>Hasil Program : </p>
<p><img src = "gambar/hasilpercobaan1.jpg"></p>
<p>Pertanyaan</p>
<p>1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!</p>
<p>Jawab : Pada algoritma Divide Conquer terdapat fungsi rekursif yang mengembalikan dirinya sendiri. Pada bagian if merupakan base case dari fungsi rekursif jika parameter bernilai 1. Pada bagian else dilakukan rekursif yang memanggil dirinya sendiri dengan parameter awal dikurangi 1</p>
<p>2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!</p>
<p>Jawab : Perulangan dapat digantikan dengan menggunakan perulangan while</p>
<p><img src = "gambar/modifikasiPercobaan1.jpg"></p>
<p>3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !</p>
<p>Jawab : Pada fakto *= i dilakukan operasi assignment dalam iterasi namun pada fakto = n * faktorialDC(n-1) dilakukan proses rekursif</p>
<hr>
<b>Percobaan 2 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer</b>
<p>Kode Program : </p>
<p><img src = "gambar/codePercobaan2.jpg"></p>
<p>Kode Program Main : </p>
<p><img src = "gambar/mainPercobaan2.jpg"></p>
<p>Hasil Program : </p>
<p><img src = "gambar/hasilpercobaan2.jpg"></p>
<p>Pertanyaan</p>
<p>1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
</p>
<p>Jawab : Pada method PangkatBF terjadi penghitungan pangkat yang menggunakan algoritma Brute Force dengan menerapkan perhitungan per indeks pada perulangan. Sedangkan pada method PangkatDC menggunakan algoritma Devide Conquer yang membagi tiap bagian pangkat kemudian di hitung per bagian dan pada akhirnya di combine</p>
<p>2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!</p>
<p>Jawab : Terdapat dalam method PangkatDC di bagian rekursif berikut : </p>
<p>if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));</p>
<p>3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.</p>
<p><img src="gambar/modifikasiClassPercobaan2.jpg"><img src="gambar/modifikasiMainPercobaan2.jpg"></p>
<p>4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan
switch-case!</p>
<p><img src="gambar/modifikasiSwitchPercobaan2.jpg"></p>
<hr>
<b>Percobaan 3 : Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer</b>
<p>Kode Program : </p>
<p><img src = "gambar/codePercobaan3.jpg"></p>
<p>Kode Program Main : </p>
<p><img src = "gambar/mainPercobaan3.jpg"></p>
<p>Hasil Program : </p>
<p><img src = "gambar/hasilpercobaan3.jpg"></p>
<p>Pertanyaan</p>
<p>1. Mengapa terdapat formulasi return value berikut?Jelaskan!</p>
<p>Jawab : Untuk mencombine hasil penjumlahan sisi kiri (lsum), sisi kanan (rsum) dan bagian tengah (arr[mid])</p>
<p>2. Kenapa dibutuhkan variable mid pada method TotalDC()?
</p>
<p>Jawab : untuk membagi array menjadi dua bagian sama panjang</p>
<p>3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!</p>
<p>Jawab : </p>
<p><img src="gambar/modifikasiPercobaan3.jpg"><img src="gambar/hasilModifikasiPercobaan3.jpg"></p>
<hr>
<p>Latihan 1 : </p>
a) top_acceleration tertinggi menggunakan Divide and Conquer!<br>
b) top_acceleration terendah menggunakan Divide and Conquer!<br>
c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force!<br>
<p>Kode Program : </p>
<p><img src ="gambar/codeLatihan1.jpg"></p>
<p>Kode Program Main : </p>
<p><img src ="gambar/mainLatihan1.jpg"></p>
<p>Hasil Program : </p>
<p><img src ="gambar/hasilLatihan1.jpg"></p>