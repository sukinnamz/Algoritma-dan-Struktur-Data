# Laporan Jobsheet XII Algoritma dan Struktur Data
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

package Pertemuan15;

public class Node15 {
    int data;
    Node15 prev, next;
    int jarak;

    Node15(Node15 prev, int data, int jarak, Node15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
```

```
Class Double Linked List

package Pertemuan15;

public class DoubleLinkedList {
    Node15 head = null;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node15(head, item, jarak, head);
        } else {
            Node15 newNode = new Node15(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node15 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node15 newNode = new Node15(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index, int jarak) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node15 newNode = new Node15(null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node15 newNode = new Node15(current.prev, item, jarak, current);
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
            Node15 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

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
            Node15 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        Node15 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

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
            Node15 tmp = head;
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
            Node15 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }
}

```

```
Class Graph

package Pertemuan15;

public class Graph15 {
    int vertex;
    DoubleLinkedList list[];

    Graph15(int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for (int index = 0; index < v; index++) {
            list[index] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeALlEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

}

```

```
Main Class

package Pertemuan15;

public class Graphmain15 {
    public static void main(String[] args) throws Exception {
        Graph15 gedung = new Graph15(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }

}

```

<p>Hasil Program</p>

```
InDegree dari Gedung A : 0
OutDegree dari Gedung A : 2
Degree dari Gedung A : 2
Gedung A terhubung dengan 
C (100m), B (50m), 
Gedung B terhubung dengan
D (70m),
Gedung C terhubung dengan
D (40m),
Gedung D terhubung dengan 
E (60m), 
Gedung E terhubung dengan
F (80m), 

Gedung A terhubung dengan 
C (100m), B (50m), 
Gedung C terhubung dengan
D (40m),
Gedung D terhubung dengan 
E (60m), 
Gedung E terhubung dengan 
F (80m),
```

<p>Pertanyaan</p>
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! <br>
Jawab : Sudah dimodifikasi di bagian method remove pada class DLL <br>
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut! <br>
Jawab : Untuk menyimpan beberapa vertex yang terhubung dalam graph yang sejalur<br>
3. Jelaskan alur kerja dari method removeEdge! <br>
Jawab : Mencari asal yang sesuai dengan index yang dimasukkan kemudian mencari tujuan dari garis yang ingin dihapus, kemudian menghapus vertex tujuan agar tidak terhubung dengan vertex asal. <br>
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph? <br>
Jawab : Karena untuk menambahkan jalur di awal karena jalur pada graph tidak peduli urutan, bisa ditempatkan dimana saja <br>
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner) <br>
Jawab : <br>
Hasil : 
```
Gedung C dan D bertetangga
Gedung C dan F tidak bertetangga
```

Program : 

```
Main Class

gedung.cekTetangga(2, 3);
gedung.cekTetangga(2, 5);
```

```
Graph Class

public void cekTetangga(int asal, int tujuan) throws Exception {
        if (list[asal].size > 0) {
            for (int i = 0; i < list[asal].size; i++) {
                int nextNode = list[asal].get(i);
                if (nextNode == tujuan) {
                    System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A'
                            + tujuan) + " bertetangga");
                } else {
                    System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A'
                            + tujuan) + " tidak bertetangga");
                }
            }
        }
    }
```

# Percobaan 2

<p>Kode Program</p>

```
Class matriks

package Pertemuan15;

public class GraphMatriks {
    int vertex;
    int[][] matriks;

    GraphMatriks(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) +('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
}

```

```
Class Main

GraphMatriks gdg = new GraphMatriks(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
```

<p>Hasil Program</p>

```
Gedung A : 
Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m), 
Gedung B : 
Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m),
Gedung C : 
Gedung A (0 m), Gedung B (80 m), Gedung C (0 m), Gedung D (40 m),
Gedung D :
Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m), 
Hasil setelah penghapusan edge
Gedung A : 
Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m),
Gedung B : 
Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m), 
Gedung C :
Gedung A (0 m), Gedung B (0 m), Gedung C (0 m), Gedung D (40 m), 
Gedung D : 
Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m),
```

<p>Pertanyaan</p>
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! <br>
Jawab : Sudah <br>
2. Apa jenis graph yang digunakan pada Percobaan 2? <br>
Jawab : Graph menggunakan matriks dengan tipe data array <br>
3. Apa maksud dari dua baris kode berikut? <br>
Jawab : Memanggil fungsi makeEdge untuk menambahkan data jarak dengan indeks asal dan tujuan ke dalam graph matriks <br>
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree! <br>
Jawab : <br>

```
Hasil : 

