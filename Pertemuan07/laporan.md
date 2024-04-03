# Laporan Jobsheet VI Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>
## Percobaan 1
<p>Kode Program : </p>
<img src="gambar/kode1percobaan1.png"><br>
<img src="gambar/kode2percobaan1.png"><br>
<img src="gambar/kode3percobaan1.png">
<p>Hasil Program : </p>
<img src="gambar/hasil1Percobaan1.jpg"><br>
<img src="gambar/hasil2Percobaan1.jpg"><br>
<img src="gambar/hasil3Percobaan1.jpg">
<p>Pertanyaan </p>
<p>1. Jelaskan fungsi break yang ada pada method FindSeqSearch!</p>
<p>Jawab : Untuk menghentikan perulangan ketika telah menemukan nilai cari pada kumpulan atribut kode buku di array of object</p>
<p>2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
</p>
<p>Jawab : Iya, program masih dapat berjalan karena sequential search mencari nilai pada setiap indeks, tidak perlu urut</p>
<img src="gambar/pertanyaan21percobaan1.jpg"><br>
<img src="gambar/pertanyaan22percobaan1.jpg">
<p>3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti gambar berikut</p>
<img src="gambar/pertanyaan31percobaan1.jpg"><br>
<img src="gambar/pertanyaan32percobaan1.jpg"><br>
<img src="gambar/pertanyaan33percobaan1.jpg">
<hr>
## Percobaan 2
<p>Kode Program : </p>
<img src="gambar/kode1percobaan2.jpg"><br>
<img src="gambar/kode2percobaan2.jpg">
<p>Hasil Program : </p>
<img src="gambar/hasilPercobaan2.jpg">
<p>Pertanyaan</p>
<p>1. Tunjukkan pada kode program yang mana proses divide dijalankan!</p>
<p>Jawab : Ketika program membagi suatu data menjadi dua bagian antara kiri dan kanan yang dipisahkan oleh variable mid</p>
<p>if (right >= left) {
  mid = (left + right) / 2;
}</p>
<p>2. Tunjukkan pada kode program yang mana proses conquer dijalankan!</p>
<p>Jawab : Ketika mulai menemukan hasil dari tiap bagian pada pemanggilan rekursif</p>
<p>if (cari == listBk[mid].kodeBuku) {
  return (mid);
} else if (listBk[mid].kodeBuku > cari) {
  return FindBinarySearch(cari, left, mid);
} else {
  return FindBinarySearch(cari, mid, right);
}</p>
<p>3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?</p>
<p>Jawab : Program bisa berjalan namun hasil tidak ditemukan, karena metode binary search mencari nilai pada index tengah kemudian dibandingkan dengan nilai yang ingin dicari, jika nilai yang dicari lebih kecil dari pada tengah akan dilakukan pengecekan bagian kiri (jika ascending) namun jika nilai yang dicari lebih besar dari bagian tengah maka akan dilakukan pencarian di bagian kanan.</p>
<img src="gambar/pertanyaan31percobaan2.jpg"><br>
<img src="gambar/pertanyaan32percobaan2.jpg">
<p>4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!
</p>
<p>Jawab : Hasil tidak sesuai dikarenakan data tidak urut, cara mengubahnya adalah mengurutkan data nya terlebih dahulu</p>
<img src="gambar/pertanyaan41percobaan2.jpg"><br>
<img src="gambar/pertanyaan42percobaan2.jpg">
<hr>
## Percobaan 3
<p>Kode Program : </p>
<img src="gambar/kode1percobaan3.png"><br>
<img src="gambar/kode2percobaan3.png">
<p>Hasil Program : </p>
<img src="gambar/hasilPercobaan3.jpg"><br>
<hr>
## Latihan
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini<br>
- Ubah tipe data dari kode Buku yang awalnya int menjadi String<br>
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan<br>
sequential search dan binary search.
<p>Kode program : </p>
<img src="gambar/kode1latihan1.jpg"><br>
<img src="gambar/kode2latihan1.jpg"><br>
<img src="gambar/kode3latihan1.jpg"><br>
<p>Hasil program : </p>
<img src="gambar/hasil1latihan1.jpg"><br>
2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini<br>
- Tambahkan method pencarian judul buku menggunakan sequential search dan binary<br>
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan<br>
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga<br>
ketika input data acak, maka algoritma searching akan tetap berjalan<br>
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam<br>
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang<br>
diberikan!
<p>Kode program : </p>
<img src="gambar/hasil1latihan2.jpg">
<p>Hasil program : </p>
<img src="gambar/hasil1latihan2.jpg">