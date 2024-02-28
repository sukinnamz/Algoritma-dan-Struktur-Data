package Pertemuan03.code;

public class InformasiMahasiswa {

    public String nama, jenis_kelamin;
    public int nim;
    public double ipk;

    double rataRataIPK(InformasiMahasiswa[] a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i].ipk;
        }
        return (total / a.length);
    }

    void IPKTerbesar(InformasiMahasiswa[] a) {
        double max = a[0].ipk;
        InformasiMahasiswa mhs = null;
        for (int i = 0; i < a.length; i++) {
            if (a[i].ipk > max) {
                max = a[i].ipk;
                mhs = a[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai IPK tertinggi");
        System.out.println("Nama : " + mhs.nama);
        System.out.println("Nim : " + mhs.nim);
        System.out.println("Jenis Kelamin : " + mhs.jenis_kelamin);
        System.out.println("Nilai IPK : " + mhs.ipk);

    }
}
