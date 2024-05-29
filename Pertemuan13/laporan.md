# Laporan Jobsheet XI Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Innama Maesa Putri</p>
<p align="center">NIM : 2341720235</p>
<hr>

# Percobaan 1
<p>Kode Program</p>

```
Class Node 
package Pertemuan13;

public class Node {
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
```

```
Class DoubleLinkedLists
package Pertemuan13;

public class DoubleLinkedLists {
    Node head = null;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                current.prev.next = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

}

```

```
Class Main
package Pertemuan13;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("===========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("============================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}

```

<p>Hasil Program</p>

```
Linked Lists Kosong
Size  : 0
===========================================
7       3       4
berhasil diisi
============================================
7       40      3       4
berhasil diisi
Size : 4
============================================
Linked Lists Kosong
Size : 0
```

<p>Pertanyaan</p>
1. Jelaskan perbedaan antara single linked list dengan double linked lists! <br>
Jawab : Menurut saya perbedaan mendasarnya ada pada bagian pointer previous di double linked list, yang menunjukkan node sebelumnya dan pointer next yang menunjukkan ke node selanjutnya. Sedangkan pada single linked list hanya memiliki satu pointer yaitu next. <br>
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut? <br>
Jawab : Sebagai pointer untuk menunjukkan objek atau node setelah dan sebelum nya.
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini? <br>
Jawab : Untuk inisialisasi awal double linked list kosong. <br>
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? <br>
Jawab : Karena untuk menambahkan node pertama, previous node tersebut bernilai null <br>
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ? <br>
Jawab : Jika pada double linked list sudah terdapat isi, maka saat menambahkan node baru di awal harus ditempatkan sebelum head sehingga node baru bisa menjadi head baru. <br>
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? <br>
Jawab : Karena saat menambahkan node di akhir tidak perlu menambahkan pointer next karena tempatnya sudah diakhir sehingga next bernilai null. <br>
7. Pada method add(), terdapat potongan kode program sebagai berikut ... jelaskan maksud dari bagian yang ditandai dengan kotak kuning. <br>
Jawab : Menangani kasus di mana kita ingin menyisipkan node baru di awal (sebagai node pertama) dari double linked list. Dengan langkah langkah memeriksa apakah node saat ini (current) adalah node pertama (prev adalah null). Kemudian membuat node baru yang menunjuk ke current sebagai node berikutnya. Memperbarui node current untuk menunjuk kembali ke node baru sebagai node sebelumnya. Memperbarui pointer head untuk menunjuk ke node baru, menjadikannya node pertama.

<hr>

# Percobaan 2
<p>Kode Program :</p>

```
Class DoubleLinkedLists

public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }
```

```
Class Main

        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("============================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("============================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("============================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size  : " + dll.size());
```

<p>Hasil Program :</p>

```
50      40      10      20
berhasil diisi
Size  : 4
============================================
40      10      20
berhasil diisi
Size  : 3
============================================
40      10
berhasil diisi
Size  : 2
============================================
40
berhasil diisi
Size  : 1
```

<p>Pertanyaan</p>

1. Apakah maksud statement berikut pada method removeFirst()? <br>
head = head.next;<br>
head.prev = null; <br>
Jawab : Untuk mengganti posisi head pada node selanjutnya, dan menghapus node pertama atau head sebelumnya. <br>
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? <br>
Jawab : Menggunakan perulangan while hingga next dari node bernilai null yang menunjukkan bahwa node tersebut adalah node terakhir. Node tersebut disimpan dalam variabel tmp dan data terakhir ada lah data yang ada pada tmp. <br>
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove! <br>
Jawab : Jika node yang dihapus adalah node pertama (head), atau node terakhir, perlu penanganan khusus. Untuk node pertama, head perlu diperbarui. Untuk node terakhir, tmp.next adalah null, sehingga tmp.next.prev akan memicu kesalahan. Jika potongan kode dijalankan tanpa validasi dan penyesuaian yang tepat, struktur daftar berhubungan dapat menjadi rusak karena hubungan prev-next yang tidak konsisten. <br>
4. Jelaskan fungsi kode program berikut ini pada fungsi remove! <br>
Jawab : Untuk mengganti refrensi next dari node sebelum node current yang di remove dengan node setelah node current, dan mengganri refrensi previous node setelah current dengan node sebelum current.
<hr>

# Percobaan 3

<p>Kode Program : </p>

```
Class DoubleLinkedLists

public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        } else {
            return head.data;
        }
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }
```

```
Class Main

        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        // dll.clear();
        // dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + dll.get(1));
```

<p>Hasil Program : </p>

```
Linked Lists Kosong
Size : 0
===========================================
7       3       4
berhasil diisi
Size : 3
============================================
7       40      3       4
berhasil diisi
Size : 4
============================================
Size : 4
============================================
Data awal pada Linked Lists adalah : 7
Data akhir pada Linked Lists adalah : 4
Data indeks ke-1 pada Linked Lists adalah : 40
```

<p>Pertanyaan</p>
1. Jelaskan method size() pada class DoubleLinkedLists! <br>
Jawab : Untuk menampilkan banyaknya node yang ada pada linked list <br>
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1! <br>
Jawab : Ketika akan melakukan perulangan, tmp diisi dengan head.next <br>
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! <br>
Jawab : Pada dasarnya konsep fungsi add sama yaitu menambahkan node baru pada index yang ditentukan, perbedaan mendasarnya hanya pada add pada DLL harus mengganti refrensi next dan previous sedangkan pada SLL hanya mengganti refrensi next saja <br>
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! <br>
Jawab : Pada kode pertama dilakukan pengecekan size terlebih dahulu, jika size = 0 maka isEmpty bernilai true. Namun pada kode kedua langsung mengembalikan nilai boolean pada pernyataan head == null, jika memang head == null akan mengembalikan nilai false dataupun sebaliknya.