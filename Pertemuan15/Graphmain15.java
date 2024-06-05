package Pertemuan15;

import java.util.Scanner;

public class Graphmain15 {
    public static void main(String[] args) throws Exception {
        Graph15 gedung = new Graph15(6);
        int menu;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update jarak");
            System.out.println("7. Hitung edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan asal : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan tujuan : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak : ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("Masukkan asal : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan : ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("Masukkan vertex : ");
                    int v = sc.nextInt();
                    gedung.degree(v);
                    break;

                case 4:
                    gedung.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan asal : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan : ");
                    tujuan = sc.nextInt();
                    gedung.cekTetangga(asal, tujuan);
                    break;

                case 8:
                    System.out.println("Keluar dari program.");
                    break;

                case 6:
                    System.out.print("Masukkan asal : ");
                    int asal1 = sc.nextInt();
                    System.out.print("Masukkan tujuan : ");
                    int tujuan1 = sc.nextInt();
                    System.out.print("Masukkan jarak : ");
                    int jarak1 = sc.nextInt();
                    gedung.updateJarak(asal1, tujuan1, jarak1);
                    break;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
                    break;
            }

        } while (menu != 8);

        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();

        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // gedung.cekTetangga(2, 3);
        // gedung.cekTetangga(2, 5);

        // GraphMatriks gdg = new GraphMatriks(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // System.out.println("Out-degree vertex A: " + gdg.outDegree(0));
        // System.out.println("In-degree vertex A: " + gdg.inDegree(0));
        // System.out.println("Degree vertex A: " + gdg.degree(0));
    }

}
