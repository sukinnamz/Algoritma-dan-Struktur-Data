# Laporan Jobsheet XI Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>

# Percobaan 1
<p>Kode program : </p>

```
class Node

package Pertemuan11;

public class Node15 {
    int data;
    Node15 next;

    Node15() {

    }

    Node15(int nilai, Node15 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}
```

```
class SingleLinkedList

package Pertemuan11;

public class SingleLinkedList {
    Node15 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.print("Isi Linked List \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node15 ndInput = new Node15();
        ndInput.data = input;
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node15 ndInput = new Node15(input, null);
        Node15 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        Node15 ndInput = new Node15();
        // if (index > 0) {
        //     System.out.println("Perbaiki logikanya! " + "kalau indeksnya -1 bagaimana???");
        if (index == -1) {
            addFirst(input);
        } else {
            Node15 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node15(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}

```

```
class Main

package Pertemuan11;
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
```

<p>Hasil program : </p>

```
Linked List Kosong
Isi Linked List :       890
Isi Linked List :       890     760
Isi Linked List :       700     890     760
Isi Linked List :       700     999     890     760
Isi Linked List :       700     999     890     833     760
```

<p>Pertanyaan</p>
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<br>
Jawab : Karena belum ada data yang masuk (dilihat dari pengecekan head, dan head bernilai kosong), sehingga data linked list masih kosong dan mencetak peringatan "Linked List Kosong" <br>
2. Jelaskan kegunaan variable temp secara umum pada setiap method! <br>
Jawab : Variabel temp digunakan instansiasi ke kelas node atau referensi ke node saat sedang melakukan operasi pada linked list. Variabel ini digunakan untuk melacak posisi saat melakukan iterasi melalui linked list atau saat mencari node tertentu. <br>
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut <br>
Jawab : Kode ini digunakan untuk memeriksa apakah node yang baru dimasukkan akan menjadi node terakhir dalam linked list setelah penambahan elemen. Jika iya, artinya node baru tersebut akan menjadi tail dari linked list.

<hr>

# Percobaan 2
<p>Kode program : </p>

```
tambahan pada class singlelinkedlist

int getData(int index) {
        Node15 tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        Node15 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node15 temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else {
            Node15 temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node15 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
```

```
tambahan class main

System.out.println("Data pada indeks ke - 1 " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke- " + singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
```

<p>Hasil program : </p>

```
Linked List Kosong
Isi Linked List         890
Isi Linked List         890     760
Isi Linked List         700     890     760
Isi Linked List         700     999     890     760
Isi Linked List         700     999     890     833     760
Data pada indeks ke - 1 999
Data 3 berada pada indeks ke- 4
Isi Linked List         700     890     833     760
Isi Linked List         890     833     760
Isi Linked List         833     760
Isi Linked List         833
```

<p>Pertanyaan</p>
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! <br>
Jawab : Untuk keluar dari perulangan while setelah menemukan nilai yang ditemukan untuk kemudian dihapus. <br>
2. Jelaskan kegunaan kode dibawah pada method remove <br>
Jawab : Digunakan untuk menghapus node yang memiliki nilai data yang sama dengan nilai key yang dicari yang kemudian digantikan dengan nilai selanjutnya.

<hr>

# Tugas
1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah
dipelajari sebelumnya untuk menginputkan data. <br>
<p>Kode Program : (Untuk mempersingkat laporan, kode program berada pada file Mahasiswa15, MahasiswaLinkedList, dan MahasiswaMain)</p>
<p>Hasil program : </p>

```
Linked List Kosong
Isi Linked List         NIM : 111 Nama : Anton | 
Isi Linked List         NIM : 111 Nama : Anton | NIM : 115 Nama : Sari | 
Isi Linked List         NIM : 111 Nama : Anton | NIM : 112 Nama : Prita | NIM : 115 Nama : Sari | 
Isi Linked List         NIM : 111 Nama : Anton | NIM : 112 Nama : Prita | NIM : 113 Nama : Yusuf | NIM : 115 Nama : Sari | 
Isi Linked List         NIM : 111 Nama : Anton | NIM : 112 Nama : Prita | NIM : 113 Nama : Yusuf | NIM : 114 Nama : Doni | NIM : 115 Nama : Sari |
```

2 Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang ditunjukkan pada soal nomor 1! Ketentuan <br>
a. Implementasi antrian menggunakan Queue berbasis Linked List! <br>
b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!<br>