Out-degree vertex A: 4
In-degree vertex A: 4
Degree vertex A: 8
```

```
Code : 

public int outDegree(int v) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int inDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int degree(int v) {
        return inDegree(v) + outDegree(v);
    }
```

# Latihan
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat dinamis, setidaknya terdiri dari: <br>
a) Add Edge <br>
b) Remove Edge <br>
c) Degree <br>
d) Print Graph <br>
e) Cek Edge <br>
Pengguna dapat memilih menu program melalui input Scanner <br>
Jawab :

```
Hasil Program 
==========================
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 1
Masukkan asal : 0
Masukkan tujuan : 1
Masukkan jarak : 50
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 1
Masukkan asal : 0
Masukkan tujuan : 2
Masukkan jarak : 100
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 1
Masukkan asal : 1
Masukkan tujuan : 3
Masukkan jarak : 70
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 1
Masukkan asal : 2
Masukkan tujuan : 3
Masukkan jarak : 40
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 1
Masukkan asal : 3
Masukkan tujuan : 4
Masukkan jarak : 60
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 1
Masukkan asal : 4
Masukkan tujuan : 5
Masukkan jarak : 80
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 3
Masukkan vertex : 0
InDegree dari Gedung A : 0
OutDegree dari Gedung A : 2
Degree dari Gedung A : 2
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 4
Gedung A terhubung dengan 
C (100m), B (50m), 
Gedung B terhubung dengan
D (70m), 
Gedung C terhubung dengan 
D (40m), 
Gedung D terhubung dengan 
E (60m), 
Gedung E terhubung dengan
F (80m),

Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 2
Masukkan asal : 1
Masukkan tujuan : 3
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 4
Gedung A terhubung dengan 
C (100m), B (50m),
Gedung C terhubung dengan
D (40m),
Gedung D terhubung dengan
E (60m),
Gedung E terhubung dengan
F (80m), 

Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 5
Masukkan asal : 2
Masukkan tujuan : 3
Gedung C dan D bertetangga
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Exit
Pilih menu: 6
Keluar dari program.
```

<p>Update jarak</p>
```

Menu:
1. Add Edge   
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 0
Masukkan tujuan : 1
Masukkan jarak : 10
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 1
Masukkan tujuan : 2
Masukkan jarak : 40
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 2
Masukkan tujuan : 3
Masukkan jarak : 100
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 4
Gedung A terhubung dengan 
B (10m), 
Gedung B terhubung dengan
C (40m),
Gedung C terhubung dengan
D (100m),

Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 6
Masukkan asal : 0
Masukkan tujuan : 1
Masukkan jarak : 65
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 4
Gedung A terhubung dengan 
B (65m), 
Gedung B terhubung dengan 
C (40m), 
Gedung C terhubung dengan 
D (100m),

Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 8
Keluar dari program.
```

<p>Hitung edge : </p>

```
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 0
Masukkan tujuan : 1
Masukkan jarak : 50
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 0
Masukkan tujuan : 2
Masukkan jarak : 100
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 1
Masukkan tujuan : 3
Masukkan jarak : 70
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 1
Masukkan asal : 2
Masukkan tujuan : 3
Masukkan jarak : 70
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 4
Gedung A terhubung dengan 
C (100m), B (50m), 
Gedung B terhubung dengan
D (70m),
Gedung C terhubung dengan
D (70m),

Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 7
Jumlah edge yang tersedia : 4
Menu:
1. Add Edge
2. Remove Edge
3. Degree
4. Print Graph
5. Cek Edge
6. Update jarak
7. Hitung edge
8. Exit
Pilih menu: 8
Keluar dari program.
```