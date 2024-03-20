# Laporan Jobsheet IV Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>
## Percobaan 1
<p>Kode program :</p>
<img src="gambar/kode1Percobaan1.jpg"><br>
<img src="gambar/kode2Percobaan1.jpg"><br>
<img src="gambar/kode3Percobaan1.jpg">
<p>Hasil program : </p>
<img src="gambar/hasil1Percobaan1.jpg"><br>
<img src="gambar/hasil2Percobaan1.jpg">
<p>Pertanyaan</p>
<p>1. Terdapat di method apakah proses bubble sort?
</p>
<p>Jawab : Pada method bubleSort() di class MahasiswaBerprestasi</p>
<p>2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini. Untuk apakah proses tersebut?</p>
<p>Jawab : Untuk mengurutkan objek berdasarkan nilai ipk dari terbesar hingga terkecil dengan membandingkan antara objek di suatu index dengan objek di index sebelumnya. Kemudian jika nilai ipk lebih besar akan disimpan di variabel temporal untuk ditukarkan posisinya</p>
<p>3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:</p>
<p>a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?</p>
<p>Jawab : Perulangan i mengontrol pergerakan dari kiri ke kanan pada array. Perulangan ini akan terus berjalan selama i lebih kecil dari listMhs.length - 1. Ini berarti perulangan akan berhenti ketika i mencapai satu elemen sebelum akhir array. Perulangan j mengontrol perbandingan antar elemen array. Perulangan ini akan terus berjalan selama j lebih kecil dari listMhs.length - i. Ini berarti perulangan akan berhenti ketika j mencapai akhir array pada iterasi saat ini (diatur oleh perulangan i)</p>
<p>b. Mengapa syarat dari perulangan i adalah i < listMhs.length-1 ?</p>
<p>Jawab : Syarat i < listMhs.length - 1 memastikan bahwa perulangan i tidak akan mengakses elemen di luar array. Perulangan perlu berhenti satu elemen sebelum akhir array karena pada tahap terakhir, tidak ada lagi perbandingan yang perlu dilakukan</p>
<p>c. Mengapa syarat dari perulangan j adalah j < listMhs.length-i ?
</p>
<p>Jawab : memastikan bahwa perulangan j hanya melakukan perbandingan pada elemen yang belum dibandingkan pada iterasi saat ini. Perulangan perlu berhenti di listMhs.length - i karena elemen di i sudah dibandingkan dengan semua elemen di sebelah kirinya.</p>
<p>d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?</p>
<p>Jawab : Jumlah perulangan i: 49 (dari 0 sampai 48) Jumlah tahap bubble sort: 49 (sama dengan jumlah perulangan i)</p>
<hr>
## Percobaan 2
<p>Kode program :</p>
<img src="gambar/kode1Percobaan2.jpg"><br>
<img src="gambar/kode2Percobaan2.jpg">
<p>Hasil program : </p>
<img src="gambar/hasil1Percobaan2.jpg"><br>
<img src="gambar/hasil2Percobaan2.jpg">
<p>Pertanyaan</p>
<p>Di dalam method selection sort, terdapat baris program seperti di bawah ini. Untuk apakah proses tersebut, jelaskan!</p>
<p>Jawab : Untuk mencari nilai ipk terkecil dari array listMhs dengan membandingkan antar index array</p>
<hr>
## Percobaan 3
<p>Kode program :</p>
<img src="gambar/kode1Percobaan3.jpg"><br>
<img src="gambar/kode2Percobaan3.jpg">
<p>Hasil program : </p>
<img src="gambar/hasil1Percobaan2.jpg"><br>
<img src="gambar/hasil2Percobaan2.jpg">
<p>Pertanyaan</p>
<p>Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.</p>
<img src="gambar/kodePertanyaan_3.jpg"><br>
<img src="gambar/HasilPertanyaan_3.jpg">