package Pertemuan11;

public class MahasiswaMain {
    public static void main(String[] args) {
        MahasiswaLinkedListed mhs = new MahasiswaLinkedListed();
        mhs.print();
        mhs.addFirst(111, "Anton");
        mhs.print();
        mhs.addLast(115, "Sari");
        mhs.print();
        mhs.insertAfter(111, 112, "Prita");
        mhs.print();
        mhs.insertAt(2, 113, "Yusuf");
        mhs.print();
        mhs.insertAfter(113, 114, "Doni");
        mhs.print();
    }
}
